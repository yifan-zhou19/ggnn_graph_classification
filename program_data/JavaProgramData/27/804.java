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
		double root1;
		double root2;
		double shi;
		double xu;
		double t;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 1;i <= n;i++)
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
			t = b * b - 4 * a * c;
			if (t > 0)
			{
				if (b == 0)
				{
					System.out.printf("x1=0.00000+%.5f;x2=0.00000+%.5f\n",Math.sqrt(t) / (2 * a),-Math.sqrt(t) / (2 * a));
				}
				else
				{
					root1 = (-b + Math.sqrt(t)) / (2 * a);
				}
					root2 = (-b - Math.sqrt(t)) / (2 * a);
					System.out.printf("x1=%.5f;x2=%.5f\n",root1,root2);
			}
			else
			{
				if (t < 0)
				{
					shi = -b / (2 * a);
					xu = Math.sqrt(-t) / (2 * a);
					if (shi == 0)
					{
						System.out.printf("x1=0.00000+%.5fi;x2=0.00000-%.5fi\n",xu,xu);
					}
					else
					{

						if (xu > 0)
						{
							System.out.printf("x1=%.5f+%.5fi;x2=%.5f-%.5fi\n",shi,xu,shi,xu);
						}
						else
						{
							System.out.printf("x1=%.5f-%.5fi;x2=%.5f+%.5fi\n",shi,-xu,shi,-xu);
						}
					}
				}
				else
				{
					if (b == 0)
					{
						System.out.print("x1=x2=0");
					}
					else
					{
						root1 = -b / (2 * a);
					}
						System.out.printf("x1=x2=%.5f\n",root1);
				}
			}
		}
	return 0;
	}
}

