package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int n;
		int l1;
		int l2;
		int j;
		double[] tall = new double[42];
		double[] t1 = new double[42];
		double[] t2 = new double[42];
		double tt;
		String s = new String(new char[10]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		l1 = 0;
		l2 = 0;
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
				tall[i] = Double.parseDouble(tempVar3);
			}
			if (s.charAt(0) == 'm')
			{
				t1[l1] = tall[i];
				l1++;
			}
			else
			{
				t2[l2] = tall[i];
				l2++;
			}

		}
		for (i = 0;i < l1 - 1;i++)
		{
			for (j = 0;j < l1 - i - 1;j++)
			{
				if (t1[j] > t1[j + 1])
				{
					tt = t1[j];
					t1[j] = t1[j + 1];
					t1[j + 1] = tt;
				}
			}
		}
		for (i = 0;i < l1;i++)
		{
			System.out.printf("%.2lf ",t1[i]);
		}
		for (i = 0;i < l2 - 1;i++)
		{
			for (j = 0;j < l2 - i - 1;j++)
			{
				if (t2[j] < t2[j + 1])
				{
					tt = t2[j];
					t2[j] = t2[j + 1];
					t2[j + 1] = tt;
				}
			}
		}
		for (i = 0;i < l2 - 1;i++)
		{
			System.out.printf("%.2lf ",t2[i]);
		}
		System.out.printf("%.2lf",t2[i]);
		return 0;
	}
}

