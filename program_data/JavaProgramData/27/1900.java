package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	float a;
	float b;
	float c;
	double m;
	double n;
	double x;
	double y;
	n = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
	for (m = 1;m <= n;m = m + 1)
	{
		a = Float.parseFloat(ConsoleInput.readToWhiteSpace(true));
		b = Float.parseFloat(ConsoleInput.readToWhiteSpace(true));
		c = Float.parseFloat(ConsoleInput.readToWhiteSpace(true));
		if (b * b - 4 * a * c >= 0F)
		{
		x = (-b + Math.sqrt(b * b - 4 * a * c)) / (2 * a);
		y = (-b - Math.sqrt(b * b - 4 * a * c)) / (2 * a);
		if (x != y)
		{
		System.out.printf("x1=%.5f;x2=%.5f\n",x,y);
		}
		else if (x == y)
		{
			System.out.printf("x1=x2=%.5f\n",x);
		}
		}
		else if (b * b - 4 * a * c < 0F)
		{
			x = b / 2 / a * (-1);
			y = (Math.sqrt(-b * b + 4 * a * c)) / 2 / a;
			if (x != 0)
			{
			System.out.printf("x1=%.5f+%.5fi;x2=%.5f-%.5fi\n",x,y,x,y);
			}
			else if (x == 0)
			{
			System.out.printf("x1=0.00000+%.5fi;x2=0.00000-%.5fi\n",y,y);
			}
		}
	}
	return 0;
	}
}

