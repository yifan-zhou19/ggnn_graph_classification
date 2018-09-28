package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
	int num;
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: double *f1,s,a;
	double f1;
	double s;
	double a;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	while (n-- != 0)
	{
		a = 0;
		s = 0;
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			num = Integer.parseInt(tempVar2);
		}
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		f1 = (double)malloc(num * (Double.SIZE / Byte.SIZE));
		for (i = 0;i < num;i++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				f1 + i = Double.parseDouble(tempVar3);
			}
		a += *(f1 + i);
		}
	   a = a / (double)num;
	for (i = 0;i < num;i++)
	{
	   s += (*(f1 + i) - a) * (*(f1 + i) - a);
	}
	s = Math.sqrt(s / (double)num);
	System.out.printf("%.5f\n",s);
	}

		return 0;
	}
}

