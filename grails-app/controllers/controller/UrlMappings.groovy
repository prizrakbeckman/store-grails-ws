package controller

class UrlMappings {

    static mappings = {
        "/$controller/$action?/$id?(.$format)?"{
            constraints {
                // apply constraints here
            }
        }

        "/"(view:"/index")
        "500"(view:'/error')
        "404"(view:'/notFound')


        "/locations"(resources: 'location') {
            collection {
                '/allstores'(controller: 'location', action: 'allstores')
            }
        }

        "/locations"(resources: 'location') {
            collection {
                '/allstorescsv'(controller: 'location', action: 'allstorescsv')
            }
        }

    }
}
