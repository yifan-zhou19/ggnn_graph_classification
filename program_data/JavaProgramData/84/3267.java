package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int[] a = new int[101];
		int n;
		int j;
		int b = 0;
		int t;
		int c = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (j = 0;j < n;j = j + 1)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[j] = Integer.parseInt(tempVar2);
			}
		}
		while (b < n - 1)
		{
			if (a[b] > a[b + 1])
			{
				t = a[b];
				a[b] = a[b + 1];
				a[b + 1] = t;
			}
			b = b + 1;
		}
		while (c < n - 2)
		{
			if (a[c] > a[c + 1])
			{
				t = a[c];
				a[c] = a[c + 1];
				a[c + 1] = t;
			}
			c = c + 1;
		}
		System.out.printf("%d\n%d\n",a[n - 1],a[n - 2]);
	}

}

