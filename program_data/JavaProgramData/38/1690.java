package <missing>;

public class GlobalMembers
{
	/*?5?????????????????????????????,?4?5?????????????*/

	public static int Main()
	{
		int m;
		int i;
		int[] a = new int[100];
		int j;
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: double *p[100],S;
		double[] p = new double[100];
		double S;
		double fang = new double(double * p[],int);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		for (i = 0;i < m;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[i] = Integer.parseInt(tempVar2);
			}
			for (j = 0;j < a[i];j++)
			{
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
				p[j] = (double)malloc(len);
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					p[j] = tempVar3;
				}
			}
			S = fang(p, a[i]);
			System.out.printf("%.5f\n",S);
		}
	}


	public static double fang(double[][] p, int n)
	{
		double c;
		double a;
		double T;
		double S;
		int i;
		for (i = 0,c = 0;i < n;i++)
		{
		c = c + *(p[i]);
		}
		a = c / n;
		for (i = 0,T = 0;i < n;i++)
		{
			T = T + (*(p[i]) - a) * (*(p[i]) - a);
		}
		S = Math.sqrt(T / n);
		return S;
	}

}

