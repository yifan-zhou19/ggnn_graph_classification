package <missing>;

public class GlobalMembers
{
	public static double fangcha(double[] sz, int k)
	{
		double sum = 0;
		double s;
		double a = 0;
		int t;
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		double * p;
		p = sz;
		for (t = 0;t < k;t++,p++)
		{
			a = a + *p;
		}
		a = a / k;
		p = sz;
		for (t = 0;t < k;t++,p++)
		{
			sum = sum + (*p - a) * (*p - a);
		}
		s = Math.sqrt((sum / k));
		return s;
	}
	public static void Main(String[] args)
	{
		int n;
		int i;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			int m;
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				m = Integer.parseInt(tempVar2);
			}
			int j;
			double[] sz = new double[1000];
			for (j = 0;j < m;j++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					sz[j] = Double.parseDouble(tempVar3);
				}
			}
			System.out.printf("%.5f\n",fangcha(sz, m));
		}
	}
}

