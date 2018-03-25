package com.sei.achmadtaufikrizki_1202150071_modul5;

import android.provider.BaseColumns;

/**
 * Created by sei on 24/03/2018.
 */

public class TodoPointer {
    private TodoPointer(){}
    public static final class TodoEntry implements BaseColumns {
        public static final String TABLE_NAME = "TodoActivity";
        public static final String COLUMN_NAMA_ = "namaActivity";
        public static final String COLUMN_DESKRIPSI = "deskripsi";
        public static final String COLUMN_PRIOTIRTY = "priority";
    }

}
