package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m;
		int i;
		int j;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		int[] a = new int[1000];
		int[] c = new int[1000];
		float[] b = new float[1000];
		float d;
		d = 0.0F;
		a[0] = 1;
		a[1] = 2;
		for (i = 3;i <= 1000;i++)
		{
			a[i - 1] = a[i - 2] + a[i - 3];
		b[i - 3] = (1.0 * a[i - 2]) / a[i - 3];
		}

		for (i = 1;i <= m;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				c[i - 1] = Integer.parseInt(tempVar2);
			}
		}
		for (i = 1;i <= m;i++)
		{
			d = 0.0F;
			for (j = 1;j <= c[i - 1];j++)
			{
				;
				d = d + b[j - 1];
			}
			System.out.printf("%.3f\n",d);
		}
		return 0;
	}

}

