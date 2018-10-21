package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		final String a = "";
		final String b = "";
		int i;
		int j;
		int m = 0;
		int n;
		int k;
		int[] x = new int[300];
		int max = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			a = tempVar2.charAt(0);
		}
		k = a.length();
		for (i = 0;i <= k - n;i++)
		{
			for (j = i;j < i + n;j++)
			{
				b.charAt(m)[j - i] = a.charAt(j);
			}
			m = m + 1;
		}
		m = m - 1;
		for (i = 0;i <= m;i++)
		{
			for (j = i;j <= m;j++)
			{
				if (strcmp(b.charAt(i),b.charAt(j)) == 0)
				{
					x[i] = x[i] + 1;
				}
			}
		}
		for (j = 0;j < i;j++)
		{
			if (x[j] >= max)
			{
				max = x[j];
			}
		}
		if (max > 1)
		{
		System.out.printf("%d\n",max);
		for (j = 0;j < i;j++)
		{
			if (x[j] == max)
			{
				System.out.printf("%s\n",b.charAt(j));
			}
		}
		}
		else
		{
			System.out.print("NO");
		}
	}

}

