package com.hbsis.qvrest.model;

public class BaseCsvModel implements CsvModel {


    private boolean ended;

    public BaseCsvModel(boolean ended) {
        this.ended = ended;
    }

    Integer getInt(String value) {
        if (value == null || value.isEmpty()) {
            return null;
        }

        return Integer.parseInt(value);
    }

    boolean getBoolean(String value) {
        return value != null && !value.isEmpty() && (value.trim().equals("S") || value.trim().equals("s"));
    }

    Long getLong(String value) {
        if (value == null || value.isEmpty()) {
            return null;
        }

        return Long.parseLong(value);
    }

    Double getDouble(String value) {
        if (value == null || value.isEmpty()) {
            return null;
        }
        return Double.parseDouble(value);
    }

    @Override
    public boolean ended() {
        return ended;
    }
}
