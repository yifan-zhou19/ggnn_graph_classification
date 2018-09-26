package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] number = new int[100];
		int i;
		number[0] = 1,number[1] = 2;
		double[] c = new double[100];
		double d;

		for (i = 2;i < 100;i++)
		{
			number[i] = number[i - 1] + number[i - 2];
		}
		int n;
		int[] a = new int[100];
		int k;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[i] = Integer.parseInt(tempVar2);
			}
			System.out.print("\n");
		}
		for (k = 0;k < n;k++)
		{
			for (i = 0;i < a[k];i++)
			{
				c[i] = number[i + 1] * 1.0 / number[i];
				d = d + c[i];
			}
			System.out.printf("%.3lf\n",d);
			d = 0;
			for (i = 0;i < a[k] - 1;i++)
			{
				c[i] = 0;
			}
		}
		return 0;
	}

}

