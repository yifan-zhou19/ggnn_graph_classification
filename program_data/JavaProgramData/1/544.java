package <missing>;

public class GlobalMembers
{
	public static int f(int m,int l)
	{
		int re = 0;
		int j;
		if (l == 4)
		{
		  re = 1;
		}
		if (l > 4)
		{
			for (j = m;j <= Math.sqrt(l);j++)
			{
				if (l % j == 0)
				{
					re = re+1 + f(j, l / j);
				}
			}
		}
		return re;
	}
	public static int Main()
	{
		int n;
		int i;
		int[] a = new int[100];
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
			System.out.printf("%d\n",(f(2, a[i]) + 1));
		}

	}



}

