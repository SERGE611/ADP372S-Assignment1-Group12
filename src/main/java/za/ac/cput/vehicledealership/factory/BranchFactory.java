/*
 * BranchFactory.java
 * This is the Factory for Branch
 * Author: Simphiwe kahlana(220162891)
 * Date : March 2023
 * */


package za.ac.cput.vehicledealership.factory;

import za.ac.cput.vehicledealership.domain.Branch;
import za.ac.cput.vehicledealership.domain.Location;
import za.ac.cput.vehicledealership.util.Helper;

public class BranchFactory {
    public static Branch createBranch(String branchName, int yearOpened, Location location) {

        if (Helper.isNullOrEmpty(branchName) || yearOpened <= 0) {
            return null;
        }
        Location createdLocation = LocationFactory.createLocation(location.getStreetNumber(), location.getStreetName(),
                location.getCity(), location.getPostalCode(), location.getProvince());

        return new Branch.BranchBuilder()
                .setBranchId(Helper.generateId())
                .setBranchName(branchName)
                .setYearOpened(yearOpened)
                .setLocation(createdLocation)
                .build();

    }
}
