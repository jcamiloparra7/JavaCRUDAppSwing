/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package reto2;

/**
 *
 * @author juancparra
 */
public class DensidadPoblacional extends ObjetoGeografico {
    
    int habitantes;

    public int getHabitantes() {
        return habitantes;
    }

    public void setHabitantes(int habitantes) {
        this.habitantes = habitantes;
    }
    
    
    
    public int afeccion() {
        
        if (habitantes < 10000) {
            
            return 0;
        }
        
        else if (habitantes <= 50000) {
            
            return 1; 
        }
        
        else {
            
            return 2;
        }   
    }
}
