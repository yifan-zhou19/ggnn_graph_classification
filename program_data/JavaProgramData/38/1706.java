package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int n;
	int i;
	int j;
	int[] m = new int[100];
	double[] a = new double[200];
	double sum = 0;
	double pingfanghe = 0;
	double l;
	double[] s = new double[200];
	double ave;
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
			m[i] = Integer.parseInt(tempVar2);
		}
		for (j = 0;j < m[i];j++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				a[j] = Double.parseDouble(tempVar3);
			}
			sum += a[j];
		}

		ave = sum / m[i];
		for (j = 0;j < m[i];j++)
		{
			l = (a[j] - ave) * (a[j] - ave);
			pingfanghe += l;

		}

		s[i] = Math.sqrt(pingfanghe / m[i]);
		sum = 0;
		pingfanghe = 0;
		ave = 0;
	}
	for (i = 0;i < n;i++)
	{
	System.out.printf("%.5lf\n",s[i]);
	}
	return 0;
	}
}

