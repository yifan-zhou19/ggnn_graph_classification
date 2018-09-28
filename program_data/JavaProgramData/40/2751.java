package <missing>;

public class GlobalMembers
{
	/* Note:Your choice is C IDE */
	public static void Main()
	{
		double a;
		double b;
		double c;
		double d;
		double s;
		double ri;
		double S;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = Double.parseDouble(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			b = Double.parseDouble(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			c = Double.parseDouble(tempVar3);
		}
		String tempVar4 = ConsoleInput.scanfRead();
		if (tempVar4 != null)
		{
			d = Double.parseDouble(tempVar4);
		}
		String tempVar5 = ConsoleInput.scanfRead();
		if (tempVar5 != null)
		{
			ri = Double.parseDouble(tempVar5);
		}
		ri *= 3.1415926 / 180;
		ri /= 2;
		s = (a + b + c + d) / 2;
		S = Math.sqrt((s - a) * (s - b) * (s - c) * (s - d) - a * b * c * d * Math.cos(ri) * Math.cos(ri));
	  if ((s - a) * (s - b) * (s - c) * (s - d) - a * b * c * d * Math.cos(ri) * Math.cos(ri) < 0.getValue() != 0)
	  {
		  System.out.print("Invalid input");
	  }
	   else
	   {
		   System.out.printf("%.4f",S);
	   }
	}
}

