package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import entities.Employee;

public class Program {

    public static void main(String[] args) {

        // Cria uma lista para armazenar objetos do tipo Employee.
        List<Employee> list = new ArrayList<>();
        
        // Caminho do arquivo de entrada contendo os dados dos funcionários.
        String path = "C:\\temp\\in.txt";

        // Bloco try-with-resources para abrir e fechar automaticamente o arquivo.
        try (BufferedReader br = new BufferedReader(new FileReader(path))) {

            // Lê a primeira linha do arquivo.
            String employeeCsv = br.readLine();
            
            // Lê as linhas do arquivo enquanto não encontrar o final (null).
            while (employeeCsv != null) {
                // Divide a linha lida em campos, separando por vírgulas.
                String[] fields = employeeCsv.split(",");
                
                // Cria um novo objeto Employee com os dados lidos e adiciona à lista.
                list.add(new Employee(fields[0], Double.parseDouble(fields[1])));
                
                // Lê a próxima linha do arquivo.
                employeeCsv = br.readLine();
            }

            // Exibe uma mensagem indicando que os funcionários serão ordenados por nome.
            System.out.println("--Ordenar--");
            
            // Ordena a lista de funcionários usando o método compareTo da classe Employee.
            Collections.sort(list);
            
            // Itera sobre a lista ordenada e exibe o nome e salário de cada funcionário.
            for (Employee emp : list) {
                System.out.println(emp.getName() + ", " + emp.getSalary());
            }

        } catch (IOException e) {
            // Captura e trata exceções relacionadas à leitura do arquivo.
            System.out.println("Error: " + e.getMessage());
        }
    }
}
