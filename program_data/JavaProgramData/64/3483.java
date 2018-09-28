package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] x = new int[10];
		int[] y = new int[10];
		int[] z = new int[10];
		int[] a1 = new int[50];
		int[] b1 = new int[50];
		int[] c1 = new int[50];
		int[] a2 = new int[50];
		int[] b2 = new int[50];
		int[] c2 = new int[50];
		int n;
		int i;
		int j;
		int k;
		int m;
		float[] d = new float[50];
		float q;
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
				x[i] = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				y[i] = Integer.parseInt(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				z[i] = Integer.parseInt(tempVar4);
			}
		}
		k = 0;
		for (i = 0;i < n;i++)
		{
			for (j = i + 1;j < n;j++)
			{
				d[k] = Math.sqrt((x[i] - x[j]) * (x[i] - x[j]) + (y[i] - y[j]) * (y[i] - y[j]) + (z[i] - z[j]) * (z[i] - z[j]));
				a1[k] = x[i];
				b1[k] = y[i];
				c1[k] = z[i];
				a2[k] = x[j];
				b2[k] = y[j];
				c2[k] = z[j];
				k++;
			}
		}
		for (i = 0;i < (n * (n - 1)) / 2 - 1;i++)
		{
			for (j = 0;j < (n * (n - 1)) / 2 - 1 - i;j++)
			{
				if (d[j] < d[j + 1])
				{
					q = d[j + 1];
					d[j + 1] = d[j];
					d[j] = q;
					m = a1[j + 1];
					a1[j + 1] = a1[j];
					a1[j] = m;
					m = b1[j + 1];
					b1[j + 1] = b1[j];
					b1[j] = m;
					m = c1[j + 1];
					c1[j + 1] = c1[j];
					c1[j] = m;
					m = a2[j + 1];
					a2[j + 1] = a2[j];
					a2[j] = m;
					m = b2[j + 1];
					b2[j + 1] = b2[j];
					b2[j] = m;
					m = c2[j + 1];
					c2[j + 1] = c2[j];
					c2[j] = m;
				}
			}
		}
		for (i = 0;i < (n * (n - 1)) / 2;i++)
		{
			System.out.printf("(%d,%d,%d)-(%d,%d,%d)=%.2f\n",a1[i],b1[i],c1[i],a2[i],b2[i],c2[i],d[i]);
		}
	}
}

