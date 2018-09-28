package <missing>;

public class GlobalMembers
{
	public static int fbnq(int x)
	{
		if (x == 0)
		{
		   return 1;
		}
		 if (x == 1)
		 {
		   return 2;
		 }
		 return fbnq(x - 1) + fbnq(x - 2);
	}
	public static int Main()
	{
		int n;
		int i;
		int k;
		int[] sz = new int[100];
		double result;
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
			result = 0;
			for (k = 0;k < sz[i];k++)
			{
				result += fbnq(k + 1) * 1.0 / fbnq(k);
			}
			System.out.printf("%.3lf\n",result);
		}


		return 0;
	}

}

