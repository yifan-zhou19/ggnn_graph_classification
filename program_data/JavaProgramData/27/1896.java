package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int repeat;
		int ri;
		double a;
		double b;
		double c;
		double d;

		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			repeat = Integer.parseInt(tempVar);
		}
		for (ri = 1; ri <= repeat; ri++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a = Double.parseDouble(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				b = Double.parseDouble(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead(" ");
			if (tempVar4 != null)
			{
				c = Double.parseDouble(tempVar4);
			}
			d = b * b - 4 * a * c;
			if (d > 0)
			{
					 System.out.printf("x1=%.5f;", (-b + Math.sqrt(d)) / (2 * a));
					 System.out.printf("x2=%.5f\n", (-b - Math.sqrt(d)) / (2 * a));
			}
			else if (d < 0)
			{
				 if (b == 0)
				 {
						   System.out.printf("x1=0.00000+%0.5fi;", Math.sqrt(-d) / (2 * a));
						   System.out.printf("x2=0.00000-%0.5fi\n", Math.sqrt(-d) / (2 * a));
				 }
				 else
				 {
						   System.out.printf("x1=%.5f+%0.5fi;", -b / (2 * a), Math.sqrt(-d) / (2 * a));
						   System.out.printf("x2=%.5f-%0.5fi\n", -b / (2 * a), Math.sqrt(-d) / (2 * a));
				 }
			}
			else
			{
				System.out.printf("x1=x2=%.5f\n", -b / (2 * a));
			}
		}
		return (0);
	}
}

