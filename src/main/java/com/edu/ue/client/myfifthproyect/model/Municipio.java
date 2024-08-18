package com.edu.ue.client.myfifthproyect.model;

public class Municipio {
    private String region;
    private String municipio;
    private String departamento;
    private int coddepartamento;

    public Municipio(String region, String municipio, String departamento, int coddepartamento) {
        this.region = region;
        this.municipio = municipio;
        this.departamento = departamento;
        this.coddepartamento = coddepartamento;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getMunicipio() {
        return municipio;
    }

    public void setMunicipio(String municipio) {
        this.municipio = municipio;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public int getCoddepartamento() {
        return coddepartamento;
    }

    public void setCoddepartamento(int coddepartamento) {
        this.coddepartamento = coddepartamento;
    }

    

}
