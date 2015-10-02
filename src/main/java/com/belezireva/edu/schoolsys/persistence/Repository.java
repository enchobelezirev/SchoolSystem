package com.belezireva.edu.schoolsys.persistence;

import java.util.List;

public interface Repository<T> {
    void add(T item);
    T get(String... params);
    void update(T item);
    void delete(T item);
    List<T> getAll();
}
