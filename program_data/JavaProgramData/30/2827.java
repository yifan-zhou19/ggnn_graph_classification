package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[100];
		int b;
		int c;
		int n;
		int i;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		b = 0;
		for (i = 0;i < 100;i++)
		{
			a[i] = i + 1;
		}
		for (i = 1;i <= n;i++)
		{
			if ((a[i - 1] % 7 == 0) || ((int)Math.floor(a[i - 1] / 10) == 7) || (a[i - 1] % 10 == 7))
			{
				c = 0;
			}
			else
			{
				b += a[i - 1] * a[i - 1];
			}
		}
		System.out.printf("%d",b);
		return 0;
	}
}

