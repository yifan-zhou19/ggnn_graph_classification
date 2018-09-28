package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		int i;
		int n;
		double e;
		double f;
		double a;
		double b;
		double c;
		double x1;
		double x2;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 1;i < n + 1;i++)
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
			if (b * b - 4 * a * c > 0)
			{
				x1 = (-b + Math.sqrt(b * b - 4 * a * c)) / (2 * a);
				x2 = (-b - Math.sqrt(b * b - 4 * a * c)) / (2 * a);
				System.out.printf("x1=%.5f;x2=%.5f\n",x1,x2);
			}
			else if (b * b - 4 * a * c == 0)
			{
				x1 = (-b + Math.sqrt(b * b - 4 * a * c)) / (2 * a);
				System.out.printf("x1=x2=%.5f\n",x1);
			}
			else if (b * b - 4 * a * c < 0)
			{
				if (b == 0)
				{
					e = 0;
					f = (Math.sqrt(4 * a * c - b * b)) / (2 * a);
				}
				else
				{
					e = -b / (2 * a);
					f = (Math.sqrt(4 * a * c - b * b)) / (2 * a);
				}
				System.out.printf("x1=%.5f+%.5fi;x2=%.5f-%.5fi\n",e,f,e,f);
			}
		}
	}

}

