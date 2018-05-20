package com.sega.app.segaeducationfoundation.model;

public class AddressVO {
    private String streetName;
    private String municipality;
    private String zone;
    private String district;

    public AddressVO(String streetName, String municipality, String zone, String district) {
        this.streetName = streetName;
        this.municipality = municipality;
        this.zone =zone;
        this.district = district;
    }

    public AddressVO() {
    }

    public String getStreetName() {
        return streetName;
    }

    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }

    public String getMunicipality() {
        return municipality;
    }

    public void setMunicipality(String municipality) {
        this.municipality = municipality;
    }

    public String getZone() {
        return zone;
    }

    public void setZone(String zone) {
        this.zone = zone;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }
}
