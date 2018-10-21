package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int max = int m[500];
		int i = 0;
		int j = 0;
		int k = 0;
		int n;
		int p;
		int x;
		final String c = "";
		int[] m = new int[500];
		final String a = "";
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			c = tempVar2.charAt(0);
		}
		for (i = 1;i < (L - n + 1);i++)
		{
			for (j = 0;j < i;j++)
			{
				p = 0;
				for (k = 0;k < n;k++)
				{
					if (c.charAt(i + k) == c.charAt(j + k))
					{
						p++;
					}
				}
				if (p == n)
				{
					m[j]++;
				}
			}
		}
		x = max(m) + 1;
		if (x > 1)
		{
		System.out.printf("%d\n",x);
		for (i = 0;i < L;i++)
		{
			if (m[i] == max(m))
			{
				for (k = 0;k < n;k++)
				{
					a = tangible.StringFunctions.changeCharacter(a, k, c.charAt(i + k));
				}
				System.out.printf("%s\n",a);
			}
		}
		}
		else
		{
			System.out.print("NO\n");
		}
		return 0;
	}
	public static int max(int[] m)
	{
		int i;
		int x = 0;
		for (i = 0;i < 500;i++)
		{
			if (m[i] > m[x])
			{
				x = i;
			}
		}
		return (m[x]);
	}
}

