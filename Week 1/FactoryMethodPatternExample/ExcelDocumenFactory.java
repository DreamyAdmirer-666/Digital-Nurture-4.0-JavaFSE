public class ExcelDocumenFactory extends DocumentFactory {
    public Document createDocument(){
        return new ExcelDocument();
    }
    
}
