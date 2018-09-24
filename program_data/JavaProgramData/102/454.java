package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int n;
	int j;
	int t;
	int i;
	int m;
	int b;
	int u;
	int v;
	int k;
	int e;
	double[] tall = new double[45];
	double[] man = new double[40];
	double[] woman = new double[40];
	double q;
	String sex = new String(new char[8]);
	j = 0;
	t = 0;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	for (i = 0;i < n;i++)
	{
		 String tempVar2 = ConsoleInput.scanfRead();
		 if (tempVar2 != null)
		 {
			 sex = tempVar2.charAt(0);
		 }
		 String tempVar3 = ConsoleInput.scanfRead(" ");
		 if (tempVar3 != null)
		 {
			 tall[i] = Double.parseDouble(tempVar3);
		 }
		 if (sex.charAt(0) == 'm')
		 {
			man[j] = tall[i];
			j++;
		 }
			else
			{
			woman[t] = tall[i];
			t++;
			}
	}
	for (k = 1;k < j;k++)
	{
		for (e = 0;e < j - k;e++)
		{
			if (man[e] > man[e+1])
			{
			q = man[e];
			man[e] = man[e+1];
			man[e+1] = q;
			}
		}

	}

	for (u = 1;u < t;u++)
	{
		for (v = 0;v < t - u;v++)
		{
			if (woman[v] < woman[v + 1])
			{
			q = woman[v];
			woman[v] = woman[v + 1];
			woman[v + 1] = q;
			}
		}

	}
	 for (m = 0;m < j;m++)
	 {
	 System.out.printf("%.2lf ",man[m]);
	 }

	 for (b = 0;b < t - 1;b++)
	 {
	 System.out.printf("%.2lf ",woman[b]);
	 }
	 System.out.printf("%.2lf",woman[t - 1]);
	 return 0;
	}

}

