package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int k;
		int p;
		double sg;
		double[] ns = new double[50];
		double[] nv = new double[50];
		double e;
		String xb = new String(new char[10]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		j = 0;
		k = 0;
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				xb = tempVar2.charAt(0);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				sg = Double.parseDouble(tempVar3);
			}
			if (xb.charAt(0) == 'm')
			{
				ns[j] = sg;
				j++;
			}
			else
			{
				nv[k] = sg;
				k++;
			}
		}
		for (i = 0;i < j;i++)
		{
			for (p = 0;p < j - 1;p++)
			{
				if (ns[p] > ns[p + 1])
				{
					e = ns[p];
					ns[p] = ns[p + 1];
					ns[p + 1] = e;
				}
			}
		}
		for (i = 0;i < k;i++)
		{
			for (p = 0;p < k - 1;p++)
			{
				if (nv[p] < nv[p + 1])
				{
					e = nv[p];
					nv[p] = nv[p + 1];
					nv[p + 1] = e;
				}
			}
		}
		System.out.printf("%.2lf",ns[0]);
		for (i = 1;i < j;i++)
		{
			System.out.printf(" %.2lf",ns[i]);
		}
		for (i = 0;i < k;i++)
		{
			System.out.printf(" %.2lf",nv[i]);
		}
		return 0;
	}

}

