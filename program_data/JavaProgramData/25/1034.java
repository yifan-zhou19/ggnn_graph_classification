package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[100];
		int t = 0;
		int i;
		int j;
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		a[1] = 1;
		for (i = 1;i <= n;i++)
		{
			for (j = 90;j >= 1;j--)
			{
				a[j] *= 2;
				a[j + 1] += a[j] / 10;
				a[j] = a[j] % 10;
			}
		}
		n = 99;
		while (n != 0)
		{
			if (a[n] != 0)
			{
				t = 1;
			}
			if (t != 0)
			{
				System.out.printf("%d",a[n]);
			}
			n--;
		}
	}
}

