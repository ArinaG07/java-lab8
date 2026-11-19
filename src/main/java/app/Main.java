package app;

import srp.OrderProcessor;
import srp.NotificationService;

import ocp.Shape;
import ocp.Circle;
import ocp.Square;
import ocp.ShapeDrawer;

import lsp.Car;
import lsp.Bicycle;

import isp.SimplePrinter;
import isp.MultiFunctionDevice;

import dip.HardDrive;
import dip.Computer;
import dip.Storage;

public class Main {
    public static void main(String[] args) {
        System.out.println("--- SRP: Принцип единственной ответственности ---");
        OrderProcessor processor = new OrderProcessor();
        processor.processOrder();
        NotificationService notifier = new NotificationService();
        notifier.sendNotification();

        System.out.println("\n--- OCP: Принцип открытости/закрытости ---");
        ShapeDrawer drawer = new ShapeDrawer();
        Shape circle = new Circle();
        Shape square = new Square();
        drawer.draw(circle);
        drawer.draw(square);

        System.out.println("\n--- LSP: Принцип подстановки Барбары Лисков ---");
        Car car = new Car();
        car.startEngine();
        Bicycle bike = new Bicycle();
        bike.ride();

        System.out.println("\n--- ISP: Принцип разделения интерфейсов ---");
        SimplePrinter simplePrinter = new SimplePrinter();
        simplePrinter.print();

        MultiFunctionDevice mfd = new MultiFunctionDevice();
        mfd.print();
        mfd.scan();
        mfd.fax();

        System.out.println("\n--- DIP: Принцип инверсии зависимостей ---");
        Storage hardDrive = new HardDrive();
        Computer computer = new Computer(hardDrive);
        computer.saveToStorage();
    }
}
