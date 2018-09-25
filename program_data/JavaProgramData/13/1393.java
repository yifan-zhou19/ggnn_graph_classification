package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[100000];
		int i;
		int j;
		int k;
		int l;
		int m;
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		l = 0;
		for (i = 1;i <= n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[i] = Integer.parseInt(tempVar2);
			}
		}

		for (i = 1;i <= n;i++)
		{



				m = 0;
				for (k = 1;k < i;k++)
				{
					if (a[k] != a[i])
					{
						m = m + 1;
					}

				}
				if (m == i - 1)
				{
					l = l + 1;
				if (l == 1)
				{
					System.out.printf("%d",a[i]);
				}
				else
				{
					System.out.printf(" %d",a[i]);
				}
				}



		}

		return 0;
	}
}

