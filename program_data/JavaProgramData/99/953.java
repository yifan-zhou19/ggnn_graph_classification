package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int n;
		int[] sz = new int[100];
		double x;
		double y;
		double z;
		double p;
		int b1 = 0;
		int b2 = 0;
		int b3 = 0;
		int b4 = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				(sz[i]) = Integer.parseInt(tempVar2);
			}
		}
		i = 0;
		while (i < n)
		{
			if ((sz[i]) <= 18)
			{
				b1++;
			}
			else if ((sz[i]) <= 35)
			{
					b2++;
			}
			else if ((sz[i]) <= 60)
			{
						b3++;
			}
			else
			{
				   b4++;
			}
			i++;
		}
		 x = 1.00 * b1 / n * 100;
		 y = 1.0000 * b2 / n * 100;
		 z = 1.0000 * b3 / n * 100;
		 p = 1.0000 * b4 / n * 100;
		 System.out.printf("1-18: %.2lf%\n",x);
		 System.out.printf("19-35: %.2lf%\n",y);
		 System.out.printf("36-60: %.2lf%\n",z);
		 System.out.printf("60??: %.2lf%\n",p);


		 return 0;
	}

}

