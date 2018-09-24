package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int k;
		int i;
		int j;
		int k1;
		double S;
		double sum;
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		double * p;
		double[] x = new double[1000];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (j = 0;j < n;j++)
		{
			sum = 0;
			S = 0;
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				k = Integer.parseInt(tempVar2);
			}
			p = x[0];
			for (i = 0;i < k;i++,p++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					p = Double.parseDouble(tempVar3);
				}
			}
			p = x[0];
			for (i = 0;i < k;i++,p++)
			{
				sum = sum + *p;
			}
		   // printf("%f\n",sum);
			sum = sum / k;
			p = x[0];
			for (i = 0;i < k;i++,p++)
			{
				S = S + (*p - sum) * (*p - sum);
			}
		  //  printf("%f\n",S);
			S = S / k;
			S = Math.sqrt(S);
			System.out.printf("%.5f\n",S);
			p = x[0];
			for (i = 0;i < k;i++,p++)
			{
				*p = 0;
			}
		}
		return 0;
	}
}

