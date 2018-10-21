package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		int k;
		int n;
		int i;
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		double * p;
		double[] a = new double[1000];
		double sum = 0;
		double D = 0;
		double S;
		double x;
		p = a;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			k = Integer.parseInt(tempVar);
		}
		for (i = 0;i < k;i++)
		{
			sum = 0;
			D = 0;
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			n = Integer.parseInt(tempVar2);
		}
		for (p = a;p < a + n;p++)
		{
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			p = Double.parseDouble(tempVar3);
		}
		sum = sum + *p;
		}
		x = sum / n;
		for (p = a;p < a + n;p++)
		{
			D = D + Math.pow((*p - x),2);
		}
		S = Math.sqrt(D / n);
		System.out.printf("%.5f\n",S);
		}


	}

}

