package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int k;
		float[] x = new float[20];
		float[] y = new float[20];
		float[] z = new float[20];
		float[][] d = new float[20][20];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 1;i <= n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				x[i] = Float.parseFloat(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				y[i] = Float.parseFloat(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				z[i] = Float.parseFloat(tempVar4);
			}

		}
		for (i = 1;i <= n;i++)
		{
			for (j = i + 1;j <= n;j++)
			{

				d[i][j] = Math.sqrt((x[i] - x[j]) * (x[i] - x[j]) + (y[i] - y[j]) * (y[i] - y[j]) + (z[i] - z[j]) * (z[i] - z[j]));
			}
		}
		double count = 0;
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
	hell:
	;
		double max = 0;
		int a;
		int b;
		for (i = 1;i <= n;i++)
		{
			for (j = i + 1;j <= n;j++)
			{
				if (d[i][j] > max)
				{
					max = d[i][j];
					a = i;
					b = j;
				}
			}
		}
		System.out.printf("(%.0f,%.0f,%.0f)-(%.0f,%.0f,%.0f)=%.2lf\n",x[a],y[a],z[a],x[b],y[b],z[b],max);
		d[a][b] = -1F;
		count++;
		if (count < (n * (n - 1)) / 2)
		{
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
		goto hell;
		}
	}
}

