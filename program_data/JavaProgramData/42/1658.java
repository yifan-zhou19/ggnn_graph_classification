package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int[] a = new int[100000];
		int k;
		int i;
		int j;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[i] = Integer.parseInt(tempVar2);
			}
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			k = Integer.parseInt(tempVar3);
		}
		for (i = 0;i < n;)
		{
			if (a[i] == k)
			{
				if (i == n - 1)
				{
					n = n - 1;
					break;
				}
				else
				{
					for (j = i;j < n - 1;j++)
					{
						a[j] = a[j + 1];
					}
					n = n - 1;
				}
				continue;

			}
			i += 1;
		}
		for (i = 0;i < n;i++)
		{
			if (i == 0)
			{
			System.out.printf("%d",a[i]);
			}
			else
			{
			System.out.printf(" %d",a[i]);
			}
		}
		System.out.print("\n");
		return 0;
	}
}

