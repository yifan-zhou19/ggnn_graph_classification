package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int[] x = new int[1000];
		int[] y = new int[1000];
		int n;
		int k;
		int i;
		int j;
		int he;
		int z = 0;
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
				x[i] = Integer.parseInt(tempVar3);
			}
			y[i] = x[i];
		}
		for (i = 0;i < n;i++)
		{
			for (j = i + 1;j < n;j++)
			{
				he = x[i] + y[j];
				if (he == k)
				{
					z += 1;
				}
				else
				{
					z += 0;
				}
			}
		}
	if (z > 0)
	{
		System.out.print("yes");
	}
	else
	{
		System.out.print("no");
	}
	}
}

