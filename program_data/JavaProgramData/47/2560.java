package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int[] a = new int[200];
		int[] b = new int[200];
		for (i = 1;i <= n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[i] = Integer.parseInt(tempVar2);
			}
			j = n + 1 - i;
			b[j] = a[i];
		}
		j = 1;
		while (j < n)
		{
			System.out.printf("%d ",b[j]);
			j = j + 1;
		}
		System.out.printf("%d",b[j]);
		return 0;
	}
}

