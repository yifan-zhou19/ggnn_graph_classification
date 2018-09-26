package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[100];
		int[] b = new int[100];
		int n;
		int i;
		int j;
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
		for (i = 0,j = n - 1; i<n,j >= 0; i++,j--)
		{
		   b[j] = a[i];
		}
		for (j = 0; j < n - 1; j++)
		{
			System.out.printf("%d ", b[j]);
		}
		if (j = n - 1)
		{
			System.out.printf("%d",b[j]);
		}
		return 0;
	}
}

