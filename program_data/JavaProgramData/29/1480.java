package <missing>;

public class GlobalMembers
{
	public static float f(int n)
	{
		float s;
		if (n == 1)
		{
			return s = 1.000F;
		}

		if (n == 2)
		{
			return s = 2.000F;
		}
		if (n != 1 && n != 2)
		{
			return s = f(n - 1) + f(n - 2);
		}
	}
	public static int Main()
	{
		int x;
		int y;
		int i;
		int j;
		int k;
		float sum;
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				x = Integer.parseInt(tempVar);
			}
			for (i = 0;i < x;i++)
			{
				String tempVar2 = ConsoleInput.scanfRead();
				if (tempVar2 != null)
				{
					y = Integer.parseInt(tempVar2);
				}
				sum = 0F;
				k = 1;
				for (j = 0;j < y;j++)
				{
					sum = sum + f(k + 1) / f(k);
					k++;
				}
				System.out.printf("%.3f\n",sum);
			}
		}
	}

}

