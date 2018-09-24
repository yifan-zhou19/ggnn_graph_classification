package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		double a;
		double b;
		double c;
		double x1;
		double x2;
		double real;
		double imaginary;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		double temp;

		for (i = 0; i < n; i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a = Double.parseDouble(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				b = Double.parseDouble(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				c = Double.parseDouble(tempVar4);
			}
			temp = b * b - 4 * a * c;
				if (temp > 0)
				{
				x1 = (-b + Math.sqrt(temp)) / (2 * a);
				x2 = (-b - Math.sqrt(temp)) / (2 * a);
			  System.out.printf("x1=%.5f;x2=%.5f\n", x1, x2);
				}
			else if (temp == 0)
			{
				x1 = -b / (2 * a);
			 System.out.printf("x1=x2=%.5f\n", x1);

			}
			else
			{
				real = -b / (2 * a);
				imaginary = Math.sqrt(-temp) / (2 * a);
				System.out.printf("x1=%.5f+%.5fi;x2=%.5f-%.5fi\n", real, imaginary, real, imaginary);


			}
		}
	}

}

