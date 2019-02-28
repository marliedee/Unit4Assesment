package org.pursuit.unit_04_assessment.model;

public class Echinoderms {
    private String animal;
    private String image;
    private String wiki;

    public Echinoderms(String animal, String image, String wiki) {
        this.animal = animal;
        this.image = image;
        this.wiki = wiki;
    }

    public String getAnimal() {
        return animal;
    }

    public String getImage() {
        return image;
    }

    public String getWiki() {
        return wiki;
    }
}
