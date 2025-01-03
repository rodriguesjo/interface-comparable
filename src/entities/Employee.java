package entities;

/** A interface Comparable 
 *  é usada para permitir que objetos da classe Employee sejam comparados entre si e
 *  permite que os objetos Employee sejam comparados e ordenados usando métodos como Collections.sort.
 *  A implementação de Comparable<Employee> exige a sobrescrita do método compareTo, que define a 
 *  lógica de ordenação natural para os objetos Employee.
 *  A comparação é baseada no tipo genérico <Employee>, garantindo que o método compareTo 
 *  compare apenas objetos da mesma classe (Employee).
*/


public class Employee implements Comparable<Employee> {

    // Atributo para armazenar o nome do funcionário.
    private String name;
    
    // Atributo para armazenar o salário do funcionário.
    private Double salary;

    // Construtor para inicializar os atributos do funcionário.
    public Employee(String name, Double salary) {
        this.name = name;
        this.salary = salary;
    }

    // Método getter para acessar o nome do funcionário.
    public String getName() {
        return name;
    }

    // Método setter para modificar o nome do funcionário.
    public void setName(String name) {
        this.name = name;
    }

    // Método getter para acessar o salário do funcionário.
    public Double getSalary() {
        return salary;
    }

    // Método setter para modificar o salário do funcionário.
    public void setSalary(Double salary) {
        this.salary = salary;
    }

    // Implementação do método compareTo para comparar funcionários com base no salário.
    // A comparação é feita em ordem decrescente (-salary.compareTo).
    // O operador - inverte a ordem padrão de classificação do método compareTo.
    @Override
    public int compareTo(Employee other) {
        return -salary.compareTo(other.getSalary());
    }
}
