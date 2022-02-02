/* Construct a string from an array values and print */
class ConstructStringUsingArray{

  public static void main(String[] args){
    String name = "Kavita";
    String[] jwellery = {"Earring", "Necklace", "Choker", "Ring", "Studs"};
    

    String str = name +" has " + jwellery[0].toLowerCase() + ", " + jwellery[1].toLowerCase() + ", " + jwellery[2].toLowerCase() + ", " + jwellery[3].toLowerCase() + ", and " + jwellery[4].toLowerCase();

    String str1 = String.format("%s has %s, %s, %s, %s, and %s ", name, jwellery[0].toLowerCase(), jwellery[1].toLowerCase(), jwellery[2].toLowerCase(), jwellery[3].toLowerCase(), jwellery[4].toLowerCase());
    // System.out.println(str1);

// Kavita has earring, necklace, choker, ring, and studs 
    String str2 = name + " has ";
    System.out.println(str2);
    for(int i = 0; i < jwellery.length; i++){
       if(i == jwellery.length - 1){
         str2 = str2 + "and " + jwellery[i].toLowerCase();
       } else{
         str2 = str2 + jwellery[i].toLowerCase() + ", ";
       }
    }
     System.out.println(str2);

/*
str = "Kavita has "
str = str + jwellery[i] + ", "; //0
str = str + jwellery[i] + ", "; //1
str = ...

i
0 => earring 1
1 => necklace 2
2 => choker 3
3 => ring 4
4 => studs 5

jwellery.length => 5

i == jwellery.length - 1
0 == (5-1)
1 == 4
2 == 4
3 == 4
4 == 4

if(i == (jwellery.length -1)) // last index position

else 
*/


  }
}