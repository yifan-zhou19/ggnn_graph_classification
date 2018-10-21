package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int[] n = new int[100];
	int k;
	double[][] a = new double[100][100];
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		k = Integer.parseInt(tempVar);
	}
	int i;
	int j;
	double[] pingjun = new double[100];
	double[] s = new double[100];
	for (i = 0;i < 100;i++)
	{
		 pingjun[i] = 0;
		 s[i] = 0;
	}
	for (i = 0;i < k;i++)
	{
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			n[i] = Integer.parseInt(tempVar2);
		}
		for (j = 0;j < n[i];j++)
		{
			 String tempVar3 = ConsoleInput.scanfRead();
			 if (tempVar3 != null)
			 {
				 a[i][j] = Double.parseDouble(tempVar3);
			 }
		}
	}
	for (i = 0;i < k;i++)
	{
		 for (j = 0;j < n[i];j++)
		 {
			  pingjun[i] = pingjun[i] + a[i][j];
		 }
		 pingjun[i] = (double)pingjun[i] / n[i];
		 for (j = 0;j < n[i];j++)
		 {
			  s[i] = s[i] + (a[i][j] - pingjun[i]) * (a[i][j] - pingjun[i]);
		 }
		 s[i] = (double)Math.sqrt(s[i] / n[i]);
		 System.out.printf("%.5lf\n",s[i]);
	}
		return 0;
	}
}

