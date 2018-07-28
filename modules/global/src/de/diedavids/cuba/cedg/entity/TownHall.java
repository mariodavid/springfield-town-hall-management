package de.diedavids.cuba.cedg.entity;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import com.haulmont.cuba.core.entity.StandardEntity;
import com.haulmont.chile.core.annotations.NamePattern;
import com.haulmont.chile.core.annotations.Composition;
import com.haulmont.cuba.core.entity.annotation.OnDelete;
import com.haulmont.cuba.core.global.DeletePolicy;
import javax.persistence.OneToMany;

@NamePattern("%s|name")
@Table(name = "CEDG_TOWN_HALL")
@Entity(name = "cedg$TownHall")
public class TownHall extends StandardEntity {
    private static final long serialVersionUID = -8888376897564340055L;

    @Column(name = "NAME")
    protected String name;

    @JoinTable(name = "CEDG_TOWN_HALL_EMPLOYEE_LINK",
        joinColumns = @JoinColumn(name = "TOWN_HALL_ID"),
        inverseJoinColumns = @JoinColumn(name = "EMPLOYEE_ID"))
    @ManyToMany
    protected List<Employee> employees;

    @Composition
    @OnDelete(DeletePolicy.CASCADE)
    @OneToMany(mappedBy = "townHall")
    protected List<Workgroup> workgroups;


    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }

    public List<Employee> getEmployees() {
        return employees;
    }


    public void setWorkgroups(List<Workgroup> workgroups) {
        this.workgroups = workgroups;
    }

    public List<Workgroup> getWorkgroups() {
        return workgroups;
    }


    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }


}