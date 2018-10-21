package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int x;
		int i = 0;
		double[] s = new double[X];
		double sum1 = 0;
		double ave;
		double sum2 = 0;
		double f;
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		double * j;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		while (i < n)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				x = Integer.parseInt(tempVar2);
			}
			for (j = s;j < s + x;j++)
			{
				if (j == s)
				{
					String tempVar3 = ConsoleInput.scanfRead();
					if (tempVar3 != null)
					{
						*j = Double.parseDouble(tempVar3);
					}
				}
				else
				{
					String tempVar4 = ConsoleInput.scanfRead(" ");
					if (tempVar4 != null)
					{
						*j = Double.parseDouble(tempVar4);
					}
				}
				sum1 = sum1 + (*j);
			}
			ave = sum1 / x;
			for (j = s;j < s + x;j++)
			{
				(*j) = ((*j) - ave) * ((*j) - ave);
				sum2 = sum2 + (*j);
			}
			f = Math.sqrt(sum2 / x);
			System.out.printf("%.5f\n",f);
			i++;
			sum1 = 0;
			sum2 = 0;
			ave = 0;
		}
		return 0;
	}

}

