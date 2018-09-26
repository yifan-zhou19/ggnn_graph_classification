package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[60];
		int n;
		int m;
		int i = 0;
		int j = 0;
		int count = 60;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		for (j = 0; j < m; j++)
		{
			count = 60;
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			n = Integer.parseInt(tempVar2);
		}
		for (i = 0; i < n; i++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				a[i] = Integer.parseInt(tempVar3);
			}
		}

		for (i = 0; i < n; i++)
		{
			if (a[i] < count)
			{
				if (a[i] < count - 3)
				{
					count -= 3;
				}
				else
				{
					count = a[i];
					break;
				}
			}
			else
			{
				break;
			}
		}

		System.out.printf("%d\n", count);
		}
		return 0;
	}
}

