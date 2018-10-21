package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int k;
	int n;
	int i;
	int j;
	double[] x = new double[100];
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: double *p;
	double p;
	double a;
	double s;
	double S;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		k = Integer.parseInt(tempVar);
	}
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
	p = (double)malloc((Double.SIZE / Byte.SIZE) * k);

	for (i = 0;i < k;i++)
	{
	String tempVar2 = ConsoleInput.scanfRead();
	if (tempVar2 != null)
	{
		n = Integer.parseInt(tempVar2);
	}
	a = 0;
	s = 0;
	for (j = 0;j < n;j++)
	{
	String tempVar3 = ConsoleInput.scanfRead();
	if (tempVar3 != null)
	{
		x[j] = Double.parseDouble(tempVar3);
	}
	a += x[j] / n;
	}
	for (j = 0;j < n;j++)
	{
	s += (x[j] - a) * (x[j] - a) / n;
	}
	S = Math.sqrt(s);
	*(p + i) = S;
	}
	for (i = 0;i < k;i++)
	{
	System.out.printf("%.5f\n",p[i]);
	}
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'free' has no equivalent in Java:
	free(p);
	return 0;
	}
}

