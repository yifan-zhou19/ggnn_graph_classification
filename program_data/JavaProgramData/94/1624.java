package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int[] a = new int[1000];
		int i;
		int w = 0;
		int t;
		int r;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i <= n - 1;i = i + 1)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[i] = Integer.parseInt(tempVar2);
			}
		}
		int[] b = new int[1000];
		for (i = 0;i <= n;i = i + 1)
		{
			if (a[i] % 2 == 1)
			{
				b[w] = a[i];
				w = w + 1;
			}
		}

		for (r = w - 1;r >= 1;r = r - 1)
		{
			for (i = 0;i <= w - 1 - 1;i = i + 1)
			{
				if (b[i] > b[i + 1])
				{
					t = b[i];
					b[i] = b[i + 1];
					b[i + 1] = t;
				}
			}
		}
			System.out.printf("%d",b[0]);
			for (i = 1;i <= w - 1;i = i + 1)
			{
			System.out.printf(",%d",b[i]);
			}
		return 0;
	}

}

