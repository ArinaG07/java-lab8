package isp;

public class MultiFunctionDevice implements Printer, Scanner, Fax {
    @Override
    public void print() {
        System.out.println("Печать документа (МФУ)...");
    }

    @Override
    public void scan() {
        System.out.println("Сканирование документа...");
    }

    @Override
    public void fax() {
        System.out.println("Отправка факса...");
    }
}
