package com.example.gangadhar.aslpapp;


public class ArticulationDataItem {
    public int getmLetterId() {
        return mLetterId;
    }

    public void setmLetterId(int mLetterId) {
        this.mLetterId = mLetterId;
    }

    public int getmAudioId() {
        return mAudioId;
    }

    public void setmAudioId(int mAudioId) {
        this.mAudioId = mAudioId;
    }

    public int getmImageId() {
        return mImageId;
    }

    public void setmImageId(int mImageId) {
        this.mImageId = mImageId;
    }

    private int mLetterId;
    private int mAudioId, mImageId;

    public static class Builder {
        private int mLetterId;
        private int mAudioId, mImageId;

        public Builder setLetterId(int word) {
            this.mLetterId = word;
            return this;
        }

        public Builder setAudioId(int audioId) {
            this.mAudioId = audioId;
            return this;
        }

        public Builder setImageId(int imageId) {
            this.mImageId = imageId;
            return this;
        }

        public ArticulationDataItem build() {
            return new ArticulationDataItem(mLetterId, mAudioId, mImageId);
        }


    }

    public ArticulationDataItem(int letterId, int audioId, int imageId) {
        this.mLetterId = letterId;
        this.mAudioId = audioId;
        this.mImageId = imageId;
    }
}
