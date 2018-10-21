package <missing>;

public class GlobalMembers
{
	public static double average(int n, tangible.RefObject<Double> a)
	{
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		double * p;
		double sum = 0;
		for (p = a.argValue;p < a.argValue + n;p++)
		{
			sum += *p;
		}
		return sum / n;
	}

	public static double fangcha(int n, tangible.RefObject<Double> a)
	{
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		double * p;
		double sum = 0;
		for (p = a.argValue;p < a.argValue + n;p++)
		{
			sum += Math.pow((*p - average(n, a)),2);
		}
		return Math.sqrt(sum / n);
	}

	public static int Main()
	{
		int num;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			num = Integer.parseInt(tempVar);
		}
		int i;
		for (i = 0;i < num;i++)
		{
			int number;
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				number = Integer.parseInt(tempVar2);
			}
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
			double * p;
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: double *a=(double*)malloc(sizeof(double)*number);
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
			double a = (double)malloc((Double.SIZE / Byte.SIZE) * number);
			for (p = a;p < a + number;p++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					p = Double.parseDouble(tempVar3);
				}
			}
		tangible.RefObject<Double> tempRef_a = new tangible.RefObject<Double>(a);
			System.out.printf("%.5lf\n",fangcha(number, tempRef_a));
			a = tempRef_a.argValue;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'free' has no equivalent in Java:
			free(a);
		}
		return 0;
	}
}

