/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//DSCWDCWECWECEC
/**
 *
 * @author Cesar
 */

//HOLA

public class Hilo implements Runnable{
    private int from , to , sum;
    
    public Hilo(long from , long to) {
        this.from = (int) from;
        this.to = (int) to;
        sum = 0;
    }
    
    @Override
    public void run()
    {
        for(long i=from;i<=to;i++) {
            sum+=i;
        }
    }
    
    public long getSum() {
        return this.sum;
    }
    
}