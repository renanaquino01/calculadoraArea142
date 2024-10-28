// Pacotes

// biblioteca
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;
import com.area142.Main;


// classe
public class testarea142 {
    // atributos


    // funcoes e metodo
    @Test 
    public void areaquadrado(){
        float num1 = 5;
        float num2 = 5;
        float resultadoEsperado = 25;

        // executa
        float resultadoAtual = com.area142.Main.quadrado(num1, num2);

        // valida
        assertEquals(resultadoEsperado, resultadoAtual);
    }

    @Test 
    public void areatriangulo(){
        float num1 = 2;
        float num2 = 4;
        float num3 = 2;
        float resultadoEsperado = 4;

        float resultadoAtual = com.area142.Main.triangulo(num1, num2, num3);
        
        assertEquals(resultadoEsperado, resultadoAtual);
    }


    // DDT: Data Driven
    @ParameterizedTest
    @CsvSource(value = {
        "2, 4, 8.0",
        "10, 5, 50.0",
        "1, 6, 6.0",
    }, delimiter = ',')
    public void arearetangulo(float num1, float num2, float resultadoEsperado){
        // executa 
        float resultadoAtual = com.area142.Main.retangulo(num1, num2);

        // valida
        assertEquals(resultadoEsperado, resultadoAtual);
    }

    @ParameterizedTest
    @CsvFileSource(resources = "csv/testarea142.csv", numLinesToSkip = 1, delimiter = ',')
    public void areatriangulocsv(float num1, float num2, float num3 float resultadoEsperado){
        // executa 
        float resultadoAtual = com.area142.Main.triangulocsv(num1, num2, num3);

        // valida
        assertEquals(resultadoEsperado, resultadoAtual);
    }

} 