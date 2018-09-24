package <missing>;

public class GlobalMembers
{
	public static int sdw(int a,int b)
	{
		int i;
		int m = 1;
		for (i = a;i < b / 2;i++)
		{
						  if (b % i == 0)
						  {
									if (i <= b / i)
									{
									m = sdw(i, b / i) + m;
									}
						  }
		}
		return m;
	}
	public static int Main()
	{
		int n;
		int i;
		int p;
		int b;
		int[] a = new int[1000];
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
							a[i] = Integer.parseInt(tempVar2);
						}
		}
		for (i = 0;i < n;i++)
		{
						b = a[i];
						p = sdw(2, b);
						System.out.printf("%d\n",p);
		}
			return 0;
	}
}

