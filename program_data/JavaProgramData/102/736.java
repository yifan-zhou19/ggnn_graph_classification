package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		int n;
		int i;
		int j;
		int mp = 0;
		int fp = 0;
		double[] male = new double[40];
		double[] female = new double[40];
		double h;
		double tmp;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String s = new String(new char[10]);
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
			if (s.charAt(0) == 'f')
			{
				female[fp] = h;
				fp++;
			}
			else
			{
				male[mp] = h;
				mp++;
			}
		}
		for (i = 0;i < mp;i++)
		{
			for (j = 0;j < mp - 1;j++)
			{
				if (male[j] > male[j + 1])
				{
					tmp = male[j];
					male[j] = male[j + 1];
					male[j + 1] = tmp;
				}
			}
		}
		for (i = 0;i < fp;i++)
		{
			for (j = 0;j < fp - 1;j++)
			{
				if (female[j] < female[j + 1])
				{
					tmp = female[j];
					female[j] = female[j + 1];
					female[j + 1] = tmp;
				}
			}
		}
		for (i = 0;i < mp;i++)
		{
			System.out.printf("%.2lf ",male[i]);
		}
		for (i = 0;i < fp;i++)
		{
			System.out.printf("%.2lf",female[i]);
			if (i != fp - 1)
			{
				System.out.print(" ");
			}
		}

	}


}

