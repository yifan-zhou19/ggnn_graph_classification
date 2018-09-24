package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: double *t[100],*p,a,s;
	double[] t = new double[100];
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: double *p;
	double p;
	double a;
	double s;
	int k;
	int i;
	int j;
	int n;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		k = Integer.parseInt(tempVar);
	}
	for (j = 0;j < k;j++)
	{
		a = s = 0;
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			n = Integer.parseInt(tempVar2);
		}
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'calloc' has no equivalent in Java:
		t[j] = (double)calloc(150,(Double.SIZE / Byte.SIZE));
		p = t[j];
		for (i = 0;i < n;i++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				p + i = Double.parseDouble(tempVar3);
			}
		}
		for (i = 0;i < n;i++)
		{
			a = a + *(p + i);
		}
		a = a / n;
		 for (i = 0;i < n;i++)
		 {
			 s = s + Math.pow(*(p + i) - a,2);
		 }
			 s = s / n;
		 s = Math.sqrt(s);
		 System.out.printf("%.5f\n",s);
	}
	}
}

