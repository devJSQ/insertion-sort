public class Main {
  public static char [] InsertionSort(char [] letters){
    for(int i = 1; i < letters.length; i++){
      char val = letters[i];
      int j = i - 1;
      while (j >=0 && letters[j] > val){
        letters[j + 1] = letters[j];
        j--;
      }
      letters[j + 1] = val;
      
    }
    
    return letters;
    
  }

  public static void main(String[] args){
    char [] letters = {'e', 'b', 'd', 'a', 'c'};
    System.out.println(letters);
    InsertionSort(letters);
    System.out.println(letters);


	
  }
}
