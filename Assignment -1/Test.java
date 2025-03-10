//! Write a program to take input using command-line arguments:  
//!   - List 3 favorite foods.  
//!   - List 3 favorite books.  
//!   - List 3 favorite places.

public class Test {

    public static void main(String[] args) {
        System.out.println(args.length > 0 ? args[0] : "Enter argument");
        System.out.println(args.length > 1 ? args[1] : "Enter argument");
        System.out.println(args.length > 2 ? args[2] : "Enter argument");
    }
}



//? For output....       java Test "Favorite Foods: Rice,Dal,Fish" "Favorite Books:Pather Panchali,Professor Shonku, Chokher Bali" "Favorite Places: Kolkata,Anandapur,Moyna" 