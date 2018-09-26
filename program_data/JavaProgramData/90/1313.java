package <missing>;

public class GlobalMembers
{
	public static int fang(int m1,int n1)
	{
		if (n1 == 1)
		{
			return (1);
		}
		if (m1 > n1)
		{
		return (fang(m1, n1 - 1) + fang(m1 - n1, n1));
		}
		if (m1 == n1)
		{
		return (fang(m1, n1 - 1) + 1);
		}
		if (m1 < n1)
		{
		return (fang(m1, m1));
		}
	}
	public static int Main()
	{
		int t;
		int[] m = new int[21];
		int[] n = new int[21];
		int i;
		int[] s = new int[21];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			t = Integer.parseInt(tempVar);
		}
		for (i = 0;i < t;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				m[i] = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				n[i] = Integer.parseInt(tempVar3);
			}
			s[i] = fang(m[i], n[i]);
		}
		for (i = 0;i < t;i++)
		{
		System.out.printf("%d\n",s[i]);
		}

	}

}

