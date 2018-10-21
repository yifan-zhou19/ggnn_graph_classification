package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int m;
		int i;
		int j;
		float[] a = new float[100];
		float[] b = new float[100];
		float[] c = new float[100];
		float d;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		for (i = 0;i < m;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[i] = Float.parseFloat(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				b[i] = Float.parseFloat(tempVar3);
			}
		}
		for (i = 0;i < m - 1;i++)
		{
			c[i] = 0F;
			for (j = i + 1;j < m;j++)
			{
				d = Math.sqrt((b[j] - b[i]) * (b[j] - b[i]) + (a[j] - a[i]) * (a[j] - a[i]));
				if (d > c[i])
				{
					c[i] = d;
				}
			}
		}
			for (i = 0;i < m - 2;i++)
			{
				if (c[i] > c[i + 1])
				{
					d = c[i];
					c[i] = c[i + 1];
					c[i + 1] = d;
				}
			}
			System.out.printf("%.4f\n", c[m - 2]);
	}



}

