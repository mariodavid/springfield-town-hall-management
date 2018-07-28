package de.diedavids.cuba.cedg.entity;

import javax.persistence.Entity;
import javax.persistence.Table;
import com.haulmont.cuba.core.entity.annotation.Lookup;
import com.haulmont.cuba.core.entity.annotation.LookupType;
import javax.persistence.Column;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotNull;
import com.haulmont.cuba.core.entity.StandardEntity;
import com.haulmont.chile.core.annotations.NamePattern;
import java.util.List;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

@NamePattern("%s|name")
@Table(name = "CEDG_WORKGROUP")
@Entity(name = "cedg$Workgroup")
public class Workgroup extends StandardEntity {
    private static final long serialVersionUID = -8428365568105732890L;

    @Column(name = "NAME")
    protected String name;

    @Lookup(type = LookupType.DROPDOWN, actions = {"lookup"})
    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "TOWN_HALL_ID")
    protected TownHall townHall;



    @JoinTable(name = "CEDG_EMPLOYEE_WORKGROUP_LINK",
        joinColumns = @JoinColumn(name = "WORKGROUP_ID"),
        inverseJoinColumns = @JoinColumn(name = "EMPLOYEE_ID"))
    @ManyToMany
    protected List<Employee> employees;

    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }

    public List<Employee> getEmployees() {
        return employees;
    }


    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setTownHall(TownHall townHall) {
        this.townHall = townHall;
    }

    public TownHall getTownHall() {
        return townHall;
    }


}