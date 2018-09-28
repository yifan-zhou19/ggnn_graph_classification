package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int e;
		int j;

		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int[] a = new int[100];
		int[] b = new int[100];

		for (i = 0;i < n;i++)
		{
	String tempVar2 = ConsoleInput.scanfRead();
	if (tempVar2 != null)
	{
		(a[i]) = Integer.parseInt(tempVar2);
	}

		}
		for (j = 0;j < n;j++)
		{
	   b[j] = a[n - j - 1];
		}
		for (e = 0;e < n;e++)
		{
			if (e == n - 1)
			{
				System.out.printf("%d",b[e]);
			}
			else
			{
				System.out.printf("%d ",b[e]);
			}
		}
			return 0;
	}

}

