package model


class Location implements Serializable {

    //To show csv content
    String changedProperties

    String identifier

    float id

    static hasMany = [ openingHours: OpeningHour, specialOpeningHours: OpeningHour]

    String country

    float lat

    float lng

    String dateCreated

    String lastUpdated

    String name

    String street

    String streetNo

    String streetAndNumber

    String addressExtra

    String zip

    String city

    String cellphone

    String fax

    String website

    String email

    String descriptionShort

    String descriptionLong

    String openingHoursNotes

    String lastSyncStarted


    String imprint

    boolean addressDisplay

    boolean autoSync

    boolean skipFacebookPicturesUpdate

    String phone

    String status

    String cleansingStatus

    String cleansingInvalidDataReason

    List<String> keywords

    List<String> labels

    List<Double> categories

    boolean locationSyncable

    float businessId

    String socialPostId

    boolean hasFacebook

    String endDate

    float averageRating

//    List<OpeningHour> openingHours
//
//    List<OpeningHour> specialOpeningHours
//
//    List<Photo> photos

/*
    static hasMany = [photos: Photo, openingHours: OpeningHour, specialOpeningHours: OpeningHour]
*/

    boolean openNow

    List<String> attributes

    float activeDirectoriesCount

    float activeListingsCount

    float publishedListingsCount

    float profileCompleteness

    List<String> missingMandatoryFields

    List<String> directoriesMissingConnect

    float listingsInSync

    float listingsBeingUpdated

    float visibilityIndex

    float dataPoints

    String province

    boolean suggestionsForFieldsAvailable

    Location() {

    }


//    def out() {
//        return [
//                name           : name,
//                city           : city,
//                zip            : zip,
//                streetAndNumber: streetAndNumber,
//                openingHours   : openingHours,
//                keywords       : keywords,
//                lat            : lat,
//                lng            : lng]
//    }

    @Override
    public String toString() {
        return "Location{" +
                "version=" + version +
                ", specialOpeningHours=" + specialOpeningHours +
                ", openingHours=" + openingHours +
                ", identifier='" + identifier + '\'' +
                ", id=" + id +
                ", country='" + country + '\'' +
                ", lat=" + lat +
                ", lng=" + lng +
                ", dateCreated='" + dateCreated + '\'' +
                ", lastUpdated='" + lastUpdated + '\'' +
                ", name='" + name + '\'' +
                ", street='" + street + '\'' +
                ", streetNo='" + streetNo + '\'' +
                ", streetAndNumber='" + streetAndNumber + '\'' +
                ", addressExtra='" + addressExtra + '\'' +
                ", zip='" + zip + '\'' +
                ", city='" + city + '\'' +
                ", cellphone='" + cellphone + '\'' +
                ", fax='" + fax + '\'' +
                ", website='" + website + '\'' +
                ", email='" + email + '\'' +
                ", descriptionShort='" + descriptionShort + '\'' +
                ", descriptionLong='" + descriptionLong + '\'' +
                ", openingHoursNotes='" + openingHoursNotes + '\'' +
                ", lastSyncStarted='" + lastSyncStarted + '\'' +
                ", imprint='" + imprint + '\'' +
                ", addressDisplay=" + addressDisplay +
                ", autoSync=" + autoSync +
                ", skipFacebookPicturesUpdate=" + skipFacebookPicturesUpdate +
                ", phone='" + phone + '\'' +
                ", status='" + status + '\'' +
                ", cleansingStatus='" + cleansingStatus + '\'' +
                ", cleansingInvalidDataReason='" + cleansingInvalidDataReason + '\'' +
                ", keywords=" + keywords +
                ", labels=" + labels +
                ", categories=" + categories +
                ", locationSyncable=" + locationSyncable +
                ", businessId=" + businessId +
                ", socialPostId='" + socialPostId + '\'' +
                ", hasFacebook=" + hasFacebook +
                ", endDate='" + endDate + '\'' +
                ", averageRating=" + averageRating +
                ", openNow=" + openNow +
                ", attributes=" + attributes +
                ", activeDirectoriesCount=" + activeDirectoriesCount +
                ", activeListingsCount=" + activeListingsCount +
                ", publishedListingsCount=" + publishedListingsCount +
                ", profileCompleteness=" + profileCompleteness +
                ", missingMandatoryFields=" + missingMandatoryFields +
                ", directoriesMissingConnect=" + directoriesMissingConnect +
                ", listingsInSync=" + listingsInSync +
                ", listingsBeingUpdated=" + listingsBeingUpdated +
                ", visibilityIndex=" + visibilityIndex +
                ", dataPoints=" + dataPoints +
                ", province='" + province + '\'' +
                ", suggestionsForFieldsAvailable=" + suggestionsForFieldsAvailable +
                ", org_grails_datastore_mapping_dirty_checking_DirtyCheckable__$changedProperties=" + org_grails_datastore_mapping_dirty_checking_DirtyCheckable__$changedProperties +
                ", org_grails_datastore_gorm_GormValidateable__skipValidate=" + org_grails_datastore_gorm_GormValidateable__skipValidate +
                ", org_grails_datastore_gorm_GormValidateable__errors=" + org_grails_datastore_gorm_GormValidateable__errors +
                '}';
    }
}