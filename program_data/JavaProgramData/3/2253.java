package <missing>;

public class GlobalMembers
{
	public static int check(int q, int t, int[] b)
	{
		int i;
		int j;
		for (i = 0;i < t;i++)
		{
			for (j = 0;j < t;j++)
			{
				if (i == j)
				{
					continue;
				}
				if (b[i] + b[j] == q)
				{
					return 1;
				}
			}
		}
		return 0;
	}
	public static int Main()
	{
		int n;
		int k;
		int[] a = new int[1000];
		int i;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			k = Integer.parseInt(tempVar2);
		}
		for (i = 0;i < n;i++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				a[i] = Integer.parseInt(tempVar3);
			}
		}
		if (check(k, n, a) != 0)
		{
			System.out.print("yes\n");
		}
		else
		{
			System.out.print("no\n");
		}
		return 0;
	}

}

