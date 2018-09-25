package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		char[][] w = new char[999][26];
		char m;
		int[] a = new int[999];
		int[] c = new int[26];
		int i;
		int j;
		int n;
		int t;
		int max;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i <= 25;i++)
		{
			c[i] = 0;
		}
		for (i = 0;i <= n - 1;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[i] = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				w[i] = tempVar3.charAt(0);
			}
		}
		for (i = 0;i <= n - 1;i++)
		{
			for (j = 0;w[i][j] != '\0';j++)
			{
				c[w[i][j] - 65] += 1;
			}
		}
		max = c[0];
		m = 65;
		for (i = 0;i <= 25;i++)
		{
			if (c[i] > max)
			{
				max = c[i];
				m = i + 65;
			}
		}
		System.out.printf("%c\n",m);
		System.out.printf("%d\n",max);
		for (i = 0;i <= n - 1;i++)
		{
			for (j = 0;w[i][j] != '\0';j++)
			{
				if (w[i][j] == m)
				{
					System.out.printf("%d\n",a[i]);
				}
			}
		}
	}
}

