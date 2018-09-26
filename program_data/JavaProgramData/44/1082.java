package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[6];
		int i;
		for (i = 0;i < 6;i++)
		{
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a[i] = Integer.parseInt(tempVar);
		}
		}
		for (i = 0;i < 6;i++)
		{
			fxs(a[i]);
		}
		return 0;

	}

	public static void fxs(int a)
	{
		int i;
		int b = 0;
		int[] c = new int[15];
		if (a < 0)
		{
			System.out.print("-");
		}

		a = Math.abs(a);
		for (i = 0;a > 0;a = a / 10,i++)
		{
			c[i] = a % 10;
			b++;
		}
		for (i = 0;i < b;i++)
		{
			a = c[i] * Math.pow(10,b - i - 1) + a;
		}
		System.out.printf("%d\n",a);
	}
}

