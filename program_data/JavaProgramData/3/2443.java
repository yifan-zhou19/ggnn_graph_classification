package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int k;
		int[] a = new int[1000];

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
		for (int t = 0;t < n;t++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				a[t] = Integer.parseInt(tempVar3);
			}
		}
		for (int i = 0;i < n - 1;i++)
		{
			for (int m = i + 1;m < n;m++)
			{
				if (a[i] + a[m] == k)
				{
					System.out.print("yes");
					return 0;
				}
					if (i == n - 2 && m == n - 1 && a[i] + a[m] != k)
					{
						System.out.print("no");
						return 0;
					}
			}
		}
	}
}

