import java.util.Scanner;

/**
 * Describes a wave on the electromagnetic spectrum.
 * 
 * @author jldeahr
 * @version October 20, 2014
 */
public class Spectrum
{
    public void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a wavelength (m): ");
        double wave = in.nextDouble();
        
        isSpectrum(wave);
    }
    
    public static String isSpectrum(double wave)
    {
        if(wave < (10^-1))
        {
            return "Radio Waves";
        }
        else if (wave < (10^-1) && wave > (10^-3))
        {
            return "Microwaves";
        }
        else if (wave < (10^-3) && wave > (10^-7))
        {
            return "Infrared";
        }
        else if (wave < 7 * (10^-7) && wave > 4 * (10^-7))
        {
            return "Visible Light";
        }
        else if (wave < (10^-8) && wave > 4 * (10^-7))
        {
            return "Ultraviolet";
        }
        else if (wave < (10^-8) && wave > (10^-11))
        {
            return "X-rays";
        }
        else
        {
            return "Gamma rays";
        }
    }
}
