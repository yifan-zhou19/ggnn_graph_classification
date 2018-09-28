package <missing>;

public class GlobalMembers
{
	public static double jl(int ma, int mb, int mc, int md, int me, int mf)
	{
		double l;
		l = Math.sqrt((double)(ma - md) * (ma - md) + (mb - me) * (mb - me) + (mc - mf) * (mc - mf));
		return l;
	}
	public static int Main()
	{
		int[] a = new int[max];
		int[] b = new int[max];
		int i;
		int k;
		int n;
		int j;
		int h;
		double t;
		double[] s = new double[max];
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct dian
	//	{
	//		int x,y,z;
	//	}
	//	d[max];
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
				(d[i].x) = tempVar2;
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				(d[i].y) = tempVar3;
			}
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				(d[i].z) = tempVar4;
			}
		}
		for (k = 0,j = 0;j < n;j++)
		{
			for (i = j + 1;i < n;i++,k++)
			{
				s[k] = jl(d[i].x, d[i].y, d[i].z, d[j].x, d[j].y, d[j].z);
				a[k] = i;
				b[k] = j;
			}
		}
		for (k = 1;k <= n * (n - 1) / 2;k++)
		{
			for (i = 0;i < n * (n - 1) / 2 - k;i++)
			{
				if (s[i + 1] > s[i])
				{
					t = s[i + 1];
					s[i + 1] = s[i];
					h = a[i];
					a[i] = a[i + 1];
					a[i + 1] = h;
					s[i] = t;
					j = b[i];
					b[i] = b[i + 1];
					b[i + 1] = j;


				}
			}
		}
		for (i = 0;i < n * (n - 1) / 2;i++)
		{
			System.out.printf("(%d,%d,%d)-(%d,%d,%d)=%.2lf\n",d[b[i]].x,d[b[i]].y,d[b[i]].z,d[a[i]].x,d[a[i]].y,d[a[i]].z,s[i]);
		}
		return 0;
	}


}

