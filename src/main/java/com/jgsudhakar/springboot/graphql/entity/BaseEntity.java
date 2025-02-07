package com.jgsudhakar.springboot.graphql.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.extern.log4j.Log4j2;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.io.Serializable;
import java.time.ZonedDateTime;

/**
 * @Author : Sudhakar Tangellapalli
 * @File : com.jgsudhakar.springboot.microservice.cqrs.entity.BaseEntity
 * @Date : 02/02/2025
 *
 * This is a Base Entity class which should be extends in all the entity classes
 */
@Data
@MappedSuperclass
@EntityListeners(AuditingEntityListener.class)
@Log4j2
public class BaseEntity implements Serializable {

    private static final long serialVersionUID = -421542565496833316L;

    @Column(name="CREATED_BY",updatable = false)
    @CreatedBy
    private String createdBy;

    @Column(name="CREATED_DATE",updatable = false)
    @CreatedDate
    private ZonedDateTime createdDate;

    @Column(name="MODIFIED_BY",insertable = false)
    @LastModifiedBy
    private String modifiedBy;

    @Column(name="MODIFIED_DATE",insertable = false)
    @LastModifiedDate
    private ZonedDateTime modifiedDate;

    @Version
    @Column(name="VERSION$")
    private Integer version;


    // --------------------------------------------------------------------------------------------------------------
    //
    // JPA Lifecycle Callback Methods
    //
    // --------------------------------------------------------------------------------------------------------------

    /**
     *  Initializes the last action and status change date of the entity on persist of the entity to the DB.
     */
    @PrePersist
    public void prePersist() {
        setCreatedDate(ZonedDateTime.now());
        if (version == null)
            version = 1;

        log.debug("[prePersist] {}", this);
    }

    /**
     *  Updates the appropriate last action of the entity on update of the entity to the DB.
     */
    @PreUpdate
    public void preUpdate() {
        if (version == null)
            version = 1;
        else
            version++;

        log.debug("[preUpdate] {}", this);
    }

    /**
     *  Updates the appropriate last action of the entity on delete of the entity from the DB.
     */
    @PreRemove
    public void preRemove() {
        log.debug("[preRemove] {}", this);
    }


}
