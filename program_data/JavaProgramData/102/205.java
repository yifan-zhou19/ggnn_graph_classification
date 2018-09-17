package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		double[] m = new double[41];
		double[] f = new double[41];
		double h;
		String s = new String(new char[10]);
		int n;
		int nm;
		int nf;
		int i;
		int j;

		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		i = j = 0;
		while (n-- != 0)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				s = tempVar2.charAt(0);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				h = Double.parseDouble(tempVar3);
			}
			if (strcmp(s,"male") == 0)
			{
				m[i++] = h;
			}
			else
			{
				f[j++] = h;
			}
		}
		nm = i;
		nf = j;
		for (i = 0;i < nm;i++)
		{
			for (j = i + 1;j < nm;j++)
			{
				if (m[i] > m[j])
				{
					h = m[i];
					m[i] = m[j];
					m[j] = h;
				}
			}
		}
		for (i = 0;i < nf;i++)
		{
			for (j = i + 1;j < nf;j++)
			{
				if (f[i] < f[j])
				{
					h = f[i];
					f[i] = f[j];
					f[j] = h;
				}
			}
		}
		if (nm > 0)
		{
			System.out.printf("%.2f",m[0]);
		}
		for (i = 1;i < nm;i++)
		{
			System.out.printf(" %.2f",m[i]);
		}
		for (i = 0;i < nf;i++)
		{
			System.out.printf(" %.2f",f[i]);
		}
		System.out.print("\n");
		return 0;
	}
}

