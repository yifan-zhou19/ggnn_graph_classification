package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int k = 0;
		int r = 0;
		int t;
		double[] fm = new double[40];
		double[] m = new double[40];
		double e;
		double h;
		String x = new String(new char[7]);
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct pd
	//	{
	//		double h;
	//		char x[7];
	//	}
	//	pds[40];
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
				x = tempVar2.charAt(0);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				h = Double.parseDouble(tempVar3);
			}
			pds[i].x = x;
			pds[i].h = h;
		}
		for (i = 0;i < n;i++)
		{
			if (strcmp(pds[i].x,"male") == 0)
			{
				m[k] = pds[i].h;
				k++;
			}
			else
			{
				fm[r] = pds[i].h;
				r++;
			}
		}
		for (t = 1;t <= k;t++)
		{
			for (i = 0;i < k - t;i++)
			{
				if (m[i] > m[i + 1])
				{
					e = m[i];
					m[i] = m[i + 1];
					m[i + 1] = e;
				}
			}
		}
		for (t = 1;t <= r;t++)
		{
			for (i = 0;i < r - t;i++)
			{
				if (fm[i] < fm[i + 1])
				{
					e = fm[i];
					fm[i] = fm[i + 1];
					fm[i + 1] = e;
				}
			}
		}
		for (i = 0;i < k;i++)
		{
			System.out.printf("%.2lf ",m[i]);
		}
		for (i = 0;i < r - 1;i++)
		{
			System.out.printf("%.2lf ",fm[i]);
		}
		System.out.printf("%.2lf",fm[r - 1]);
		return 0;
	}

}

