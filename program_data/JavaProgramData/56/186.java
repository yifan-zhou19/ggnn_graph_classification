package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int[] a = new int[5];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}

		int m = (int)Math.log10(n);
		int i;
		for (i = 0; i <= m; i++)
		{
			a[i] = n % 10;
			n = n / 10;
		}
		for (i = 0; i <= m; i++)
		{
			System.out.printf("%d", a[i]);
		}
		System.out.print("\n");
		return 0;
	}

}

