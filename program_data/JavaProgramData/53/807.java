package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int n;
		int[] a = new int[300];
		int[] flag = new int[300];
		int last;

		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0; i < n; i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[i] = Integer.parseInt(tempVar2);
			}
		}

		for (i = 0; i < n - 1; i++)
		{
			for (j = i + 1; j < n; j++)
			{
				if (flag[j] == 0 && a[i] == a[j])
				{
					flag[j] = 1;
				}
			}
		}

		for (i = n - 1; i >= 0; i--)
		{
			if (flag[i] == 0)
			{
				last = i;
				break;
			}
		}
		for (i = 0; i < last; i++)
		{
			if (flag[i] == 0)
			{
				System.out.printf("%d,", a[i]);
			}
		}
		System.out.printf("%d", a[last]);

		return 0;
	}


}

