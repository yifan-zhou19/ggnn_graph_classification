package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int m;
	int n;
	int i;
	int h = 1;
	int l = 0;
	int k;
	int j;
	int[] x = new int[11];
	int[] y = new int[11];
	int[] z = new int[11];
	int N;
		double[] s = new double[50];
		double p;
		double[] d = new double[50];
		double t;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		N = (((n - 1) * n) / 2); //???N?
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
			for (k = i + 1;k < n;k++)
			{
				s[l] = Math.sqrt((x[i] - x[k]) * (x[i] - x[k]) + (y[i] - y[k]) * (y[i] - y[k]) + (z[i] - z[k]) * (z[i] - z[k])); //????sl
				l++; //?????s[l]
			}
		}
		for (l = 0;l < N;l++)
		{ //??????sl????????
		   m = l;
		  for (j = l + 1;j < N;j++)
		  {
			 if (s[m] < s[j])
			 {
		p = s[j];
				 s[j] = s[m];
				 s[m] = p;
			 }
		  }
		}
		d[0] = s[0],j = 1; //????????j-1?????d[0]??
		for (l = 1;l < N;l++)
		{ //?????????sl???????????
			if (d[j - 1] != s[l])
			{
				d[j] = s[l];
				j++;
				h++;
			}
		}
		for (j = 0;j < h;j++)
		{ //??????d[j]??
		   for (i = 0;i < n;i++)
		   {
			  for (k = i + 1;k < n;k++)
			  {
				  t = Math.sqrt((x[i] - x[k]) * (x[i] - x[k]) + (y[i] - y[k]) * (y[i] - y[k]) + (z[i] - z[k]) * (z[i] - z[k]));
				if (d[j] == t)
				{
					System.out.printf("(%d,%d,%d)-(%d,%d,%d)=%.2lf\n",x[i],y[i],z[i],x[k],y[k],z[k],d[j]);
				}
			  }
		   }
		}
		return 0;
	}

}

