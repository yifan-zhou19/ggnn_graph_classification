package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[300];
		int i = 1;
		int j;
		int b;
		int c = 0;
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a[0] = Integer.parseInt(tempVar);
		}
		while (scanf(",%d", a[i]))
		{
			i = i + 1;
		}
		b = a[0];
		for (j = 0;j < i;j++)
		{
		if (a[j] > b)
		{
			b = a[j];
		}
		}
		for (n = 0;n < i;n++)
		{
		if (a[n] > c && a[n] != b)
		{
			c = a[n];
		}
		}
		if (c == 0)
		{
			System.out.print("No\n");
		}
		else
		{
		System.out.printf("%d\n",c);
		}
		return 0;
	}

}

