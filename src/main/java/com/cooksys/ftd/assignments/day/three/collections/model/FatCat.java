package com.cooksys.ftd.assignments.day.three.collections.model;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

public class FatCat implements Capitalist {

    public FatCat(String name, int salary) {
        throw new NotImplementedException();
    }

    public FatCat(String name, int salary, FatCat owner) {
        throw new NotImplementedException();
    }

    /**
     * @return the name of the capitalist
     */
    @Override
    public String getName() {
        throw new NotImplementedException();
    }

    /**
     * @return the salary of the capitalist, in dollars
     */
    @Override
    public int getSalary() {
        throw new NotImplementedException();
    }

    /**
     * @return true if this element has a parent, or false otherwise
     */
    @Override
    public boolean hasParent() {
        throw new NotImplementedException();
    }

    /**
     * @return the parent of this element, or null if this represents the top of a hierarchy
     */
    @Override
    public FatCat getParent() {
        throw new NotImplementedException();
    }
}
