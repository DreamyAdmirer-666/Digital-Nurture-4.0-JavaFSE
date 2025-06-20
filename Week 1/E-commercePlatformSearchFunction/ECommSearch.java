import java.util.Arrays;
import java.util.Comparator;
class Product
{
    int ProId;
    String P_Name;
    String P_Cat;
    
    //ProId=to store the product ID
    //P_Name=to store the name of the products
    //P_Cat=to store the category of the Product
    //All these are global variables

    public Product(int ProId, String P_Name, String P_Cat)//constructor to insitialise the global variables
    {
        this.ProId=ProId;
        this.P_Name=P_Name;
        this.P_Cat=P_Cat;
    }

    public String toString() //fucntion to return the final output in the string format
    {
        return "Product ID: "+ProId+" Name: "+P_Name+" Category: "+P_Cat;
    }
}

public class ECommSearch
    {
        //Linear Search
        public static Product LinearSearch(Product[] prods, String name)
        {
            for(Product prod:prods)
            {
                if(prod.P_Name.equalsIgnoreCase(name))
                {
                    return prod;
                }
            }
            return null;
        }
        
        //Binary Search
        public static Product BinarySearch(Product[] prods, String name)
        {
            int l=0;
            int u=prods.length-1;
            int m;
            while(l<=u)
            {
                m=(u+l)/2;
                int res=prods[m].P_Name.compareToIgnoreCase(name);
                if(res==0)
                {
                    return prods[m];
                }
                else if(res<0)
                {
                    l=m+1;
                }
                else
                {
                    u=m-1;
                }
            }
            return null;
        }
        public static void main(String[] args) {
            Product[] products={
                new Product(100, "Heels", "Footwear"),
                new Product(101, "Mobile", "Electronics"),
                new Product(102, "Polo Shirt", "Clothing"),
                new Product(103, "Toner", "Skincare"),
                new Product(104, "Skinny Jeans", "Clothing"),
                new Product(105, "Tote Bage", "Accessories"),
                new Product(106, "Earrings", "Acessories"),
                new Product(107, "Foundation", "Makeup")
            };
            

            //Linear Search
            System.out.println("Linear Search");
            Product res=LinearSearch(products, "Toner");
            if(res!=null) System.out.println("Found at:"+res);
            else System.out.println("Product not found!");

            //Binary Search
            Arrays.sort(products, Comparator.comparing(p -> p.P_Name.toLowerCase()));
            System.out.println("Binary Search");
            res=BinarySearch(products, "Toner");
            if(res!=null) System.out.println("Found at: "+res);
            else System.out.println("Product not found!");
        }
    }