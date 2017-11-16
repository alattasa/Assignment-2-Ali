
public class Resistor 
{
	double R1,R2,R3,R4,R5,R6;
	public Resistor(double r1, double r2, double r3, double r4, double r5, double r6)
	{
		this.R1 = r1;
		this.R2 = r2;
		this.R3 = r3;
		this.R4 = r4;
		this.R5 = r5;
		this.R6 = r6;
	}
	public double getR1()
	{
		return this.R1;
	}
	public double getR2()
	{
		return this.R2;
	}
	public double getR3()
	{
		return this.R3;
	}
	public double getR4()
	{
		return this.R4;
	}
	public double getR5()
	{
		return this.R5;
	}
	public double getR6()
	{
		return this.R6;
	}
	
	public boolean validateDesign()
	{
		// if good return true else false
		boolean good = false;
		
		double res = ((R1+R2)*R4*R6)/((R3+R4)*R1*R5);
		if(res == 7.5)
			good = true;	
		return good;
	}
	public String toString()
	{
		return this.getR1()+"\t"+this.getR2()+"\t"+this.getR3()+"\t"+this.getR4()+"\t"
				+ ""+this.getR5()+"\t"+this.getR6();
	}

}
