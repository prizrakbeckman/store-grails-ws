package model

import grails.rest.Resource

@Resource(uri='/location/allstores', formats=['json', 'xml'])
class FullResponse {

    String status

    Response response

    public FullResponse(){

    }

}
