package com.slamgp.games.sportquiz.model;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "info")
public class GamesInfo {
    private String name;
    private String version;
    private String autor;

    public GamesInfo() {

    }

    public GamesInfo(String name, String version, String autor) {
        super();
        this.name = name;
        this.version = version;
        this.autor = autor;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }
}
