package <missing>;

public class GlobalMembers
{
	public static int reverse(int a)
	{
		int[] c = new int[6];
		int[] b = new int[6];
		int[] d = new int[6];
		int i;
		int x;
		int y;
		int z = 0;
		if (a > 0)
		{
			x = Math.log10(a) + 1;
			b[0] = a;
			for (i = 0;i < x;i++)
			{
				y = Math.pow(10,x - i - 1);
				c[i] = b[i] / y;
				b[i + 1] = b[i] % y;
			}
			for (i = 0;i < x;i++)
			{
				d[i] = c[i] * Math.pow(10,i);
				z = z + d[i];
			}
			return z;
		}

		if (a < 0)
		{
			a = -a;
			x = Math.log10(a) + 1;
			b[0] = a;
			for (i = 0;i < x;i++)
			{
				y = Math.pow(10,x - i - 1);
				c[i] = b[i] / y;
				b[i + 1] = b[i] % y;
			}
			for (i = 0;i < x;i++)
			{
				d[i] = c[i] * Math.pow(10,i);
				z = z + d[i];
			}
			return -z;
		}

		if (a == 0 || a == -0)
		{
			return 0;
		}
	}




	public static void Main()
	{
		 int i;
		 int[] a = new int[6];
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
			System.out.printf("%d\n",reverse(a[i]));
		}
	}

}

