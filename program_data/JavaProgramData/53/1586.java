package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int n;
		int m;
		int[] a = new int[100];
		int[] s = new int[100];
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
		for (j = 0;j < n - 1;j++)
		{
			for (i = j + 1;i < n;i++)
			{
				if (a[i] == a[j] && a[j] != 0)
				{
					a[i] = 0;
				}
			}
		}

		j = 0;
		for (i = 0;i < n;i++)
		{
			if (a[i] != 0)
			{
				s[j++] = a[i];
			}
		}

		m = j;
		for (i = 0;i < m - 1;i++)
		{
			System.out.printf("%d,",s[i]);
		}
		System.out.printf("%d\n",s[m - 1]);
	}
}

