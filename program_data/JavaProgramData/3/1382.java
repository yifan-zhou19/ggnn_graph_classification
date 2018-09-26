package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m = 0;
		int k;
		int n;
		int i = 0;
		int j = 0;
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
		for (i = 0;i < n;i++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				a[i] = Integer.parseInt(tempVar3);
			}
		}
		i = 0;
		for (j = 0;j < n;j++)
		{
			i = 0;
			for (i = 0;i < n;i++)
			{
				if (i != j)
				{
					if ((a[i] + a[j]) == k)
					{
						m = 1;
						break;
					}
				}
			}
		}
		if (m == 1)
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

