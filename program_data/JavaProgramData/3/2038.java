package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int k;
		int a;
		int b;
		int c;
		int[] z = new int[1000];
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
		c = 0;
		for (a = 0;a <= n - 1;a++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				z[a] = Integer.parseInt(tempVar3);
			}
		}
		for (a = 0;a <= n - 1;a++)
		{
			for (b = 0;b <= n - 1;b++)
			{
				if (z[a] + z[b] == k)
				{
					c = 1;
				}
			}
		}
		if (c == 1)
		{
			System.out.print("yes");
		}
		else
		{
			System.out.print("no");
		}
		return 0;
	}


}

