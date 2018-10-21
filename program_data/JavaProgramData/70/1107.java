package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int k;
		int m;
		int p;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}

		float[] a = new float[100];
		float[] b = new float[100];
		float[] c = new float[5000];
		double q;
		float max;

		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[i] = Float.parseFloat(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				b[i] = Float.parseFloat(tempVar3);
			}
		}


		m = 0;
		for (j = 0;j < n;j++)
		{
			for (k = j + 1;k < n;k++)
			{
				c[m] = (a[j] - a[k]) * (a[j] - a[k]) + (b[j] - b[k]) * (b[j] - b[k]);
				m++;
			}
		}



		max = c[0];

		for (p = 1;p < m;p++)
		{
			if (max < c[p])
			{
				max = c[p];
			}
		}

		q = Math.sqrt(max);

		System.out.printf("%.4f",q);

		return 0;
	}


}

