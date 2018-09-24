package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n1;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n1 = Integer.parseInt(tempVar);
		}
		int i;
		for (i = 0;i < n1;i++)
		{
			int n2;
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				n2 = Integer.parseInt(tempVar2);
			}
			double[] a = new double[100];
			double sum = 0;
			double avg;
			int j;
			for (j = 0;j < n2;j++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					a[j] = Double.parseDouble(tempVar3);
				}
				sum = sum + a[j];
			}
			double temp;
			temp = (double)n2;
			avg = sum / temp;

			double s;
			double t = 0;
			int k;
			for (k = 0;k < n2;k++)
			{
				t = t + (a[k] - avg) * (a[k] - avg);
			}
			s = Math.sqrt(t / n2);
			System.out.printf("%.5f\n",s);
		}
		return 0;
	}
}

