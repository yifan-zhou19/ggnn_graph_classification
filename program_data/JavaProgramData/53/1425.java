package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int[] a = new int[300];
		int i;
		int k;
		int want = -1;
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
		for (k = 0;k < n - 1;k++)
		{
			for (i = k + 1;i < n;i++)
			{
				if (a[k] == a[i])
				{
					a[i] = 0;
				}
			}
		}
		for (i = 0;i < n;i++)
		{
			if (want == -1)
			{
				System.out.printf("%d",a[i]);
				want = 0;
			}
			else
			{
			if (a[i] != 0)
			{
				System.out.printf(",%d",a[i]);
			}
			}
		}
		return 0;
	}

}

