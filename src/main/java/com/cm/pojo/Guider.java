package com.cm.pojo;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Created by GSY on 2017/6/28.
 */
@Entity
public class Guider {
    private int gid;
    private String guidename;
    private String guidepassword;

    @Id
    @Column(name = "gid")
    public int getGid() {
        return gid;
    }

    public void setGid(int gid) {
        this.gid = gid;
    }

    @Basic
    @Column(name = "guidename")
    public String getGuidename() {
        return guidename;
    }

    public void setGuidename(String guidename) {
        this.guidename = guidename;
    }

    @Basic
    @Column(name = "guidepassword")
    public String getGuidepassword() {
        return guidepassword;
    }

    public void setGuidepassword(String guidepassword) {
        this.guidepassword = guidepassword;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Guider guider = (Guider) o;

        if (gid != guider.gid) return false;
        if (guidename != null ? !guidename.equals(guider.guidename) : guider.guidename != null) return false;
        if (guidepassword != null ? !guidepassword.equals(guider.guidepassword) : guider.guidepassword != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = gid;
        result = 31 * result + (guidename != null ? guidename.hashCode() : 0);
        result = 31 * result + (guidepassword != null ? guidepassword.hashCode() : 0);
        return result;
    }
}
