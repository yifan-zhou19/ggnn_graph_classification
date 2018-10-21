package <missing>;

public class GlobalMembers
{
	public static double s(tangible.RefObject<Double> p, int n)
	{
		int i;
		double x = 0;
		double a = 0;
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		double * q = p.argValue;
		for (i = 0;i < n;i++,q++)
		{
			a += *q;
		}
		a /= n;
		q = p.argValue;
		for (i = 0;i < n;i++,q++)
		{
			x += (*q - a) * (*q - a);
		}
		return Math.sqrt(x / n);
	}

	public static void Main()
	{
		int k;
		int i;
		int n;
		int j;
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: double *p[100],*q;
		double[] p = new double[100];
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		double * q;
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
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
			p[i] = (double)malloc(n * (Double.SIZE / Byte.SIZE));
			q = p[i];
			for (j = 0;j < n;j++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					q = Double.parseDouble(tempVar3);
				}
				q++;
			}
			System.out.printf("%.5f\n",s(p[i], n));
		}
	}
}

