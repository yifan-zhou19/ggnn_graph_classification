package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int n;
	int i;
	int a = 0;
	int b = 0;
	int j;
	int k;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	char[][] A = new char[n][10];
	double[] F = new double[n];
	double[] M = new double[n];
	double h;
	double g;
	for (i = 0;i < n;i++)
	{
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			A[i] = tempVar2.charAt(0);
		}
		if (A[i][0] == 'f')
		{
		   String tempVar3 = ConsoleInput.scanfRead();
		   if (tempVar3 != null)
		   {
			   F[a] = Double.parseDouble(tempVar3);
		   }
		   a++;
		}
		if (A[i][0] == 'm')
		{
		   String tempVar4 = ConsoleInput.scanfRead();
		   if (tempVar4 != null)
		   {
			   M[b] = Double.parseDouble(tempVar4);
		   }
		   b++;
		}
	}
	for (j = 0;j < a;j++)
	{
		for (k = 0;k < a - j - 1;k++)
		{
			if (F[k] < F[k + 1])
			{
				h = F[k];
				F[k] = F[k + 1];
				F[k + 1] = h;
			}
		}
	}
	for (j = 0;j < b;j++)
	{
		for (k = 0;k < b - j - 1;k++)
		{
			if (M[k] > M[k + 1])
			{
				g = M[k];
				M[k] = M[k + 1];
				M[k + 1] = g;
			}
		}
	}
	for (i = 0;i < b;i++)
	{
		System.out.printf("%.2lf ",M[i]);
	}
	for (i = 0;i < a - 1;i++)
	{
		System.out.printf("%.2lf ",F[i]);
	}
	System.out.printf("%.2lf",F[a - 1]);
	return 0;
	}
}

