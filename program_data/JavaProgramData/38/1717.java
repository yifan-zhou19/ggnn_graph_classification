package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int k;
		int n;
		int i;
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: double *x;
		double x;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			k = Integer.parseInt(tempVar);
		}
		while (k-- != 0)
		{
			double sum = 0;
			double sum2 = 0;
			double a;
			double s;
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				n = Integer.parseInt(tempVar2);
			}
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
			x = (double)malloc(1000 * (Double.SIZE / Byte.SIZE));
			for (i = 0;i < n;i++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					x + i = Double.parseDouble(tempVar3);
				}
				sum += *(x + i);
			}
			a = sum / n;
			for (i = 0;i < n;i++)
			{
				sum2 += ((*(x + i) - a) * (*(x + i) - a));
			}
			s = Math.sqrt(sum2 / n);
			System.out.printf("%.5f\n",s);
		}
	}




}

