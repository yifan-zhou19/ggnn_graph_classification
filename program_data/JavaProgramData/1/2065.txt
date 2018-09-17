package <missing>;

public class GlobalMembers
{
	public static int times;
	public static void fenjie(int m,int k)
	{
		int i;
		{
			for (i = k;i <= Math.sqrt(m);i++)
			{
				if (m % i == 0)
				{
					fenjie(m / i, i);
				}
			}
		}
		times++;
	}
	public static int Main()
	{
		int n;
		int i;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			int m;
			times = 0;
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				m = Integer.parseInt(tempVar2);
			}
			fenjie(m, 2);
			System.out.printf("%d\n",times);
		}
	}
}

