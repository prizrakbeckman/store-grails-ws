package model

import com.fasterxml.jackson.annotation.JsonProperty
import io.micronaut.core.annotation.Introspected

@Introspected
class OpeningHour {

    //To show csv content
    String changedProperties

    float dayOfWeek;

    String from1;

    String to1;


    public OpeningHour(){

    }


    @Override
    public String toString() {
        return "OpeningHour{" +
                "id=" + id +
                ", version=" + version +
                ", changedProperties='" + changedProperties + '\'' +
                ", dayOfWeek=" + dayOfWeek +
                ", from1='" + from1 + '\'' +
                ", to1='" + to1 + '\'' +
                ", org_grails_datastore_mapping_dirty_checking_DirtyCheckable__$changedProperties=" + org_grails_datastore_mapping_dirty_checking_DirtyCheckable__$changedProperties +
                ", org_grails_datastore_gorm_GormValidateable__skipValidate=" + org_grails_datastore_gorm_GormValidateable__skipValidate +
                ", org_grails_datastore_gorm_GormValidateable__errors=" + org_grails_datastore_gorm_GormValidateable__errors +
                '}';
    }
}
