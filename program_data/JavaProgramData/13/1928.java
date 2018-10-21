package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int a;
		int b = 0;
		int m;
		int[] c = new int[91];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0,m = 0;i < n;i++)
		{
			b = 0;
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a = Integer.parseInt(tempVar2);
			}
			for (j = 0;j < 91;j++)
			{
				if (c[j] == a)
				{
					b = 1;
				}
			}
			if (b == 0)
			{
				c[m] = a;
				m = m + 1;
			}
		}
		System.out.printf("%d",c[0]);
		for (i = 1;i < m;i++)
		{
			System.out.printf(" %d",c[i]);
		}
		return 0;
	}


}

