package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[100];
		int n;
		int m;
		int t;
		int i;
		int j;
		int x;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			m = Integer.parseInt(tempVar2);
		}
		for (i = 0;i < n;i++)
		{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					a[i] = Integer.parseInt(tempVar3);
				}
		}
		for (i = 0;i < m;i++)
		{
				for (j = n - 1;j >= -1;j--)
				{
						if (j == n - 1)
						{
						x = a[n - 1];
						}
						else if (j == -1)
						{
						a[0] = x;
						}
						else
						{
							a[j + 1] = a[j];
						}
				}
		}
		System.out.printf("%d",a[0]);
		for (i = 1;i < n;i++)
		{
				System.out.printf(" %d",a[i]);
		}
		return 0;
	}
}

