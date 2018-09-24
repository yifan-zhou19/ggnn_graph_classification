package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i = 1;
		int[] a = {-1, -1, -1, -1, -1};
		int m = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		while (i < n)
		{
			a[m] = (int)((n % (i * 10)) / i);
			i *= 10;
			m++;
		}
		for (i = 0;i < 5;i++)
		{
			if (a[i] != -1)
			{
				System.out.printf("%d", a[i]);
			}
		}
		return 0;
	}

}

