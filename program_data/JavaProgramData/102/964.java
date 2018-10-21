package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		char[][] sex = new char[100][10];
		String empty = new String(new char[10]);
		double[] len = new double[100];
		double[] male = new double[100];
		double[] female = new double[100];
		int i;
		int m = 0;
		int f = 0;
		int numm;
		int numf;
		int j;
		for (i = 0;i < n;i++)
		{
			empty = new Scanner(System.in).nextLine();
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				sex[i] = tempVar2.charAt(0);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				len[i] = Double.parseDouble(tempVar3);
			}
			if (sex[i][0] == 'm')
			{
				male[m] = len[i];
				m = m + 1;
			}
			if (sex[i][0] == 'f')
			{
				female[f] = len[i];
				f = f + 1;

			}
		}
		double e;
		for (i = 0;i < m;i++)
		{
			for (j = 1;j < m - i;j++)
			{
				if (male[j] < male[j - 1])
				{
					e = male[j - 1];
					male[j - 1] = male[j];
					male[j] = e;

				}
			}
		}
		for (i = 0;i < f;i++)
		{
			for (j = 1;j < f - i;j++)
			{
				if (female[j] > female[j - 1])
				{
					e = female[j - 1];
					female[j - 1] = female[j];
					female[j] = e;

				}
			}
		}
		for (i = 0;i < m;i++)
		{
			System.out.printf("%.2lf ",male[i]);
		}
		for (i = 0;i < f;i++)
		{
			if (i == f - 1)
			{
				System.out.printf("%.2lf",female[i]);
			}
			else
			{
				System.out.printf("%.2lf ",female[i]);
			}
		}
		return 0;




	}
}

