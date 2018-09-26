package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int n;
	int i;
	int j;
	int k;
	int h;
	int l;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	k = 0;
	int[] a = new int[11];
	int[] b = new int[11];
	int[] c = new int[11];
	int[] f = new int[100];
	int[] e = new int[100];
	double[] d = new double[10000];
	for (i = 0;i < n;i++)
	{
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			(a[i]) = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			(b[i]) = Integer.parseInt(tempVar3);
		}
		String tempVar4 = ConsoleInput.scanfRead();
		if (tempVar4 != null)
		{
			(c[i]) = Integer.parseInt(tempVar4);
		}
	}
	k = 1;
	d[0] = 0;
	for (j = 0;j < n;j++)
	{
	   for (i = j + 1;i < n;i++)
	   {
		d[k] = Math.sqrt((a[j] - a[i]) * (a[j] - a[i]) + (b[j] - b[i]) * (b[j] - b[i]) + (c[j] - c[i]) * (c[j] - c[i]));
		e[k] = i;
		f[k] = j; //??d[k]???j,i
		k++;

	   }
	   l = k;

	}
	for (h = 0;h < n * n;h++)
	{
		for (k = 0;k <= l;k++)
		{
			if (d[k] != 0)
			{
		   for (i = 0;i <= l;i++)
		   {
			   if (d[k] < d[i])
			   {
				   break;
			   }
			   if (i == (l - 1))
			   {
				   System.out.printf("(%d,%d,%d)-(%d,%d,%d)=%.2lf\n",a[f[k]],b[f[k]],c[f[k]],a[e[k]],b[e[k]],c[e[k]],d[k]);
				   d[k] = 0;
					 k = 0;
					 i = 0;
				   break;

			   }
		   }
			}
		}
	}
		return 0;
	}

}

