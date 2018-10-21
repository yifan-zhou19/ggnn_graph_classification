package <missing>;

public class GlobalMembers
{
	public static void display(double n)
	{
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: double *index,ave,ele[1000],sum=0,answer;
		double index;
		double ave;
		double[] ele = new double[1000];
		double sum = 0;
		double answer;
		int i = 0;
		index = ele;
		for (i;i < n;i++)
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				ele[i] = Double.parseDouble(tempVar);
			}
			sum += ele[i];
		}
		ave = sum / n;
		sum = 0;
		for (i = 0;i < n;i++)
		{
			sum += Math.pow(ele[i] - ave,2);
		}
		sum = (double)sum / n;
		answer = Math.pow(sum,0.5);
		System.out.printf("%.5f",answer);
	}


	public static double Main()
	{
		double k;
		double n;
		double i;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			k = Double.parseDouble(tempVar);
		}
		for (i = 0;i < k;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				n = Double.parseDouble(tempVar2);
			}
			if (i != 0)
			{
				System.out.print("\n");
			}
			display(n);
		}
		return 0;
	}


}

