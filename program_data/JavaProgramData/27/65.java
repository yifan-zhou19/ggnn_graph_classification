package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		short task_number;
		short i;
		double a;
		double b;
		double c;
		double x1;
		double x2;
		double delta;
		double real;
		double image;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			task_number = Short.parseShort(tempVar);
		}
		for (i = 1;i <= task_number;i++)
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
			delta = b * b - 4.0 * a * c;
			if (Math.abs(delta) < 1E-5)
			{
				x1 = -b / (2.0 * a);
				if (Math.abs(x1) < 1E-5)
				{
					x1 = 0.0;
				}
				System.out.printf("x1=x2=%.5lf\n",x1);
			}
			else
			{
				if (delta > 0)
				{
					x1 = (-b + Math.sqrt(delta)) / (2 * a);
					if (Math.abs(x1) < 1E-5)
					{
						x1 = 0.0;
					}
					x2 = (-b - Math.sqrt(delta)) / (2 * a);
					if (Math.abs(x2) < 1E-5)
					{
						x2 = 0.0;
					}
					System.out.printf("x1=%.5lf;x2=%.5lf\n",x1,x2);
				}
				else
				{
					real = -b / (2 * a);
					if (Math.abs(real) < 1E-5)
					{
						real = 0.0;
					}
					image = Math.sqrt(-delta) / (2 * a);
					if (Math.abs(image) < 1E-5)
					{
						image = 0.0;
					}
					System.out.printf("x1=%.5lf+%.5lfi;x2=%.5lf-%.5lfi\n",real,image,real,image);
				}
			}
		}
		return (0);
	}





}

