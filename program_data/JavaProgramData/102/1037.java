package <missing>;

public class GlobalMembers
{
	/*
	*/
	public static int Main()
	{
		int n;
		int i;
		int j;
		int b;
		int a;
		char x;
		char[][] str = new char[41][21];
		double[] sz = new double[41];
		double[] male = new double[41];
		double[] female = new double[41];
		double t;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < 41;i++)
		{
			male[41] = -1;
			female[41] = -1;
		}
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead(null, 1);
			if (tempVar2 != null)
			{
				x = tempVar2.charAt(0);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				str[i] = tempVar3.charAt(0);
			}
			String tempVar4 = ConsoleInput.scanfRead(" ");
			if (tempVar4 != null)
			{
				sz[i] = Double.parseDouble(tempVar4);
			}
		}
		a = 0;
		b = 0;
		for (i = 0;i < n;i++)
		{
			if (str[i][0] == 'm')
			{
				male[a] = sz[i];
				a++;
			}
			else if (str[i][0] = 'f')
			{
				female[b] = sz[i];
				b++;
			}
		}
		for (i = 1;i < a;i++)
		{
			for (j = 0;j < a - i;j++)
			{
				if (male[j] > male[j + 1])
				{
					t = male[j];
					male[j] = male[j + 1];
					male[j + 1] = t;
				}
			}
		}
		for (i = 1;i < b;i++)
		{
			for (j = 0;j < b - i;j++)
			{
				if (female[j] < female[j + 1])
				{
					t = female[j];
					female[j] = female[j + 1];
					female[j + 1] = t;
				}
			}
		}
		for (i = 0;i < a;i++)
		{
			System.out.printf("%.2lf ",male[i]);
		}
		for (i = 0;i < b;i++)
		{
			if (i < b - 1)
			{
				System.out.printf("%.2lf ",female[i]);
			}
			else
			{
				System.out.printf("%.2lf\n",female[i]);
			}
		}
		return 0;
	}
}

