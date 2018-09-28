package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		int[] a = new int[300];
		int n;
		int i;
		int j;
		int k;
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
		for (i = 0;i < n;i++)
		{
			for (j = i + 1;j < n;j++)
			{
				if (a[i] == -1)
				{
					break;
				}
				else if (a[i] == a[j])
				{
					a[j] = -1;
				}
			}
		}
		for (k = n - 1;k >= 0;k--)
		{
			if (a[k] == -1)
			{
				continue;
			}
			else
			{
				break;
			}
		}
		for (i = 0;i < n;i++)
		{
			if (a[i] == -1)
			{
				continue;
			}
			else if (i == k)
			{
				System.out.printf("%d",a[i]);
			}
			else
			{
				System.out.printf("%d,",a[i]);
			}
		}

	}
}

