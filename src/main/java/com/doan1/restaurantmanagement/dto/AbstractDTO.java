package com.doan1.restaurantmanagement.dto;

import java.util.ArrayList;
import java.util.List;

public class AbstractDTO<T> {
    private Long id;
    private List<T> listResutl = new ArrayList<>();

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public List<T> getListResutl() {
        return listResutl;
    }

    public void setListResutl(List<T> listResutl) {
        this.listResutl = listResutl;
    }
}
