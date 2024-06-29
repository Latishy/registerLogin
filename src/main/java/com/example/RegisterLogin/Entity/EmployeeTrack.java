package com.example.RegisterLogin.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.util.*;

@AllArgsConstructor
@NoArgsConstructor
@Entity
//@Table(name="EmployeeTrack")
//@Table

@Table(name="employeetrack")
public class EmployeeTrack {
        @Id
        @Column(name = "id", length = 45)
        @GeneratedValue(strategy = GenerationType.AUTO)
        private int Nid;
        @Column(name = "manager_name", length = 255)
        private String managername;
        @Column(name = "stream_role", length = 255)
        private String streamrole;
        @Column(name = "hired", length = 255)
        private int hired;

        @Column(name = "ntb", length = 255)
        private int ntb;

//    public EmployeeTrack() {
//    }
//
//    public EmployeeTrack(int Nid, String managername, String streamrole, int hired, int ntb) {
//        this.Nid = Nid;
//        this.managername = managername;
//        this.streamrole = streamrole;
//        this.hired = hired;
//        this.ntb = ntb;
//    }


    public int getNid() {
        return Nid;
    }

    public void setNid(int nid) {
        Nid = nid;
    }

    public String getManagername() {
        return managername;
    }

    public void setManagername(String managername) {
        this.managername = managername;
    }

    public String getStreamrole() {
        return streamrole;
    }

    public void setStreamrole(String streamrole) {
        this.streamrole = streamrole;
    }

    public int getHired() {
        return hired;
    }

    public void setHired(int hired) {
        this.hired = hired;
    }

    public int getNtb() {
        return ntb;
    }

    public void setNtb(int ntb) {
        this.ntb = ntb;
    }

//    @Override
//    public String toString() {
//        return "EmployeeTrack{" +
//                "Nid=" + Nid +
//                ", managername='" + managername + '\'' +
//                ", streamrole='" + streamrole + '\'' +
//                ", hired=" + hired +
//                ", ntb=" + ntb +
//                '}';
//    }
}

