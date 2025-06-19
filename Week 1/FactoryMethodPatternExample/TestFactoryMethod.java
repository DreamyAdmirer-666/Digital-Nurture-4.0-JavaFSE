public class TestFactoryMethod {
    public static void main(String[] args)
    {
        DocumentFactory wordFactory=new WordDocumentFactory();
        Document wordDoc= wordFactory.createDocument();
        wordDoc.open();

        DocumentFactory pdfFactory=new PdfDocumentFactory();
        Document pdfDoc= pdfFactory.createDocument();
        pdfDoc.open();

        DocumentFactory excelFactory=new ExcelDocumenFactory();
        Document excelDoc= excelFactory.createDocument();
        excelDoc.open();

    }
}
