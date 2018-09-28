package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int n;
		int[] a = new int[10];
		int[] b = new int[10];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		a[1] = 100;
		a[2] = 50;
		a[3] = 20;
		a[4] = 10;
		a[5] = 5;
		a[6] = 1;
		b[1] = n / a[1];
		System.out.printf("%d\n", b[1]);
		for (i = 2;i <= 6;i++)
		{
			n = n - a[i - 1] * b[i - 1];
			b[i] = n / a[i];
			System.out.printf("%d\n", b[i]);
		}

		return 0;
	}
}

