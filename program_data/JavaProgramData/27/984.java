package <missing>;

public class GlobalMembers
{
	//x1 = (-b + sqrt(b*b-4*a*c))/(2*a) 
	//x2 = (-b - sqrt(b*b-4*a*c))/(2*a) 
	//??????? ax2 + bx + c = 0 ?????a???0?
	public static int Main()
	{
		int n;
		int i;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1;i <= n;i++)
		{
			double a;
			double b;
			double c;
			double delta;
			double x1;
			double x2;
			a = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
			b = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
			c = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
			delta = b * b - 4 * a * c;
			if (delta > 0)
			{
				x1 = (-b + Math.sqrt(b * b - 4 * a * c)) / (2 * a);
				x2 = (-b - Math.sqrt(b * b - 4 * a * c)) / (2 * a);
				System.out.printf("x1=%.5f;x2=%.5f\n",x1,x2);
			}
			else if (delta == 0)
			{
				x1 = x2 = -b / (2 * a);
				System.out.printf("x1=x2=%.5f\n",x1);
			}
			else
			{
				double antidel = Math.abs(delta);
				double d;
				double e;
				double f;
				d = (Math.sqrt(antidel)) / (2 * a);
				f = Math.abs(d);
				if (b != 0)
				{
					e = -b / 2 / a;
				}
				else
				{
					e = 0;
				}
				System.out.printf("x1=%.5f+%.5fi;x2=%.5f-%.5fi\n",e,f,e,f);
			}
		}
			return 0;
	}

}

