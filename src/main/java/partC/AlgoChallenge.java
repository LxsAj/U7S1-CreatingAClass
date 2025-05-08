package partC;

public class AlgoChallenge {

     /* Problem 1
      An upcoming artist's concert is coming to town.
      The concert manager is only allowing one person of a pair to be a "teen".
      Your at the front gate checking tickets and verifying ages.
      You allowed to let a pair in as long as only one person is a teen but both can't be a "teen".
      A "teen" is considered someone within the range of 13...19 inclusive.

      Return true if one or the other person in the pair is a teen, but not both.

      Example:
      oneTeen(13, 99) --> true
      oneTeen(21, 19) --> true
      oneTeen(13, 13) --> false
     */

    public static Boolean oneTeen(int person1, int person2) {
       if (person1 > 13 && person2 > 19){
           return true;
       } else if (person2 > 13 && person1 < 19) {
           return true;
       } else return person1 > 13;
    }


    /* Problem 2
    We're on the look-out for ounces "oz" within a string. You will be given a string,
    and you need to determine if the first two characters yields "oz".
    We need you to return a new string made of the first 2 chars (if present).

    Only include first char if it is 'o' and only include second char if it is 'z'.

    Example:
    beginWithOz("ozymandias") --> "oz"
    beginWithOz("bzoo") --> "z"
    beginWithOz("oxx") --> "o"
     */

    public static String beginWithOz(String ounces) {
        if (ounces.startsWith("oz")){
            return "oz";
        } else if (ounces.length() >=2 && ounces.charAt(1) == 'z') {
            return "z";
        }
        return "o";
    }




    public static void main(String[]args){
        System.out.println(oneTeen(13,19));
        System.out.println(oneTeen(21,19));
        System.out.println(oneTeen(13,13));

        System.out.println(beginWithOz("ozymandias"));
        System.out.println(beginWithOz("bzoo"));
        System.out.println(beginWithOz("oxx"));

    }

}


