package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i = 0;
		int j = 0;
		int f = 0;
		int m = 0;
		double h;
		double t = 0;
		double[] male = new double[MAX];
		double[] fe = new double[MAX];
		String s = new String(new char[7]);
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
				s = tempVar2.charAt(0);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				h = Double.parseDouble(tempVar3);
			}
			int r = strcmp(s,"female");
			if (r == 0)
			{
				fe[f] = h;
				f++;
			}
			else if (r != 0)
			{
				male[m] = h;
				m++;
			}
		}
		for (i = f - 1;i > 0;i--)
		{
			for (j = 0;j < i;j++)
			{
				if (fe[j] < fe[j + 1])
				{
					t = fe[j];
					fe[j] = fe[j + 1];
					fe[j + 1] = t;
				}
			}
		}
		for (i = m - 1;i > 0;i--)
		{
			for (j = 0;j < i;j++)
			{
				if (male[j] > male[j + 1])
				{
					t = male[j + 1];
					male[j + 1] = male[j];
					male[j] = t;
				}
			}
		}
		for (i = 0;i < m;i++)
		{
			System.out.printf("%.2lf ",(male[i]));
		}
		for (i = 0;i < f - 1;i++)
		{
			System.out.printf("%.2lf ",(fe[i]));
		}
		System.out.printf("%.2lf",(fe[f - 1]));
		return 0;
	}
}

