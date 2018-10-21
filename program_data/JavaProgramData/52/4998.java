package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int m;
		int i;
		int[] a = new int[101];
		int j;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
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
		for (j = 1;j <= m;j++)
		{
			for (i = n - 1;i >= 0;i--)
			{
				a[i + 1] = a[i];
			}
			a[0] = a[n];
		}
		for (i = 0;i < n;i++)
		{
			System.out.printf("%d",a[i]);
			if (i < n - 1)
			{
				System.out.print(" ");
			}
		}

		return 0;
	}
}

