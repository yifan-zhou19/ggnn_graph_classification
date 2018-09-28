package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int num;
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
				num = Integer.parseInt(tempVar2);
			}
			int j;
			int a = 1;
			int b = 2;
			int c = 3;
			double sum = 0;
			double shu;
			for (j = 1;j <= num;j++)
			{
				if (j == 1)
				{
					shu = (double)b / a;
				}
				if (j == 2)
				{
					shu = (double)c / b;
				}
				if (j > 2)
				{
					a = c + b,b = c,c = a;
					shu = (double)c / b;
				}
				sum += shu;
			}
			System.out.printf("%0.3lf\n",sum);
		}
		return 0;
	}

}

