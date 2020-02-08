package com.vvit.oopc;

/**
 * Hello world!
 *
 */
import java.util.*;
import java.util.Collections;
import java.util.ArrayList;
interface Sweets{
    int weight=2;
    public int Weight_meth();
}
class Cho implements Sweets{
    int c,w;
    public Cho(int n){
        c=n;
    }
    public int Weight_meth(){
       w=weight*c; 
       return w;
    }
}
class Candy implements Sweets{
    int c,w;
    public Candy(int n){
        c=n;
    }
    public int Weight_meth(){
       w=weight*c;
       return w;
    }
}
class gift{
    int choc,cha,t;
    gift(int ch,int ca){
        cha=ca;
        choc=ch;
    }
    int totalWeight(){
        Cho ch1=new Cho(choc);
        Candy c=new Candy(cha);
        t=ch1.Weight_meth()+c.Weight_meth();
        
        return t;
    }
}
public class App
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
  int repeat=1;
  ArrayList<Integer> weight = new ArrayList<Integer>();
  while(repeat==1)
  {
  int i=1;
  System.out.println("Enter number of candies in the gift");
  int c_g=sc.nextInt();
  System.out.println("Enter number of sweets in the gift");
  int s_g=sc.nextInt();
  gift g=new gift(c_g,s_g);
  weight.add(g.totalWeight());
  System.out.println("Do you want to add more");
  int a=sc.nextInt();
  if(a==1)
  {
   repeat=1;
  }
  else
  {
   repeat=0;
  }
  }
  Collections.sort(weight);
  System.out.println("Weights of the gifts are:");
  for (int i : weight) 
    {
      System.out.println(i);
    }
}
}