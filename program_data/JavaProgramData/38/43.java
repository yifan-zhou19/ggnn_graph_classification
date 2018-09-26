package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		int n;
		int i;
		int j;
		int m;
		double[] a = new double[1001];
		double ans;
		double pfh;
		double ave;
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: double *p;
		double p;
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
				m = Integer.parseInt(tempVar2);
			}
			p = a[0];
			ave = 0;
			pfh = 0;
			for (j = 1;j <= m;j++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					(p + j) = Double.parseDouble(tempVar3);
				}
				ave += *(p + j);
			}
			ave /= m;
			for (j = 1;j <= m;j++)
			{
				pfh += Math.pow(*(p + j) - ave,2);
			}
			pfh /= m;
			ans = Math.sqrt(pfh);
			System.out.printf("%.5lf\n",ans);
		}

	}


}

