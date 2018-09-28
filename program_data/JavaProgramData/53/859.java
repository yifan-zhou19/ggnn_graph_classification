package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int[] a = new int[100];
		int[] c = new int[100];
		int k = 0;
		int t = 0;
		int j;
		int[] b = new int[100];
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
			t = a[i];
			for (j = 1;j < n - i;j++)
			{
				if (a[i + j] == t)
				{
					b[i + j] = 1;
				}
			}
		}
		for (i = 0;i < n;i++)
		{
			if (b[i] == 0)
			{
				c[k] = a[i];
				k++;
			}
		}
		for (i = 0;i < k - 1;i++)
		{
			System.out.printf("%d,",c[i]);
		}
		System.out.printf("%d",c[k - 1]);
		return 0;
	}


}

