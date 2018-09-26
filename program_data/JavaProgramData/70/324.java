package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int i;
		int j;
		double s;
		double d;
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: double * a;
		double a;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		a = (double)malloc(2 * n * (Double.SIZE / Byte.SIZE));

		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				(a + i * 2) = Double.parseDouble(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				(a + i * 2 + 1) = Double.parseDouble(tempVar3);
			}
		}

		for (i = 0;i < n;i++)
		{
			for (j = i + 1;j < n;j++)
			{
				s = Math.pow(*(a + i * 2) - *(a + j * 2),2) + Math.pow(*(a + i * 2 + 1) - *(a + j * 2 + 1),2);
				if (s > d)
				{
					d = s;
				}
			}
		}

		d = Math.sqrt(d);

		System.out.printf("%.4lf",d);
	}
}

