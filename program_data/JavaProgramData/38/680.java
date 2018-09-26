package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int k;
		int[] n = new int[100];
		int i;
		int p;
		double[] x = new double[100];
		double[] sum = new double[100];
		double[] average = new double[100];
		double[] mm = new double[100];
		double[] s = new double[100];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			k = Integer.parseInt(tempVar);
		}
		for (i = 0;i < k;i++)
		{
			sum[i] = 0;
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				n[i] = Integer.parseInt(tempVar2);
			}
			for (p = 0;p < n[i];p++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					x[p] = Double.parseDouble(tempVar3);
				}
				sum[i] += x[p];
			}
			average[i] = sum[i] / n[i];
			mm[i] = 0;
			for (p = 0;p < n[i];p++)
			{
				mm[i] += Math.pow(average[i] - x[p],2);
				s[i] = Math.pow(mm[i] / n[i],0.5);
			}
		}
			for (i = 0;i < k;i++)
			{
				System.out.printf("%.5f\n",s[i]);
			}
			return 0;
	}













}

