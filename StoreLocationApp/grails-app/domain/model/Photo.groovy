package model

import io.micronaut.core.annotation.Introspected


@Introspected
class Photo {

    //To show csv content
    String changedProperties

    float id

    String dateCreated

    String repoKey

    float locationId

    String description

    String identifier

    boolean main

    boolean logo

    String type

    String url

    String publicUrl

    String cropHeight

    String cropWidth

    String cropOffsetX

    String cropOffsetY


    public Photo(){

    }


    @Override
    public String toString() {
        return "Photo{" +
                "version=" + version +
                ", changedProperties='" + changedProperties + '\'' +
                ", id=" + id +
                ", dateCreated='" + dateCreated + '\'' +
                ", repoKey='" + repoKey + '\'' +
                ", locationId=" + locationId +
                ", description='" + description + '\'' +
                ", identifier='" + identifier + '\'' +
                ", main=" + main +
                ", logo=" + logo +
                ", type='" + type + '\'' +
                ", url='" + url + '\'' +
                ", publicUrl='" + publicUrl + '\'' +
                ", cropHeight='" + cropHeight + '\'' +
                ", cropWidth='" + cropWidth + '\'' +
                ", cropOffsetX='" + cropOffsetX + '\'' +
                ", cropOffsetY='" + cropOffsetY + '\'' +
                ", org_grails_datastore_mapping_dirty_checking_DirtyCheckable__$changedProperties=" + org_grails_datastore_mapping_dirty_checking_DirtyCheckable__$changedProperties +
                ", org_grails_datastore_gorm_GormValidateable__skipValidate=" + org_grails_datastore_gorm_GormValidateable__skipValidate +
                ", org_grails_datastore_gorm_GormValidateable__errors=" + org_grails_datastore_gorm_GormValidateable__errors +
                '}';
    }
}
