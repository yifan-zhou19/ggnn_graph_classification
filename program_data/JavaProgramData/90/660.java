package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] m = new int[21];
		int[] n = new int[21];
		int t;
		int i;
		int count1 = new int(int,int);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			t = Integer.parseInt(tempVar);
		}
		for (i = 1;i <= t;i++)
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
		}
		for (i = 1;i <= t;i++)
		{
			System.out.printf("%d\n",count1(m[i], n[i]));
		}
		return 0;
	}
	public static int count1(int m,int n)
	{
		int k;
		if (n == 1 || n == 0)
		{
			return 1;
		}
		if (m == 1 || m == 0)
		{
			return 1;
		}
		if (m < n)
		{
			return count1(m, m);
		}
		k = count1(m, n - 1) + count1(m - n, n);
		return k;
	}
}

