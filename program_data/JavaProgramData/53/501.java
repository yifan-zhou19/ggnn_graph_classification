package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int i = 0;
		int[] a = new int[300];
		int j;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		while (i < n)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[i] = Integer.parseInt(tempVar2);
			}
			i++;
		}
		for (j = 0;j < n;j++)
		{
			if (a[j] != 0)
			{
				for (i = j + 1;i <= n - 1;i++)
				{
				if (a[j] == a[i])
				{
					a[i] = 0;
				}
				}
			}
		}
		System.out.printf("%d",a[0]);
		for (i = 1;i <= n - 1;i++)
		{
			if (a[i] == 0)
			{
				continue;
			}
			if (a[i] != 0)
			{
			System.out.printf(",%d",a[i]);
			}
		}
	}


}

