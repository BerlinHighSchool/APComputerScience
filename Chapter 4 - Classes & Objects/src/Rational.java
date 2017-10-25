import java.lang.Character.Subset;
import java.lang.reflect.GenericSignatureFormatError;

public class Rational {
	int numer, denom;
	
	public Rational(int n, int d)
	{
		numer = n;
		denom = d;
		
		if(d == 0)
			denom = 1;
		if(d < 0)
		{
			denom *= -1;
			numer *= -1;
		}
		
		reduce();
	}
	
	public int getNum()
	{
		return numer;
	}
	
	public int getDenom()
	{
		return denom;
	}
	
	public Rational add(Rational r2)
	{
		return new Rational(numer * r2.getDenom() + r2.getNum()*denom, denom * r2.getDenom());
	}
	
	public Rational subtract(Rational r2)
	{
		return new Rational(numer * r2.getDenom() - r2.getNum()*denom, denom * r2.getDenom());
	}
	
	public Rational multiply(Rational r2)
	{
		return new Rational(numer*r2.getNum(), denom*getDenom());
	}
	
	public Rational divide(Rational r2)
	{
		return multiply(new Rational(r2.getDenom(), r2.getNum()));
	}
	
	private void reduce()
	{
		if(numer != 0)
		{
			int cd = gcf(Math.abs(numer), denom);
			numer /= cd;
			denom /= cd;
		}
	}
	
	private int gcf(int n, int d){
		while (n != d)
		{
			if (n > d)
				n = n - d;
			else
				d = d - n;
		}
		return n;
	}
	
	public String toString()
	{
		return numer + "/" + denom;
	}
}
