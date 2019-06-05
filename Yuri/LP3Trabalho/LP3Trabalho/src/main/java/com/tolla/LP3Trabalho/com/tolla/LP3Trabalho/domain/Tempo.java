package com.tolla.LP3Trabalho.com.tolla.LP3Trabalho.domain;

public class Tempo {
    private Integer id;
    private String name;
    private String state;
    private String country;
    private ClimaData data;

    public Tempo() {

    }

    public Tempo(Integer id, String name, String state, String country, ClimaData data) {
        this.id = id;
        this.name = name;
        this.state = state;
        this.country = country;
        this.data = data;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public ClimaData getData() {
        return data;
    }

    public void setData(ClimaData data) {
        this.data = data;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}
