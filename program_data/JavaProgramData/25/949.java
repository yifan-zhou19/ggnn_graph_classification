package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int j;
		int i;
		int k;
		int t = 1;
		int l;
		int p = 0;
		int[] a = new int[50000];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		a[0] = 1;
		l = 1;
		for (i = 0;i < n;i++)
		{
			t = l;
						for (j = 0;j < t;j++)
						{
										a[j] = 2 * a[j];
										if (a[j] + p >= 10)
										{
											a[j] = a[j] + p - 10;
											p = 1;
										}
										else
										{
											a[j] += p;
											p = 0;
										}
										if ((j == t - 1) && p == 1)
										{
											a[j + 1] = 1;
											l++;
											p = 0;
										}
						}




		}
		for (i = l - 1;i >= 0;i--)
		{
		System.out.printf("%d",a[i]);
		}
		System.in.read();
		System.in.read();
		System.in.read();

	}
}

