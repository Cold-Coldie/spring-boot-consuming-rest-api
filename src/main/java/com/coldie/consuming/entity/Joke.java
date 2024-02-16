package com.coldie.consuming.entity;

public class Joke {
    private Long id;
    private String type;
    private String setup;
    private String punchline;

    public Joke() {
    }

    public Joke(Long id, String type, String setup, String punchline) {
        this.id = id;
        this.type = type;
        this.setup = setup;
        this.punchline = punchline;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setSetup(String setup) {
        this.setup = setup;
    }

    public String getSetup() {
        return setup;
    }

    public void setPunchline(String punchline) {
        this.punchline = punchline;
    }

    public String getPunchline() {
        return punchline;
    }

    @Override
    public String toString() {
        return "Joke{" +
                "id=" + id +
                ", type='" + type + '\'' +
                ", setup='" + setup + '\'' +
                ", punchline='" + punchline + '\'' +
                '}';
    }
}
