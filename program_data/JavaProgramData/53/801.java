package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int[] a = new int[N];
		int[] b = new int[N];
		int i;
		int m;
		int j = 0;
		int r;
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[i] = Integer.parseInt(tempVar2);
			}
		}

		for (i = n - 1;i >= 0;i--)
		{
			m = 0;
			for (r = i - 1;r >= 0;r--)
			{
				if (a[i] == a[r])
				{
					m++;
				}
			}
			if (m == 0)
			{
			 b[j] = a[i];
			 j++;
			}
		}
		for (i = j - 1;i > 0;i--)
		{
			System.out.printf("%d,",b[i]);
		}
		System.out.printf("%d",b[0]);


		return 0;
	}

}

