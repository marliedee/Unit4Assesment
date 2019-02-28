package org.pursuit.unit_04_assessment.model;

import java.util.List;

public class EchinodermsWrapper {
    private String status;
    private List<Echinoderms> message;

    public EchinodermsWrapper(String status, List<Echinoderms> message) {
        this.status = status;
        this.message = message;
    }

    public String getStatus() {
        return status;
    }

    public List<Echinoderms> getMessage() {
        return message;
    }
}
