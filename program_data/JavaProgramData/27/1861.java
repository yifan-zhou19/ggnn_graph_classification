package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		int j;
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (j = 1;j <= n;j++)
		{
			float a;
			float b;
			float c;
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a = Float.parseFloat(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				b = Float.parseFloat(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				c = Float.parseFloat(tempVar4);
			}
			double x1;
			double x2;
			double m;
			double p;
			if ((b * b - 4 * a * c) > 0)
			{
				x1 = (-b + Math.sqrt(b * b - 4 * a * c)) / (2 * a);
				x2 = (-b - Math.sqrt(b * b - 4 * a * c)) / (2 * a);
				System.out.printf("x1=%.5f;x2=%.5f\n",x1,x2);
			}
			else if ((b * b - 4 * a * c) == 0)
			{
				x1 = x2 = -b / (2 * a);
				System.out.printf("x1=x2=%.5f\n",x1,x2);
			}
			else
			{
				m = -b / (2 * a);
							   if (b == 0F)
							   {
							   m = 0;
							   }
				p = Math.sqrt(4 * a * c - b * b) / (2 * a);
				System.out.printf("x1=%.5f+%.5fi;x2=%.5f-%.5fi\n",m,p,m,p);

			}
		}
	}


}

