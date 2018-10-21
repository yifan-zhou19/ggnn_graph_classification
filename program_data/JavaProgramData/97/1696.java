package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int[] a = new int[7];
		int[] b = new int[6];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		a[1] = n / 100;
		b[1] = n % 100;
		System.out.printf("%d\n", a[1]);
		a[2] = b[1] / 50;
		b[2] = b[1] % 50;
		System.out.printf("%d\n", a[2]);
		a[3] = b[2] / 20;
		b[3] = b[2] % 20;
		System.out.printf("%d\n", a[3]);
		a[4] = b[3] / 10;
		b[4] = b[3] % 10;
		System.out.printf("%d\n", a[4]);
		a[5] = b[4] / 5;
		b[5] = b[4] % 5;
		System.out.printf("%d\n", a[5]);
		a[6] = b[5] / 1;
		System.out.printf("%d\n", a[6]);
		return 0;
	}
}

