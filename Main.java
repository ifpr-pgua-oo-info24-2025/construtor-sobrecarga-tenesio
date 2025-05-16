public class Main {
    public static void main(String[] args) {

        Motor motor1 = new Motor("Gasolina", 1.6);
        Condutor condutor1 = new Condutor("Joao Silva", "1234567890");

        Carro carro1 = new Carro("Toyota", "Corolla", "ABC-1234", motor1, condutor1);
        System.out.println("Carro 1:");
        System.out.println(carro1);

        Carro carro2 = new Carro("Tesla", "Model 3", "XYZ-5678", new Motor("Elétrico", 3.0));
        System.out.println("\nCarro 2 antes do condutor:");
        System.out.println(carro2);

        carro2.setCondutor(new Condutor("Maria Oliveira", "9876543210"));
        System.out.println("Carro 2 apos atribuir condutor:");
        System.out.println(carro2);

        Carro carro3 = new Carro("Fiat", "Uno", "KLM-4321");
        System.out.println("\nCarro 3 original:");
        System.out.println(carro3);

        carro3.setMotor(new Motor("Diesel", 1.0));
        carro3.setCondutor(new Condutor("Carlos Lima", "1112223334"));
        System.out.println("Carro 3 apos atualizacoes:");
        System.out.println(carro3);
    }
}
