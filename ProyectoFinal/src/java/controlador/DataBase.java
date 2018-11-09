/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

/**
 *
 * @author Usuario
 */
public class DataBase {
    
    private final String url = "jdbc:derby://localhost:1527/practica";
    
   public DbActualizar Actualizar(){
        DbActualizar refresh = new DbActualizar();
        return refresh;
    }
    
    public DbInsertar Insertar(){
        DbInsertar agregar= new DbInsertar();
        return agregar;
    }
     
    public DbSeleccionar Seleccionar(){
        return new DbSeleccionar();
    }
    public String getUrl() {
    return url;
    } 
}
