package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int k;
		int[] a = new int[1000];
		int YN = 0;
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
		for (int i = 0;i < n;i++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				a[i] = Integer.parseInt(tempVar3);
			}
		}
		for (int j = 0;j < n - 1;j++)
		{
			for (int m = j;m < n;m++)
			{
				int he = a[j] + a[m];
				if (he == k)
				{
					YN = 1;
					break;
				}
			}
		}
		if (YN == 1)
		{
			System.out.print("yes");
		}
		else if (YN == 0)
		{
			System.out.print("no");
		}
		return 0;
	}
}

