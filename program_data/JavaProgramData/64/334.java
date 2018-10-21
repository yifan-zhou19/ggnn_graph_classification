package <missing>;

public class GlobalMembers
{
	public static int[] x = new int[10];
	public static int[] y = new int[10];
	public static int[] z = new int[10];
	public static int k = 0;
	public static int[] d = new int[100];
	public static int[] e = new int[100];
	public static int i;
	public static int j;
	public static int k;
	public static int n;
	public static double[] c = new double[100];
	public static double temp;
	public static int Main()
	{
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
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				y[i] = Integer.parseInt(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead(" ");
			if (tempVar4 != null)
			{
				z[i] = Integer.parseInt(tempVar4);
			}
		}
		for (i = 0;i < n;i++)
		{
			for (j = i + 1;j < n;j++)
			{
				c[k] = Math.sqrt(Math.pow(x[i] - x[j],2) + Math.pow(y[i] - y[j],2) + Math.pow(z[i] - z[j],2));
				d[k] = i;
				e[k] = j;
				k++;

			}
		}
		for (i = 0;i < k;i++)
		{
			for (j = i + 1;j < k;j++)
			{
				if (c[i] < c[j])
				{
					temp = c[i];
					c[i] = c[j];
					c[j] = temp;
					temp = d[i];
					d[i] = d[j];
					d[j] = temp;
					temp = e[i];
					e[i] = e[j];
					e[j] = temp;
				}
				if ((c[i] == c[j]) && ((d[i] > d[j]) || (e[i] > e[j])))
				{
					temp = c[i];
					c[i] = c[j];
					c[j] = temp;
					temp = d[i];
					d[i] = d[j];
					d[j] = temp;
					temp = e[i];
					e[i] = e[j];
					e[j] = temp;
				}
			}
		}
		for (i = 0;i < k;i++)
		{
			System.out.printf("(%d,%d,%d)-(%d,%d,%d)=%.2f\n",x[d[i]],y[d[i]],z[d[i]],x[e[i]],y[e[i]],z[e[i]],c[i]);
		}
		return 0;
	}

}

