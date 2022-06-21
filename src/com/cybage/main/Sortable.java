package com.cybage.main;

public interface Sortable<T,I> {
    void sortAscending(T students[],I count);
    void sortDescending(T students[],I count);
}
