package com.hbsis.qvrest.model;

import com.hbsis.qvrest.annotations.CsvDocument;

@CsvDocument(path = "C:\\temp\\qv\\", fileName = "cobertura")
public class Cobertura extends BaseCsvModel {

    private Integer codGv;
    private Integer codSupervisor;
    private Integer codVendedor;
    private String ic;
    private String grupoProduto;
    private Double realDia;
    private Double realAcumulado;
    private Double metaMensal;
    private Integer codUnidade;
    private Integer codGeo;
    private Long codBr;
    private boolean isVde;

    public Cobertura(boolean ended) {
        super(ended);
    }

    public Cobertura(String[] fields) {
        super(false);
        int i = -1;
        codGv = getInt(fields[++i]);
        codSupervisor = getInt(fields[++i]);
        codVendedor = getInt(fields[++i]);
        ic = fields[++i];
        grupoProduto = fields[++i];
        realDia = getDouble(fields[++i]);
        realAcumulado = getDouble(fields[++i]);
        metaMensal = getDouble(fields[++i]);
        codUnidade = getInt(fields[++i]);
        codGeo = getInt(fields[++i]);
        codBr = getLong(fields[++i]);
        isVde = getBoolean(fields[++i]);
    }

    public Integer getCodGv() {
        return codGv;
    }

    public void setCodGv(Integer codGv) {
        this.codGv = codGv;
    }

    public Integer getCodSupervisor() {
        return codSupervisor;
    }

    public void setCodSupervisor(Integer codSupervisor) {
        this.codSupervisor = codSupervisor;
    }

    public Integer getCodVendedor() {
        return codVendedor;
    }

    public void setCodVendedor(Integer codVendedor) {
        this.codVendedor = codVendedor;
    }

    public String getIc() {
        return ic;
    }

    public void setIc(String ic) {
        this.ic = ic;
    }

    public String getGrupoProduto() {
        return grupoProduto;
    }

    public void setGrupoProduto(String grupoProduto) {
        this.grupoProduto = grupoProduto;
    }

    public Double getRealDia() {
        return realDia;
    }

    public void setRealDia(Double realDia) {
        this.realDia = realDia;
    }

    public Double getRealAcumulado() {
        return realAcumulado;
    }

    public void setRealAcumulado(Double realAcumulado) {
        this.realAcumulado = realAcumulado;
    }

    public Double getMetaMensal() {
        return metaMensal;
    }

    public void setMetaMensal(Double metaMensal) {
        this.metaMensal = metaMensal;
    }

    public Integer getCodUnidade() {
        return codUnidade;
    }

    public void setCodUnidade(Integer codUnidade) {
        this.codUnidade = codUnidade;
    }

    public Integer getCodGeo() {
        return codGeo;
    }

    public void setCodGeo(Integer codGeo) {
        this.codGeo = codGeo;
    }

    public Long getCodBr() {
        return codBr;
    }

    public void setCodBr(Long codBr) {
        this.codBr = codBr;
    }

    public boolean isVde() {
        return isVde;
    }

    public void setVde(boolean vde) {
        isVde = vde;
    }
}
