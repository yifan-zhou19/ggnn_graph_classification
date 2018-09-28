package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int n;
		int m;
		int[] k = new int[10];
		int u = 0;
		int c;
		int sum;
		int[] l = new int[10];
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
				m = Integer.parseInt(tempVar2);
			}
			c = 60;
			for (j = 0;j < m;j++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					k[j] = Integer.parseInt(tempVar3);
				}
				if (k[j] <= c)
				{
					c = (k[j] + 3 > c)?k[j]:(c - 3);
				}
			}
			l[i] = c;
		}
		for (i = 0;i < n;i++)
		{
			System.out.printf("%d\n",l[i]);
		}
		return 0;
	}

}

