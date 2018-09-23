package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int m;
		int d;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			m = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			d = Integer.parseInt(tempVar3);
		}
		int a = d;
		for (i = 1;i <= m - 1;i++)
		{
			if (i == 1 || i == 3 || i == 5 || i == 7 || i == 8 || i == 10)
			{
			a += 31;
			}
			else if (i == 4 || i == 6 || i == 9 || i == 11)
			{
				a += 30;
			}
			else
			{
				if ((n % 100 == 0 && n % 400 != 0) || n % 4 != 0)
				{
				a += 28;

				}
				else
				{
				a += 29;
				}
			}
		}
			System.out.printf("%d",a);
			return 0;
	}

}

