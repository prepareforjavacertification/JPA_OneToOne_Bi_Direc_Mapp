package com.kalpana.atyourdoorstep.entity;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "USER_DETAILS")
public class UserDetails implements Serializable {

    @Id
    @Column(name = "USER_ID")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "user_id_gen")
    @SequenceGenerator(name = "user_id_gen", sequenceName = "USER_ID_SEQ1")
    private Long userId;

    @Column(name = "FULL_NAME")
    private String fullName;

    @OneToOne(mappedBy = "userDetails")
    private UserCredential userCredential;

    @Temporal(TemporalType.DATE)
    @Column(name = "SYS_CREATION_DATE")
    private Date sysCreationDate = new Date();

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Date getSysCreationDate() {
        return sysCreationDate;
    }

    public void setSysCreationDate(Date sysCreationDate) {
        this.sysCreationDate = sysCreationDate;
    }

    public UserCredential getUserCredential() {
        return userCredential;
    }

    public void setUserCredential(UserCredential userCredential) {
        this.userCredential = userCredential;
    }

}
