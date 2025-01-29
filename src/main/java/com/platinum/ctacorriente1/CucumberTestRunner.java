package com.platinum.ctacorriente1;

/**
 *
 * @author JOSE DARIO CARTAGENA
 */

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
    features = "src/test/resources/features", // Ruta donde están los .feature
    glue = "com.platinum.ctacorriente1.steps", // Paquete donde están las definiciones de pasos
    plugin = {"pretty", "html:target/cucumber-report.html", "json:target/report.json"}, // Corregido: falta cerrar comilla en el último plugin
    monochrome = true // Salida más legible
)
public class CucumberTestRunner {
  
}
