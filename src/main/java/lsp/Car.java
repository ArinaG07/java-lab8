package lsp;

public class Car implements EngineVehicle {
    @Override
    public void startEngine() {
        System.out.println("Запуск двигателя автомобиля...");
    }
}
