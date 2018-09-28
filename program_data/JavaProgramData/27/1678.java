package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int number;
		float a;
		float b;
		float c;
		double delta = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			number = Integer.parseInt(tempVar);
		}
		while (number -- != 0)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a = Float.parseFloat(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				b = Float.parseFloat(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead(" ");
			if (tempVar4 != null)
			{
				c = Float.parseFloat(tempVar4);
			}
			delta = b * b - 4 * a * c;
			if (delta > 0)
			{
				double x1;
				double x2;
				x1 = (-b + Math.sqrt(delta)) / (2 * a);
				x2 = (-b - Math.sqrt(delta)) / (2 * a);
				System.out.printf("x1=%.5f;x2=%.5f\n",x1,x2);
			}
			else
			{
				if (delta == 0)
				{
					double x = (-b) / (2 * a);
					System.out.printf("x1=x2=%.5f\n", x);
				}
				else
				{
				delta = -delta;
				if (b == 0F)
				{
					double xfront = b / (2 * a);


					double xbehind = Math.sqrt(delta) / (2 * a);
					System.out.printf("x1=%.5f+%.5fi;x2=%.5f-%.5fi\n", xfront, xbehind, xfront, xbehind);
				}
				else
				{
					double xfront = (-b) / (2 * a);
					double xbehind = Math.sqrt(delta) / (2 * a);
					System.out.printf("x1=%.5f+%.5fi;x2=%.5f-%.5fi\n", xfront, xbehind, xfront, xbehind);
				}
				}
			}
		}
	}

}

