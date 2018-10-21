package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		double a;
		double b;
		double c;
		double d = 0;
		double e;
		double f;
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct dis
	//	{
	//		double x,y;
	//	}
	//	*number;
		int n;
		int i;
		int j;

		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		number = (dis)malloc((Integer.SIZE / Byte.SIZE) * n);

		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a = Double.parseDouble(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				b = Double.parseDouble(tempVar3);
			}
			(number + i).x = a;
			(number + i).y = b;

		}
		for (i = 0;i < n;i++)
		{
			for (j = i + 1;j < n;j++)
			{
			e = (number + i).x - (number + j).x;
			f = (number + i).y - (number + j).y;
			c = e * e + f * f;

			if (c > d)
			{
				d = c;
			}
			}
		}

		System.out.printf("%.4lf",Math.sqrt(d));

		return 0;
	}
}

