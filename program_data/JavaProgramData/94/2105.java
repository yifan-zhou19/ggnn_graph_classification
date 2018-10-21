package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int[] a = new int[500];
		int i;
		int j = 0;
		int m;
		int[] b = new int[500];
		int t;
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
			if (a[i] % 2 != 0)
			{
				 b[j] = a[i];
				 j++;
			}
		}
		m = j + 1;
		for (j = 1;j < m;j++)
		{
			for (i = 0;i < m - j;i++)
			{
				if (b[i] > b[i + 1])
				{
					t = b[i];
					b[i] = b[i + 1];
					b[i + 1] = t;
				}
			}
		}
		System.out.printf("%d",b[1]);
		for (j = 2;j < m;j++)
		{
			System.out.printf(",%d",b[j]);
		}
		return 0;
	}
}

