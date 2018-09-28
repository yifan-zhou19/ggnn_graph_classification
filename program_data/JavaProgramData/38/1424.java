package <missing>;

public class GlobalMembers
{
	public static void display(double n)
	{
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		double * index;
		double ave;
		double[] ele = new double[1000];
		double sum = 0;
		double answer;
		int i = 0;
		index = ele;
		for (i = 0;i < n;i++,index += LEN)
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				index = Double.parseDouble(tempVar);
			}
			sum += *index;
		}
		ave = sum / n;
		sum = 0;
		for (i = 0,index = ele;i < n;index += LEN,i++)
		{
			sum += Math.pow(*index - ave,2);
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

