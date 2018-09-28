package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int[] a = new int[100001];
		int i;
		int j;
		int k;
		int g;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}

		for (i = 0; i < n; i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[i] = Integer.parseInt(tempVar2);
			}
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			k = Integer.parseInt(tempVar3);
		}

		g = 0;
		for (i = 0; i < n; i++)
		{
			if (a[i] == k)
			{
				continue;
			}

				if (g == 1)
				{
					System.out.printf(" %d", a[i]);
				}
				else
				{
					System.out.printf("%d", a[i]);
					g = 1;
				}

		}
		return 0;
	}

}

