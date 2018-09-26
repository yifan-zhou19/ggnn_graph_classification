package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int k;
		int l;
		int a;
		int c;
		a = 0;
		int[] sz = new int[500];
		int[] sc = new int[500];
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
				sz[i] = Integer.parseInt(tempVar2);
			}
		}
		for (i = 0;i < n;i++)
		{
			if (sz[i] % 2 != 0)
			{
				a = a + 1;
			}
		}
		j = 0;
		for (k = 0;k < a;k++)
		{
			while (j < n)
			{
				if (sz[j] % 2 != 0)
				{
					break;
				}
				else
				{
					j++;
				}
			}
			sc[k] = sz[j];
			j++;
		}
		for (l = 0;l < a;l++)
		{
			for (k = a - 1;k > l + 1;k--)
			{
				if (sc[k - 1] > sc[k])
				{
					c = sc[k - 1];
					sc[k - 1] = sc[k];
					sc[k] = c;
				}
			}
		}
		for (l = 0;l < a - 1;l++)
		{
			System.out.printf("%d,",sc[l]);
		}
		System.out.printf("%d\n",sc[a - 1]);
		return 0;
	}
}

