package <missing>;

public class GlobalMembers
{
	public static int s = 0;

	public static void find(int min,int dev)
	{
		int i;
		for (i = min;i <= Math.sqrt((float)dev);i++)
		{
		   if (dev % i == 0)
		   {
					 s++;
					 find(i, dev / i);
		   }
		}
	}

	public static int Main()
	{
		int n;
		int i;
		int m;
		int j;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		for (j = 1;j <= m;j++)
		{
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			n = Integer.parseInt(tempVar2);
		}
		for (i = 2;i <= Math.sqrt((float)n);i++)
		{
			if (n % i == 0)
			{
					 s++;
					 find(i, n / i);
			}
		}
			System.out.printf("%d\n",s + 1);
			s = 0;
		}
		//getchar();
		//getchar();
		return 0;
	}
}

