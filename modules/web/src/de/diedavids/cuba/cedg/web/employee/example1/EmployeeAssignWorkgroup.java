package de.diedavids.cuba.cedg.web.employee.example1;

import com.haulmont.cuba.gui.components.AbstractEditor;
import com.haulmont.cuba.gui.components.GroupBoxLayout;
import com.haulmont.cuba.gui.components.Table;
import com.haulmont.cuba.gui.data.CollectionDatasource;
import com.haulmont.cuba.gui.data.Datasource;
import de.diedavids.cuba.cedg.entity.Employee;
import de.diedavids.cuba.cedg.entity.TownHall;
import de.diedavids.cuba.cedg.entity.Workgroup;

import javax.inject.Inject;
import java.util.Map;
import java.util.Set;
import java.util.UUID;

public class EmployeeAssignWorkgroup extends AbstractEditor<Employee> {

    @Inject
    protected CollectionDatasource<Workgroup, UUID> workgroupsDs;

    @Inject
    protected CollectionDatasource<TownHall, UUID> townHallsDs;


    @Inject
    protected Table<TownHall> townHallsTable;


    @Inject
    protected Table<Workgroup> workgroupsTable;

    @Inject
    protected CollectionDatasource<TownHall, UUID> allTownHallsDs;

    @Inject
    protected GroupBoxLayout workgroupsBox;

    @Override
    public void init(Map<String, Object> params) {
        super.init(params);
        workgroupsBox.setVisible(false);

        allTownHallsDs.addItemChangeListener(e -> {
            workgroupsBox.setVisible(true);
            workgroupsBox.setCaption(formatMessage("workgroupsForTownHall", e.getItem().getName()));
        });
    }

    @Override
    protected void postInit() {
        super.postInit();
        setCaption(formatMessage("editorCaption", getItem().getName()));
    }


    @Override
    protected boolean preCommit() {

        Set<TownHall> townHallsToAdd = townHallsTable.getSelected();

        for (TownHall townHall : townHallsToAdd) {
            if (!townHallsDs.containsItem(townHall.getId())) {
                townHallsDs.addItem(townHall);
            }
        }

        Set<Workgroup> workgroupsToAdd = workgroupsTable.getSelected();

        for (Workgroup workgroup : workgroupsToAdd) {
            if (!workgroupsDs.containsItem(workgroup.getId())) {
                workgroupsDs.addItem(workgroup);
            }
        }



        return true;
    }
}