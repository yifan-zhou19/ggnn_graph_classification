package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int k;
		int n;
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: double *ptox[1000];
		double[] ptox = new double[1000];
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
			double sum = 0;
			double ave;
			double out = 0;
			for (j = 0;j < n;j++)
			{
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
				ptox[j] = (double)malloc((Double.SIZE / Byte.SIZE));
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					ptox[j] = tempVar3;
				}
				sum += ptox[j];
			}
			ave = sum / n;
			for (j = 0;j < n;j++)
			{
				out += Math.pow((ptox[j] - ave),2);
			}
			out = Math.sqrt(out / n);
			System.out.printf("%.5f\n",out);

		}
		return 0;
	}


}

