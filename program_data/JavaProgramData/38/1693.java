package <missing>;

public class GlobalMembers
{
	public static int Main()

	{
		int k;
		int n;
		int i;
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *p;
		int p;
		int j;
		double[] x = new double[100];
		double a;
		double b;
		double c;
		double s;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			k = Integer.parseInt(tempVar);
		}
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		p = (int)malloc((Double.SIZE / Byte.SIZE) * k);
		for (i = 0;i < k;i++)
		{
			b = 0;
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				n = Integer.parseInt(tempVar2);
			}
			for (j = 0;j < n;j++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					x[j] = Double.parseDouble(tempVar3);
				}
				b = b + x[j];
			}
			a = b / n;
			c = 0;
			for (j = 0;j < n;j++)
			{
				c = c + (x[j] - a) * (x[j] - a);
			}
			s = Math.sqrt(c / n);
			System.out.printf("%.5lf\n",s);
		}
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'free' has no equivalent in Java:
		free(p);

		return 0;
	}
}

