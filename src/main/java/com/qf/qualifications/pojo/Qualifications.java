package com.qf.qualifications.pojo;

public class Qualifications {
    private int qualifyId;
    private String qualifyName;

    @Override
    public String toString() {
        return "Qualifications{" +
                "qualifyId=" + qualifyId +
                ", qualifyName='" + qualifyName + '\'' +
                '}';
    }

    public int getQualifyId() {
        return qualifyId;
    }

    public void setQualifyId(int qualifyId) {
        this.qualifyId = qualifyId;
    }

    public String getQualifyName() {
        return qualifyName;
    }

    public void setQualifyName(String qualifyName) {
        this.qualifyName = qualifyName;
    }
}
