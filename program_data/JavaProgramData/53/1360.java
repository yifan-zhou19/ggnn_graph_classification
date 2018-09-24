package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[300];
		int i;
		int j;
		int[] b = new int[300];
		int n;
		int e;
		int k = 0;
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
			e = 0;
			for (j = 0;j < n;j++)
			{
				if (a[i] == a[j] && i > j)
				{
					e = 1;
				}
			}
			if (e == 0)
			{
				b[k] = a[i];
				k = k + 1;
			}
		}
		for (i = 0;i < k - 1;i++)
		{
			System.out.printf("%d",b[i]);
			System.out.print(",");
		}
		System.out.printf("%d",b[k - 1]);
		return 0;
	}
}

