package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int k;
		int t;
		int i;
		int[] a = new int[1000];
		int s = 0;
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
		for (i = 0;i <= n - 1;i++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				a[i] = Integer.parseInt(tempVar3);
			}
		}
		for (i = 0;i <= n - 1;i++)
		{
			for (t = i + 1;t <= n - 1;t++)
			{
				if ((a[i] + a[t]) == k)
				{
					s += 1;
				}
				else
				{
					s += 0;
				}
			}
		}
		if (s == 0)
		{
			System.out.print("no");
		}
		else
		{
			System.out.print("yes");
		}
		return 0;
	}

}

