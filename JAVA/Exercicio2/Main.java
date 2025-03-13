package Exercicio2;

public class Main {
    public static void main(String[] args) {
      int[] nums = {1,2,3,4,5,6,7,8,9,10};
      int soma = 0;
      for (int i = 0; i < nums.length; i++) {
        System.out.println(nums[i]);
        soma += nums[i];
      }
      System.out.println("A soma dos numeros é: " + soma);
    }
  }
  
