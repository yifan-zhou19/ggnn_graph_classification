package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int k;
		int z;
		int[] a = new int[1000];
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		i = Integer.parseInt(tempVar);
	}
	String tempVar2 = ConsoleInput.scanfRead();
	if (tempVar2 != null)
	{
		k = Integer.parseInt(tempVar2);
	}
	String tempVar3 = ConsoleInput.scanfRead();
	if (tempVar3 != null)
	{
		a[0] = Integer.parseInt(tempVar3);
	}
	a[0] = k - a[0];
	for (j = 1;j <= i - 1;j++)
	{
		String tempVar4 = ConsoleInput.scanfRead();
		if (tempVar4 != null)
		{
			a[j] = Integer.parseInt(tempVar4);
		}
		for (z = 0;z <= j - 1;z++)
		{
			if (a[j] == a[z])
			{
				System.out.print("yes");
				return 0;
			}
		}
		a[j] = k - a[j];
	}
	System.out.print("no");
	return 0;
	}
}

