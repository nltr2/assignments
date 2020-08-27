package in.algo.bits;

public class BitsBasic {
    /***
     * any shift of 32 will spit back the same integer without effect as JVM does not evaluate this.
     * @param args
     */    
    public static void main(String[] args) {
        int b = - 2344440; 
        System.out.println(b + " = "+Integer.toBinaryString(b));
        
        // any shift of 32 will spit back the same integer without effect as JVM does not evaluate this.
        System.out.println(b + " = "+Integer.toBinaryString(b>>>32));
        System.out.println(b + " = "+Integer.toBinaryString(b>>32));
        System.out.println(b + " = "+Integer.toBinaryString(b<< 32));

        // check -1/2 will always be -1 due to flooring. so once -1 reached by >>, it will be always be -1: 
        //check next 2 examples.
        int c = b >> 24;
        System.out.println(c +" = "+ Integer.toBinaryString(c) ); 
        c = b >> 31;
        System.out.println(c +" = "+ Integer.toBinaryString(c) );


        // -ve of unsigned right shift of 31 will provide 1 as an answer.
         c = b >>> 31;
        System.out.println(c +" = "+ Integer.toBinaryString(c) );


        // left shift 
        c = b << 28; // reaches here max -ve integer 
        System.out.println(c +" = "+ Integer.toBinaryString(c) );
        
        c = b << 29; // moving from max -ve integer will end in 0.
        System.out.println(c +" = "+ Integer.toBinaryString(c) );
        
        // left shift of +ve integer can go to max Integer and then to -ve then to 0 if possible in some cases.
        int a=2;
        c=a<<29;
        System.out.println(a +" = "+ Integer.toBinaryString(a) );
        System.out.println(c +" = "+ Integer.toBinaryString(c) );
        c=a<<31;
        System.out.println(c +" = "+ Integer.toBinaryString(c) );

        a=5;
        c=a<<29;
        System.out.println(a +" = "+ Integer.toBinaryString(a) );
        System.out.println(c +" = "+ Integer.toBinaryString(c) );
        c=a<<31;
        System.out.println(c +" = "+ Integer.toBinaryString(c) );


        
    }
}