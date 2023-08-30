public class printInvoice
{
    public void printInvoiceDetails(Invoice invoice)
    {
        printMessage(quantity + "x " + book.getName() + " " + book.getPrice() + "$");
        printMessage("Discount Rate: " + discountRate);
        printMessage("Tax Rate: " + taxRate);
        printMessage("Total: " + total);
    }

    public void printMessage(String str)
    {
        System.out.println(str);
    }
}