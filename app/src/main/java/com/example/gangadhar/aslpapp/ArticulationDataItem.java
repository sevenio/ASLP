package com.example.gangadhar.aslpapp;


import android.os.Parcel;
import android.os.Parcelable;

public class ArticulationDataItem implements Parcelable {
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

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(mLetterId);
        parcel.writeInt(mAudioId);
        parcel.writeInt(mImageId);
    }
    protected ArticulationDataItem(Parcel in) {
        mLetterId = in.readInt();
        mAudioId = in.readInt();
        mImageId = in.readInt();
    }

    public static final Creator<ArticulationDataItem> CREATOR = new Creator<ArticulationDataItem>() {
        @Override
        public ArticulationDataItem createFromParcel(Parcel in) {
            return new ArticulationDataItem(in);
        }

        @Override
        public ArticulationDataItem[] newArray(int size) {
            return new ArticulationDataItem[size];
        }
    };

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
