package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int k;
		int n;
		int j;
		int i;
		float sum;
		float[] x = new float[1000];
		double a;
		double b;
		double[] s = new double[100];
		double sumt;
		double y;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			k = Integer.parseInt(tempVar);
		}
		for (j = 0;j < k;j++)
		{
			sum = 0F;
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				n = Integer.parseInt(tempVar2);
			}
			for (i = 0;i < n;i++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					x[i] = Float.parseFloat(tempVar3);
				}
				sum += x[i];
			}
			a = sum / n;
			sumt = 0;
			for (i = 0;i < n;i++)
			{
				y = (x[i] - a) * (x[i] - a);
				sumt += y;
			}
			b = sumt / n;
			s[j] = Math.sqrt(b);
		}
		for (j = 0;j < k;j++)
		{
			System.out.printf("%.5lf\n",s[j]);
		}
	}


}

