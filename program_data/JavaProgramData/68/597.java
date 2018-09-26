package <missing>;

public class GlobalMembers
{
	public static int ss(int n) //??n????????????1?????0
	{
		int i;
		for (i = 2; i <= (int)Math.sqrt(n); i++)
		{
			if (n % i == 0)
			{
				return 0;
			}
		}
				return 1;
	}

	public static int Main()
	{
		int i;
		int j;
		int iLine;
		int m;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		for (i = 6; i <= m; i += 2)
		{
			for (j = 3; j < i; j++)
			{
				if (ss(j) != 0 && ss(i - j) != 0)
				{
					System.out.printf("%d=%d+%d\n",i,j,i - j);
					iLine++;
				if (iLine % 5 == 0)
				{
					System.out.print('\r');
				}
					break;
				}
			}
		}
	 return 0;
	}

}

