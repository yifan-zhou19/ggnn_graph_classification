package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int t;
		int j;
		int m;
		int k;
		float[] a = new float[10];
		float[] b = new float[10];
		float[] c = new float[10];
		float[][] d = new float[10][10];
		int[][] e = new int[10][10];
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
				a[i] = Float.parseFloat(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				b[i] = Float.parseFloat(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead(" ");
			if (tempVar4 != null)
			{
				c[i] = Float.parseFloat(tempVar4);
			}
		}
		for (i = 0;i < n - 1;i++)
		{
			for (j = i + 1;j < n;j++)
			{
				d[i][j] = Math.sqrt((a[i] - a[j]) * (a[i] - a[j]) + (b[i] - b[j]) * (b[i] - b[j]) + (c[i] - c[j]) * (c[i] - c[j]));
				e[i][j] = 1;
			}
		}
		for (t = 1;t < 300;t++)
		{
		for (i = 0;i < n - 1;i++)
		{
			for (j = i + 1;j < n;j++)
			{
				 if (e[i][j] == 0)
				 {
					 continue;
				 }
				 for (m = 0;m < n - 1;m++)
				 {
					 for (k = m + 1;k < n;k++)
					 {
						 if (d[i][j] < d[m][k] && e[m][k] != 0)
						 {
							 break;
						 }
					 }
					 if (k < n)
					 {
						 break;
					 }
				 }
				 if (m == n - 1)
				 {
					 System.out.printf("(%.0f,%.0f,%.0f)-(%.0f,%.0f,%.0f)=%.2f\n",a[i],b[i],c[i],a[j],b[j],c[j],d[i][j]);
					 e[i][j] = 0;
					 break;
				 }
			}
			if (j < n)
			{
				break;
			}
		}
		}
		return 0;
	}

}

