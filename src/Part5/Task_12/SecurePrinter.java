package Part5.Task_12;

class SecurePrinter {
    private final Printer printer = new Printer();

    void printSecurely(String document) {
        System.out.println("Printing securely: " + document);
        printer.print(document);
    }
}
