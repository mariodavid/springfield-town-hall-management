package de.diedavids.cuba.cedg.entity;

import javax.persistence.Entity;
import javax.persistence.Table;
import com.haulmont.cuba.core.entity.annotation.Lookup;
import com.haulmont.cuba.core.entity.annotation.LookupType;
import com.haulmont.cuba.security.entity.User;
import javax.persistence.Column;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import com.haulmont.cuba.core.entity.StandardEntity;
import com.haulmont.chile.core.annotations.NamePattern;
import java.util.List;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

@NamePattern("%s|name")
@Table(name = "CEDG_EMPLOYEE")
@Entity(name = "cedg$Employee")
public class Employee extends StandardEntity {
    private static final long serialVersionUID = 1991290558388065960L;

    @Column(name = "NAME")
    protected String name;

    @Lookup(type = LookupType.DROPDOWN, actions = {"lookup"})
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "SYSTEM_USER_ID")
    protected com.haulmont.cuba.security.entity.User systemUser;

    @JoinTable(name = "CEDG_TOWN_HALL_EMPLOYEE_LINK",
        joinColumns = @JoinColumn(name = "EMPLOYEE_ID"),
        inverseJoinColumns = @JoinColumn(name = "TOWN_HALL_ID"))
    @ManyToMany
    protected List<TownHall> townHalls;

    @JoinTable(name = "CEDG_EMPLOYEE_WORKGROUP_LINK",
        joinColumns = @JoinColumn(name = "EMPLOYEE_ID"),
        inverseJoinColumns = @JoinColumn(name = "WORKGROUP_ID"))
    @ManyToMany
    protected List<Workgroup> workgroups;

    public void setWorkgroups(List<Workgroup> workgroups) {
        this.workgroups = workgroups;
    }

    public List<Workgroup> getWorkgroups() {
        return workgroups;
    }


    public void setTownHalls(List<TownHall> townHalls) {
        this.townHalls = townHalls;
    }

    public List<TownHall> getTownHalls() {
        return townHalls;
    }


    public com.haulmont.cuba.security.entity.User getSystemUser() {
        return systemUser;
    }

    public void setSystemUser(com.haulmont.cuba.security.entity.User systemUser) {
        this.systemUser = systemUser;
    }


    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }


}