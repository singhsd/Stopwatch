/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stopwatch;

/**
 *
 * @author S D Singh
 */
public class DateTime implements Runnable{
    Stopwatch st;
    DateTime(Stopwatch w)
    {
        st = w;
    }
    public void run()
    {
        try{
            while(true)
            {
                st.setDate();
                st.setTime();
                Thread.sleep(1000);
            }
        } catch (Exception e) {e.printStackTrace();}
    }
}
