package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[6];
		int[] b = {100, 50, 20, 10, 5, 1};
		int n;
		int i;
		int m = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		a[0] = n / 100;
		for (i = 1;i < 6;i++)
		{
			m += a[i - 1] * b[i - 1];
			a[i] = (n - m) / b[i];

		}
		for (i = 0;i < 6;i++)
		{
			System.out.printf("%d\n",a[i]);
		}
		return 0;
	}
}

