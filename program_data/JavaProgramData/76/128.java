package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int[] a = new int[10000];
		int[] b = new int[10000];
		int k;
		int t;
		char result = 'y';
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 1;i <= n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[i] = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				b[i] = Integer.parseInt(tempVar3);
			}
		}
		for (t = 1;t < n;t++)
		{
			for (k = 1;k < n;k++)
			{
				for (i = k + 1;i <= n;i++)
				{
					if (a[k] >= a[i] != 0 && a[k] <= b[i] != 0 && b[k] >= b[i])
					{
						a[k] = a[i];
					}
					else if (b[k] >= a[i] != 0 && b[k] <= b[i] != 0 && a[k] <= a[i])
					{
						b[k] = b[i];
					}
					else if (b[k] >= a[i] != 0 && b[k] <= b[i] != 0 && a[k] >= a[i])
					{
						a[k] = a[i];
						b[k] = b[i];
					}
				}
			}
		}
		for (i = 1;i <= n;i++)
		{
			if (a[1] <= a[i] != 0 && b[1] >= b[i])
			{
				result = 'y';
			}
			else
			{
				result = 'n';
				break;
			}
		}
		if (result == 'y')
		{
			System.out.printf("%d %d",a[1],b[1]);
		}
		else if (result == 'n')
		{
			System.out.print("no");
		}
		return 0;
	}

}

