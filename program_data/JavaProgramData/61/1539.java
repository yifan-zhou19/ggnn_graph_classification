package <missing>;

public class GlobalMembers
{
	public static int F(int n)
	{
		int[] k = new int[999];
		int i = 1;
		k[1] = 1;
		k[2] = 1;

		if (n == 1)
		{
			return 1;
		}
		if (n == 2)
		{
			return 1;
		}
		else
		{
			for (i = 3;i <= n;i++)
			{
				k[i] = k[i - 1] + k[i - 2];
			}
		}
			return k[n];
	}
	public static int Main()
	{
		int n;
		int[] m = new int[999];
		int j = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (j = 0;j < n;j++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				m[j] = Integer.parseInt(tempVar2);
			}
		}
		j = 0;
		for (j = 0;j < n;j++)
		{
			System.out.printf("%d\n",F(m[j]));
		}
		return 0;
	}

}

