/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package camisasejercicio;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Annie
 */
public class CamisasEjercicioTest {
    
    public CamisasEjercicioTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tea    /**
     * Test of main method, of class CamisasEjercicio.
     */
    @Test
    public void testPrecioCamisaMangaCorta() {
        String camisaMangaCorta = "1.Camisa de manga corta";
        int cantidad = 2;
        double precioEsperado = 380.0; // 2 * $190
        
        double precioActual = CamisasPrograma.calcularPrecio(camisaMangaCorta, cantidad);
        assertEquals(precioEsperado, precioActual, 0.01);
}

    @Test
    public void testPrecioCamisaCasualMangaLarga() {
        String camisaCasualMangaLarga = "2.Camisa casual de manga larga";
        int cantidad = 3;
        double precioEsperado = 621.0; // 3 * $230 * 0.95
        
        double precioActual = CamisasPrograma.calcularPrecio(camisaCasualMangaLarga, cantidad);
        assertEquals(precioEsperado, precioActual, 0.01);
    }
    
    @Test
    public void testPrecioCamisaFormalMangaLarga() {
        String camisaFormalMangaLarga = "3.Camisa formal de manga larga";
        int cantidad = 5;
        double precioEsperado = 1426.0; // 5 * $310 * 0.92
        
        double precioActual = CamisasPrograma.calcularPrecio(camisaFormalMangaLarga, cantidad);
        assertEquals(precioEsperado, precioActual, 0.01);
    }
    
}




