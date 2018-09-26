package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int N;
		int i;
		int k;
		int e;
		int h;
		int t;
		h = 0;
		int[] a = new int[500];
		int[] b = new int[500];
		int[] c = new int[500];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			N = Integer.parseInt(tempVar);
		}
		for (i = 0;i < N;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[i] = Integer.parseInt(tempVar2);
			}
			 if (a[i] % 2 != 0)
			 {
				 c[i] = 1;
				 b[h] = a[i];
				 h += c[i];
			 }

		}
		t = h;
		for (k = 1;k <= t;k++)
		{
			for (h = 0;h < t - k;h++)
			{
				if (b[h] > b[h + 1])
				{
					e = b[h + 1];
					b[h + 1] = b[h];
					b[h] = e;
				}
			}
		}
		for (h = 0;h < t;h++)
		{
			if (h == t - 1)
			{
			 System.out.printf("%d",b[h]);
			}
			else
			{
			 System.out.printf("%d%c",b[h],',');
			}
		}
		return 0;
	}
}

