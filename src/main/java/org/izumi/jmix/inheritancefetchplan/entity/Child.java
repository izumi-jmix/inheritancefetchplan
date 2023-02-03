package org.izumi.jmix.inheritancefetchplan.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;
import javax.persistence.Version;

import io.jmix.core.metamodel.annotation.DependsOnProperties;
import io.jmix.core.metamodel.annotation.InstanceName;
import io.jmix.core.metamodel.annotation.JmixEntity;

@JmixEntity
@Table(name = "CHILD")
@Entity
@PrimaryKeyJoinColumn(name = "ID")
public class Child extends Base {
    @Column(name = "VERSION", nullable = false)
    @Version
    private Integer version;

    @Column(name = "CHILD_NAME")
    private String childName;

    @DependsOnProperties("childName")
    @InstanceName
    public String instanceName() {
        return childName;
    }

    public String getChildName() {
        return childName;
    }

    public void setChildName(String childName) {
        this.childName = childName;
    }

    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }
}