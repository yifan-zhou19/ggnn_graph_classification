package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int k;
		int n;
		int i;
		int j;
		double S;
		double sum;
		double average;
		double result;
		double[] p = new double[1000]; //?????????????????????????????
		//???????????????????????????????????????????
		p = new double[100];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			k = Integer.parseInt(tempVar);
		}
		for (i = 0;i < k;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				n = Integer.parseInt(tempVar2);
			}
			sum = 0;
			for (j = 0;j < n;j++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					(p[i] + j) = tempVar3;
				}
				sum = sum + *(p[i] + j);
			}
			average = sum / n;
			for (j = 0,result = 0;j < n;j++)
			{
				result = result + (*(p[i] + j) - average) * (*(p[i] + j) - average);
			}
			S = Math.sqrt(result / n);
			System.out.printf("%.5f\n",S);
		}
	}


}

