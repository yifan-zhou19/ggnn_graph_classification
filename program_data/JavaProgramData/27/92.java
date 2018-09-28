package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		double a;
		double b;
		double c;
		double x1;
		double x2;
		double d;
		double e;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (;n >= 1;n--)
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
			  if ((Math.sqrt(b * b - 4 * a * c)) > 0)
			  {
				  x1 = (-b + Math.sqrt(b * b - 4 * a * c)) / (2 * a);
				  x2 = (-b - Math.sqrt(b * b - 4 * a * c)) / (2 * a);
				  System.out.printf("x1=%.5f;x2=%.5f\n", x1,x2);
			  }
			else
			{
				if ((Math.sqrt(b * b - 4 * a * c)) == 0)
				{
					x1 = -b / (2 * a);
					System.out.printf("x1=x2=%.5f\n", x1);
				}
				else
				{
				 d = -b / (2 * a);
				 e = Math.sqrt(-(b * b - 4 * a * c)) / (2 * a);
				System.out.printf("x1=%.5f+%.5fi;x2=%.5f-%.5fi\n", d,e,d,e);

				}
			}
		}
	}
}

