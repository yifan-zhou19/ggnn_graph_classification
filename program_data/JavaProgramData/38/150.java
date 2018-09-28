package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int i;
		int m;
		int j;
		double ave;
		double dif;
		double[] a = new double[200];
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: double *p;
		double p;
		p = a;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 1;i <= n;i++)
		{
			ave = 0;
			dif = 0;
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				m = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				p + 1 = Double.parseDouble(tempVar3);
			}
			for (j = 2;j <= m;j++)
			{
				String tempVar4 = ConsoleInput.scanfRead(" ");
				if (tempVar4 != null)
				{
					p + j = Double.parseDouble(tempVar4);
				}
			}
			for (j = 1;j <= m;j++)
			{
				ave += *(p + j);
			}
			ave = ave * 1.0 / (m * 1.0);
			for (j = 1;j <= m;j++)
			{
				dif += (*(p + j) - ave) * (*(p + j) - ave);
			}
			dif = dif * 1.0 / (m * 1.0);
			dif = Math.sqrt(dif);
			System.out.printf("%.5f\n",dif);
		}
	}

}

