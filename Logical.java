class Logical{
    public static void main(String [] args){//Logical operator
       /*boolean hungry=true;
       boolean icecream=false;
       if(hungry && icecream){
        System.out.println("Eat");
       }else{
        System.out.println("Don't Eat");
       }*/

       boolean cricket=true;
       boolean football=false;
       //or conditions
       //true or true = true(play)
       //true or false = true(play)
       //false or true = true(play)
       //false or false = false(don't play)
       if(cricket || football){
        System.out.println("play");
       }else{
        System.out.println("Don't play");
       }
    }
}