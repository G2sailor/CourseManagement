package com.cm.pojo;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Collection;

/**
 * Created by GSY on 2017/6/28.
 */
@Entity
public class Course {
    private int cid;
    private String coursename;
    private String coursebyteacher;
    private Timestamp coursestarttime;
    private Timestamp courseendtime;
    private String coursepoint;
    private int coursegalleryful;
    private Collection<Studentcourse> studentcoursesByCid;

    @Id
    @Column(name = "cid")
    public int getCid() {
        return cid;
    }

    public void setCid(int cid) {
        this.cid = cid;
    }

    @Basic
    @Column(name = "coursename")
    public String getCoursename() {
        return coursename;
    }

    public void setCoursename(String coursename) {
        this.coursename = coursename;
    }

    @Basic
    @Column(name = "coursebyteacher")
    public String getCoursebyteacher() {
        return coursebyteacher;
    }

    public void setCoursebyteacher(String coursebyteacher) {
        this.coursebyteacher = coursebyteacher;
    }

    @Basic
    @Column(name = "coursestarttime")
    public Timestamp getCoursestarttime() {
        return coursestarttime;
    }

    public void setCoursestarttime(Timestamp coursestarttime) {
        this.coursestarttime = coursestarttime;
    }

    @Basic
    @Column(name = "courseendtime")
    public Timestamp getCourseendtime() {
        return courseendtime;
    }

    public void setCourseendtime(Timestamp courseendtime) {
        this.courseendtime = courseendtime;
    }

    @Basic
    @Column(name = "coursepoint")
    public String getCoursepoint() {
        return coursepoint;
    }

    public void setCoursepoint(String coursepoint) {
        this.coursepoint = coursepoint;
    }

    @Basic
    @Column(name = "coursegalleryful")
    public int getCoursegalleryful() {
        return coursegalleryful;
    }

    public void setCoursegalleryful(int coursegalleryful) {
        this.coursegalleryful = coursegalleryful;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Course course = (Course) o;

        if (cid != course.cid) return false;
        if (coursegalleryful != course.coursegalleryful) return false;
        if (coursename != null ? !coursename.equals(course.coursename) : course.coursename != null) return false;
        if (coursebyteacher != null ? !coursebyteacher.equals(course.coursebyteacher) : course.coursebyteacher != null)
            return false;
        if (coursestarttime != null ? !coursestarttime.equals(course.coursestarttime) : course.coursestarttime != null)
            return false;
        if (courseendtime != null ? !courseendtime.equals(course.courseendtime) : course.courseendtime != null)
            return false;
        if (coursepoint != null ? !coursepoint.equals(course.coursepoint) : course.coursepoint != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = cid;
        result = 31 * result + (coursename != null ? coursename.hashCode() : 0);
        result = 31 * result + (coursebyteacher != null ? coursebyteacher.hashCode() : 0);
        result = 31 * result + (coursestarttime != null ? coursestarttime.hashCode() : 0);
        result = 31 * result + (courseendtime != null ? courseendtime.hashCode() : 0);
        result = 31 * result + (coursepoint != null ? coursepoint.hashCode() : 0);
        result = 31 * result + coursegalleryful;
        return result;
    }

    @OneToMany(mappedBy = "courseByCid")
    public Collection<Studentcourse> getStudentcoursesByCid() {
        return studentcoursesByCid;
    }

    public void setStudentcoursesByCid(Collection<Studentcourse> studentcoursesByCid) {
        this.studentcoursesByCid = studentcoursesByCid;
    }
}
