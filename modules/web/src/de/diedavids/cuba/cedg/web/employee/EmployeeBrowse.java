package de.diedavids.cuba.cedg.web.employee;

import com.haulmont.cuba.gui.WindowManager;
import com.haulmont.cuba.gui.components.AbstractLookup;
import com.haulmont.cuba.gui.components.GroupTable;
import de.diedavids.cuba.cedg.entity.Employee;

import javax.inject.Inject;

public class EmployeeBrowse extends AbstractLookup {

    @Inject
    protected GroupTable<Employee> employeesTable;

    public void assignWorkgroup() {

        Employee employee = employeesTable.getSingleSelected();

        openEditor("cedg$Employee.assignWorkgroup", employee, WindowManager.OpenType.DIALOG);
    }
}