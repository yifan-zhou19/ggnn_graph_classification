package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int[] a = new int[6];
		int[] b = new int[5];
		int[] c = new int[6];
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
		b[0] = a[i] / 10000;
		b[1] = a[i] / 1000 - 10 * b[0];
		b[2] = a[i] / 100 - 10 * b[1] - 100 * b[0];
		b[4] = a[i] % 10;
		b[3] = (a[i] % 100 - b[4]) / 10;
		if (a[i] / 10000 != 0)
		{
		c[i] = b[0] + b[1] * 10 + b[2] * 100 + b[3] * 1000 + b[4] * 10000;
		}
		else if (a[i] / 1000 != 0)
		{
			c[i] = b[1] + b[2] * 10 + b[3] * 100 + b[4] * 1000;
		}
		else if (a[i] / 100 != 0)
		{
			c[i] = b[2] + b[3] * 10 + b[4] * 100;
		}
		else if (a[i] / 10 != 0)
		{
			c[i] = b[3] + b[4] * 10;
		}
		else
		{
			c[i] = b[4];
		}
		}
		for (i = 0;i < 6;i++)
		{
			System.out.printf("%d\n",c[i]);
		}
	}

}

