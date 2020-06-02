package com.uberall.storeservice

import grails.plugins.rest.client.RestBuilder
import model.FullResponse
import grails.config.Config
import grails.core.support.GrailsConfigurationAware
import io.micronaut.http.client.BlockingHttpClient
import io.micronaut.http.client.HttpClient
import io.micronaut.http.client.exceptions.HttpClientResponseException

class StoreAppService implements GrailsConfigurationAware {

    String appid, url
    BlockingHttpClient client

    @Override
    void setConfiguration(Config co) {
        appid = co.getProperty('storeapp.appid', String)
        url = co.getProperty('storeapp.url', String)
        setupHttpClient('');

    }

    void setupHttpClient(String url) {
        this.client = HttpClient.create(url.toURL()).toBlocking()
    }

    FullResponse allStores(int max) {
        try {
            def rest = new RestBuilder()
            def response = rest.get(url+max){
                header("privateKey",appid)
            }
            FullResponse fullResponse = response.json

            return fullResponse

        } catch (HttpClientResponseException e) {

            System.out.println(e.getMessage() + " " );
            return null

        }catch(Exception ex){

            System.out.println(ex.getMessage())
            return null

        }
    }

}
