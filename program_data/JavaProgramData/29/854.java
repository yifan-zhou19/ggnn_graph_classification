package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m;
		int n;
		int i;
		int j;
		float sum;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		for (i = 0;i < m;i++)
		{
		sum = 0F;
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			n = Integer.parseInt(tempVar2);
		}
		int[] a = new int[n];
		int[] b = new int[n];
		float[] c = new float[n];
		a[0] = 2;
		a[1] = 3;
		b[0] = 1;
		b[1] = 2;
		c[0] = (float)a[0] / b[0];
		c[1] = (float)a[1] / b[1];
		if (n == 1)
		{
			System.out.printf("%.3f\n",c[0]);
		}
		if (n == 2)
		{
			System.out.printf("%.3f\n",c[0] + c[1]);
		}
		if (n >= 3)
		{
			sum = c[0] + c[1];
			for (j = 3;j <= n;j++)
			{
				a[j - 1] = a[j - 2] + a[j - 3];
				b[j - 1] = b[j - 2] + b[j - 3];
				c[j - 1] = (float)a[j - 1] / b[j - 1];
				sum += c[j - 1];
			}
			System.out.printf("%.3f\n",sum);
		}
		}
		return 0;
	}

}

