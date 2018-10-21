package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int m;
		int j;
		int k;
		int mark;
		double i;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			k = Integer.parseInt(tempVar2);
		}
		for (i = k;i < 1000000000;i++)
		{
			m = 0;
			mark = 1;
			m = i * n + k;
			for (j = 1;j < n;j++)
			{
				if (m % (n - 1) != 0)
				{
					mark = 0;
					break;
				}
				else
				{
					m = m / (n - 1) * n + k;
				}
			}
			if (mark != 0)
			{
				System.out.printf("%d",m);
				break;
			}
		}
		return 0;
	}

}

