package com.hbsis.qvrest.model;

import com.hbsis.qvrest.annotations.CsvDocument;

@CsvDocument(path = "C:\\temp\\qv\\", fileName = "hierarquia")
public class Hierarquia extends BaseCsvModel {


    private Integer codGdd;
    private String nomGdd;

    private Integer codGv;
    private String nomGv;

    private String nomSupervisor;

    private Integer codVendedor;
    private String nomVendedor;

    private Integer codUnidade;
    private String nomUnidade;

    private Integer codGeo;
    private String nomGeo;

    private Integer codBr;

    private Integer codSupervisor;

    private String nomBr;

    public Hierarquia(boolean ended) {
        super(ended);
    }

    public Hierarquia(String[] fields) {
        super(false);
        int i = -1;
        codGdd = getInt(fields[++i]);
        nomGdd = fields[++i];
        codGv = getInt(fields[++i]);
        nomGv = fields[++i];
        nomSupervisor = fields[++i];
        codVendedor = getInt(fields[++i]);
        nomVendedor = fields[++i];
        codUnidade = getInt(fields[++i]);
        nomUnidade = fields[++i];
        codGeo = getInt(fields[++i]);
        nomGeo = fields[++i];

        codBr = getInt(fields[++i]);
        codSupervisor = getInt(fields[++i]);
        nomBr = fields[++i];
    }

    public Integer getCodGdd() {
        return codGdd;
    }

    public void setCodGdd(Integer codGdd) {
        this.codGdd = codGdd;
    }

    public String getNomGdd() {
        return nomGdd;
    }

    public void setNomGdd(String nomGdd) {
        this.nomGdd = nomGdd;
    }

    public Integer getCodGv() {
        return codGv;
    }

    public void setCodGv(Integer codGv) {
        this.codGv = codGv;
    }

    public String getNomGv() {
        return nomGv;
    }

    public void setNomGv(String nomGv) {
        this.nomGv = nomGv;
    }

    public String getNomSupervisor() {
        return nomSupervisor;
    }

    public void setNomSupervisor(String nomSupervisor) {
        this.nomSupervisor = nomSupervisor;
    }

    public Integer getCodVendedor() {
        return codVendedor;
    }

    public void setCodVendedor(Integer codVendedor) {
        this.codVendedor = codVendedor;
    }

    public String getNomVendedor() {
        return nomVendedor;
    }

    public void setNomVendedor(String nomVendedor) {
        this.nomVendedor = nomVendedor;
    }

    public Integer getCodUnidade() {
        return codUnidade;
    }

    public void setCodUnidade(Integer codUnidade) {
        this.codUnidade = codUnidade;
    }

    public String getNomUnidade() {
        return nomUnidade;
    }

    public void setNomUnidade(String nomUnidade) {
        this.nomUnidade = nomUnidade;
    }

    public Integer getCodGeo() {
        return codGeo;
    }

    public void setCodGeo(Integer codGeo) {
        this.codGeo = codGeo;
    }

    public String getNomGeo() {
        return nomGeo;
    }

    public void setNomGeo(String nomGeo) {
        this.nomGeo = nomGeo;
    }

    public Integer getCodBr() {
        return codBr;
    }

    public void setCodBr(Integer codBr) {
        this.codBr = codBr;
    }

    public Integer getCodSupervisor() {
        return codSupervisor;
    }

    public void setCodSupervisor(Integer codSupervisor) {
        this.codSupervisor = codSupervisor;
    }

    public String getNomBr() {
        return nomBr;
    }

    public void setNomBr(String nomBr) {
        this.nomBr = nomBr;
    }
}