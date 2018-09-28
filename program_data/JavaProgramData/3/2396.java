package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int k;
		int i;
		int m;
		int e;
		int[] p = new int[1000];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			k = Integer.parseInt(tempVar2);
		}
		e = n;
		for (i = 1;i <= n;i++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				p[i] = Integer.parseInt(tempVar3);
			}
		}
		for (m = 1;m <= n - 1;m++)
		{
			for (i = m + 1;i <= n;i++)
			{
				if (p[m] + p[i] == k)
				{
					System.out.print("yes");
					e = i;
					break;
				}
				else if (m == n - 1 && i == n)
				{
					System.out.print("no");
					e = i;
					break;
				}
			}
			if (e != n || (m == n - 1 && e == n))
			{
				break;
			}
		}
		return 0;
	}

}

