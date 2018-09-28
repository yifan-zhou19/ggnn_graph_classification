package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int i;
		int n;
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: double *p;
		double p;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'calloc' has no equivalent in Java:
		p = (double)calloc(1,5 * (Double.SIZE / Byte.SIZE));
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			p = Double.parseDouble(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			p + 1 = Double.parseDouble(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead(" ");
		if (tempVar3 != null)
		{
			p + 2 = Double.parseDouble(tempVar3);
		}
		String tempVar4 = ConsoleInput.scanfRead(" ");
		if (tempVar4 != null)
		{
			p + 3 = Double.parseDouble(tempVar4);
		}
		String tempVar5 = ConsoleInput.scanfRead(" ");
		if (tempVar5 != null)
		{
			p + 4 = Double.parseDouble(tempVar5);
		}

		double x;
		double s = 0;
		for (i = 0;i < 4;i++)
		{
			s += *(p + i);
		}
		s = s / 2;
		x = (s - p) * (s - *(p + 1)) * (s - *(p + 2)) * (s - *(p + 3)) - p * *(p + 1) * *(p + 2) * *(p + 3) * Math.cos(*(p + 4) / 360 * 3.1415926) * Math.cos(*(p + 4) / 360 * 3.1415926);
		if (x < 0)
		{
			System.out.print("Invalid input");
		}
		else
		{
			x = Math.sqrt((s - p) * (s - *(p + 1)) * (s - *(p + 2)) * (s - *(p + 3)) - p * *(p + 1) * *(p + 2) * *(p + 3) * Math.cos(*(p + 4) / 360 * 3.1415926) * Math.cos(*(p + 4) / 360 * 3.1415926));
		System.out.printf("%.4lf",x);
		}
	}
}

