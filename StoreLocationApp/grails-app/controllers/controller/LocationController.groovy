package controller

import grails.converters.JSON
import model.FullResponse
import com.uberall.storeservice.StoreAppService
import grails.rest.RestfulController
import groovy.transform.CompileStatic

@CompileStatic
class LocationController extends RestfulController {

    StoreAppService storeAppService

    LocationController() {
        super(FullResponse)
    }


    def allstores() {
        FullResponse response = storeAppService.allStores(parseMaxParam())
        JSON.use('deep')
        if("csv".equalsIgnoreCase(getTypeResponse()))
            render contentType:'text/plain',model: [location: response.response.locations],text:response.response.locations
        else
            render response.response.locations as JSON
    }

    def allstorescsv(){
        FullResponse response1 = storeAppService.allStores(parseMaxParam())
        response.setHeader "Content-disposition", "attachment; filename=allstores.csv"
        response.contentType = 'text/csv'
        response.outputStream << response1.response.locations
        response.outputStream.flush()
    }

    private int parseMaxParam(){
        if(params.max==null)
            return 10
        return Integer.parseInt(params.max.toString())

    }

    private String getTypeResponse(){

        if("csv".equalsIgnoreCase(params.typeResponse.toString())){
            return "csv"
        }
        return "json"

    }

}
