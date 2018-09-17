package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int n;
	int c;
	int m = 0;
	int i;
	int a = 0;
	int b = 0;
	int j;
	char[][] s = new char[41][10];
	double[] h = new double[41];
	double[] hm = new double[41];
	double[] hf = new double[40];
	double dqm;
	double dqf;
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
			s[i] = tempVar2.charAt(0);
		}
		String tempVar3 = ConsoleInput.scanfRead(" ");
		if (tempVar3 != null)
		{
			h[i] = Double.parseDouble(tempVar3);
		}
	}
	for (i = 0;i < n;i++)
	{
		if (strcmp(s[i],"male") == 0)
		{
			hm[a] = h[i];
			a++;
		}
					 else
					 {
						 hf[b] = h[i];
						 b++;
					 }
	}
	for (i = 0;i < a - 1;i++)
	{
		for (j = 0;j < a - 1;j++)
		{
			if (hm[j] > hm[j + 1])
			{
				dqm = hm[j];
										 hm[j] = hm[j + 1];
										  hm[j + 1] = dqm;
			}
		}
	}
	for (i = 0;i < b - 1;i++)
	{
		for (j = 0;j < b - 1;j++)
		{
			if (hf[j] < hf[j + 1])
			{
				dqf = hf[j];
										 hf[j] = hf[j + 1];
										  hf[j + 1] = dqf;
			}
		}
	}
	for (i = 0;i < a;i++)
	{
		System.out.printf("%.2lf ",hm[i]);
	}
	for (i = 0;i < b;i++)
	{
		if (i < b - 1)
		{
			System.out.printf("%.2lf ",hf[i]);
		}
					 else
					 {
						 System.out.printf("%.2lf",hf[i]);
					 }
	}

	return 0;
	}

}

