package program;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

import entities.CalculationService;
import entities.Produto;

public class App {
    public static void main(String[] args) throws Exception {

        List<Produto> list = new ArrayList<>();
        String path = "C:\\Users\\amara\\Desktop\\Arquivos";

        // Abrindo e lendo arquivo
        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            String line = br.readLine();
            while (line != null) {
                String[] fields = line.split(","); // Split vai "recortar" cada pedaço da string entre as virgulas e
                                                   // guardar no vetor fields
                list.add(new Produto(fields[0], Double.parseDouble(fields[1]))); // chamando o construtor da classe produto e passando como parametro os valores armazenados em fields
                                                                                 
                line = br.readLine(); 
            }

            Produto x = CalculationService.max(list);
            System.out.println("Mais caro: ");
            System.out.println(x);


        }

    }
}
