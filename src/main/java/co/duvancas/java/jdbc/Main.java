package co.duvancas.java.jdbc;

import co.duvancas.java.jdbc.models.Producto;
import co.duvancas.java.jdbc.repositorio.ProductoRespositorioImpl;
import co.duvancas.java.jdbc.repositorio.Repositorio;
import co.duvancas.java.jdbc.util.ConexionBaseDeDatos;

import java.sql.*;

public class Main {

    public static void main(String[] args) {

        try(Connection conn = ConexionBaseDeDatos.getIntace()) {

            Repositorio<Producto> repositorio = new ProductoRespositorioImpl();
            repositorio.listar().forEach(a -> System.out.println(a.getPrecio()));

        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

}