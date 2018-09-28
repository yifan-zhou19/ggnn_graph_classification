package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int k;
		int n;
		int i;
		int j;
		double[] x;
		double sum;
		double b;
		double s;
		double a;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			k = Integer.parseInt(tempVar);
		}
		for (j = 0;j < k;j++)
		{
			sum = 0;
			b = 0;
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				n = Integer.parseInt(tempVar2);
			}
			x = new double[n];
			for (i = 0;i < n;i++)
			{
			   String tempVar3 = ConsoleInput.scanfRead();
			   if (tempVar3 != null)
			   {
				   x[i] = Double.parseDouble(tempVar3);
			   }
			   sum += x[i];
			}
			a = sum / n;
			for (i = 0;i < n;i++)
			{
				b += (x[i] - a) * (x[i] - a);
			}
			s = Math.sqrt(b / n);
			System.out.printf("%.5lf\n",s);
		}
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'free' has no equivalent in Java:
			free(x);
			return 0;
	}
}

