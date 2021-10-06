package com.example.tiendita;

public class Item {
    private String nombre;
    private int cantidad;
    private int valorUnitario;
    private int valorTotalItem;

    public Item(String nombre, int cantidad, int valorUnitario, int valorTotalItem) {
        this.nombre = nombre;
        this.cantidad = cantidad;
        this.valorUnitario = valorUnitario;
        this.valorTotalItem = valorTotalItem;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public int getValorUnitario() {
        return valorUnitario;
    }

    public void setValorUnitario(int valorUnitario) {
        this.valorUnitario = valorUnitario;
    }

    public int getValorTotalItem() {
        return valorTotalItem;
    }

    public void setValorTotalItem(int valorTotalItem) {
        this.valorTotalItem = valorTotalItem;
    }
}
