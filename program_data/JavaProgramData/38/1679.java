package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int a;
		float[] x = new float[1000];
		float c;
		float d = 0F;
		double f;
		double e = 0;
		double q;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (int i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a = Integer.parseInt(tempVar2);
			}
			for (int k = 0;k < a;k++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					x[k] = Float.parseFloat(tempVar3);
				}
				d = d + x[k];
			}
			c = d / a;
			for (int p = 0;p < a;p++)
			{
				q = (x[p] - c) * (x[p] - c) / a;
				e = e + q;
				f = Math.sqrt(e);
			}
			System.out.printf("%.5lf\n",f);
			d = 0F;
			e = 0;
		}
		return 0;
	}
}

