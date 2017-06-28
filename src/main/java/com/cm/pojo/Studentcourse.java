package com.cm.pojo;

import javax.persistence.*;

/**
 * Created by GSY on 2017/6/28.
 */
@Entity
public class Studentcourse {
    private int scid;
    private Course courseByCid;
    private Student studentBySid;

    @Id
    @Column(name = "scid")
    public int getScid() {
        return scid;
    }

    public void setScid(int scid) {
        this.scid = scid;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Studentcourse that = (Studentcourse) o;

        if (scid != that.scid) return false;

        return true;
    }

    @Override
    public int hashCode() {
        return scid;
    }

    @ManyToOne
    @JoinColumn(name = "cid", referencedColumnName = "cid", nullable = false)
    public Course getCourseByCid() {
        return courseByCid;
    }

    public void setCourseByCid(Course courseByCid) {
        this.courseByCid = courseByCid;
    }

    @ManyToOne
    @JoinColumn(name = "sid", referencedColumnName = "sid", nullable = false)
    public Student getStudentBySid() {
        return studentBySid;
    }

    public void setStudentBySid(Student studentBySid) {
        this.studentBySid = studentBySid;
    }
}
