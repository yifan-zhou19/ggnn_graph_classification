package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int[] a = new int[100];
		int[] b = new int[100];
		float[] c = new float[100];
		a[0] = 2;
		b[0] = 1;
		a[1] = 3;
		b[1] = 2;
		for (i = 2;i < 100;i++)
		{
			a[i] = a[i - 1] + a[i - 2];
			b[i] = b[i - 1] + b[i - 2];
		}
		for (i = 0;i < 100;i++)
		{
			c[i] = (float)a[i] / b[i];
		}
		int j;
		int n;
		int m;
		int k;
		float s;
		float[] w = new float[1000];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (j = 0;j < n;j++)
		{
			s = 0F;
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				m = Integer.parseInt(tempVar2);
			}
			for (k = 0;k < m;k++)
			{
				s = s + c[k];
			}
			w[j] = s;
		}
		for (j = 0;j < n;j++)
		{
			System.out.printf("%.3lf\n",w[j]);
		}
		return 0;
	}

}

