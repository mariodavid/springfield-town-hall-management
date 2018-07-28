# springfield-town-hall-management

This CUBA example shows how to have dependent tables in order to select a particular value of a M:1:N association.

## Example domain model

![Domain model](https://github.com/mariodavid/springfield-town-hall-management/blob/master/img/domain-model.png)


## Filtering between dependent grids

The key point of this example shows how to let two grids be dependent on each other. In this case it is the grids:

* Town Hall
* Workgroup

First - a town hall should be selected. After that the second grid: "Workgroup" should only contain the workgroups
that are associated to that particular town hall, that was selected in the first grid.

The magic happens in [employee-assign-workgroup.xml](https://github.com/mariodavid/springfield-town-hall-management/blob/master/modules/web/src/de/diedavids/cuba/cedg/web/employee/example1/employee-assign-workgroup.xml):

```
<collectionDatasource id="allTownHallsDs"
                      class="de.diedavids.cuba.cedg.entity.TownHall"
                      view="_minimal">
    <query>
        <![CDATA[select e from cedg$TownHall e]]>
    </query>
</collectionDatasource>
<collectionDatasource id="allWorkgroupsOfTownHallDs"
                      class="de.diedavids.cuba.cedg.entity.Workgroup"
                      view="workgroup-view">
    <query>
        <![CDATA[select e from cedg$Workgroup e where e.townHall.id = :ds$allTownHallsDs]]>
    </query>
</collectionDatasource>
```


The second collection datasource has a `:ds` reference to the the first datasource. CUBA will therefore filter out
the correct workgroups for this particular town hall. See the result:

## Application result

![app result](https://github.com/mariodavid/springfield-town-hall-management/blob/master/img/app-overview.gif)