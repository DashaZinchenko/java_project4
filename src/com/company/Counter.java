package com.company;

public class Counter {
    private final int min = 0;
    private final int max = 0;
    private int value = 0;

    public Counter(int value) throws Exception{
        if (value > max || value < min) {
            throw new Exception("Mistake!");
        }
        this.value = value;
    }
    Counter () {};

    public void counterByOne(){
        if (value == max)
            value = 0;
        else value++;
    }

        public void counterMinusOne(){
        if (value == min)
            value = 9;
        else value--;
            }
   public int counterCurrentType(){ return value; }

   public static void main (String[] args) {
        Counter counter = new Counter();
       for (int i = 0; i < 15; i++) {
           counter.counterMinusOne();
           System.out.println(counter.counterCurrentType());
       }
   }
}
