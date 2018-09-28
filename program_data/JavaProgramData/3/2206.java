package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] u = new int[1000];
		int[] v = new int[1000];
		int i;
		int j;
		int n;
		int k;
		int a = 0;
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
		for (i = 0;i < n;i++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				u[i] = Integer.parseInt(tempVar3);
			}
		}
		for (j = 0;j < n;j++)
		{
			v[j] = u[j];
		}
		for (i = 0;i < n;i++)
		{
			for (j = 0;j < n;j++)
			{
				if (i == j)
				{
					continue;
				}
				else
				{
					if (u[i] + v[j] == k)
					{
						a++;
					}
					else
					{
						continue;
					}
				}
			}
		}
		if (a == 0)
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

