package com.example.playmusic_group;

import java.io.File;

public class BaiHat {
    private String TenBaiHat;
    private String TenCaSi;
    private int File;


    public String getTenCaSi() {
        return TenCaSi;
    }

    public void setTenCaSi(String tenCaSi) {
        TenCaSi = tenCaSi;
    }

    public BaiHat(String tenBaiHat, String tenCaSi, int file) {
        TenBaiHat = tenBaiHat;
        TenCaSi = tenCaSi;
        File = file;
    }

    public int getFile() {
        return File;
    }

    public void setFile(int file) {
        File = file;
    }

    public String getTenBaiHat() {
        return TenBaiHat;
    }

    public void setTenBaiHat(String tenBaiHat) {
        TenBaiHat = tenBaiHat;
    }
}
