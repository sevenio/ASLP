package com.therapy.speech.telugu;

import java.util.ArrayList;

public class ArticulationData {

    private int letterId;
    private ArrayList<ArticulationDataItem> initialList, medialList, finalList;

    public ArticulationData(int letterId, ArrayList<ArticulationDataItem> initialList, ArrayList<ArticulationDataItem> medialList, ArrayList<ArticulationDataItem> finalList) {

        this.letterId = letterId;
        this.initialList = initialList;
        this.medialList = medialList;
        this.finalList = finalList;
    }

    public static class Builder {

        private int letterId;
        private ArrayList<ArticulationDataItem> initialList, medialList, finalList;

        public Builder setLetterId(int letterId) {
            this.letterId = letterId;
            return this;
        }

        public Builder setInitialList(ArrayList<ArticulationDataItem> initialList) {
            this.initialList = initialList;
            return this;
        }

        public Builder setMedialList(ArrayList<ArticulationDataItem> medialList) {
            this.medialList = medialList;
            return this;
        }

        public Builder setFinalList(ArrayList<ArticulationDataItem> finalList) {
            this.finalList = finalList;
            return this;
        }

        public ArticulationData build() {
            return new ArticulationData(letterId, initialList, medialList, finalList);
        }


    }

    public int getLetterId() {
        return letterId;
    }

    public void setLetterId(int letterId) {
        this.letterId = letterId;
    }

    public ArrayList<ArticulationDataItem> getInitialList() {
        return initialList;
    }

    public void setInitialList(ArrayList<ArticulationDataItem> initialList) {
        this.initialList = initialList;
    }

    public ArrayList<ArticulationDataItem> getMedialList() {
        return medialList;
    }

    public void setMedialList(ArrayList<ArticulationDataItem> medialList) {
        this.medialList = medialList;
    }

    public ArrayList<ArticulationDataItem> getFinalList() {
        return finalList;
    }

    public void setFinalList(ArrayList<ArticulationDataItem> finalList) {
        this.finalList = finalList;
    }


}


