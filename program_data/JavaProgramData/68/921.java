package <missing>;

public class GlobalMembers
{
	public static int n;
	public static int[] a = new int[100000];
	public static int u;
	public static int[] b = new int[100000];

	public static int zs(int x)
	{
		for (int i = 2;i <= Math.sqrt(x);i++)
		{
			if (x % i == 0)
			{
			   return 0;
			}
		}
		return 1;
	}

	public static void inits()
	{
		 a[1] = 0;
		 u = 0;
		 for (int i = 2;i <= n;i++)
		 {
			 if (zs(i) != 0)
			 {
				 a[i] = 1;
				 u++;
				 b[u] = i;
			 }
			 else
			 {
			 a[i] = 0;
			 }
		 }
		 return;
	}

	public static int Main()
	{
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		inits();
		for (int i = 6;i <= n;i++)
		{
			if ((i % 2) == 0)
			{
				for (int j = 1;j <= u;j++)
				{
					if (a[b[j]] != 0 && a[i - b[j]] != 0)
					{
					   System.out.printf("%d=%d+%d\n",i,b[j],i - b[j]);
					   break;
					}
					if (b[j] > i / 2)
					{
					break;
					}
				}
			}
		}
		return 0;
	}

}

