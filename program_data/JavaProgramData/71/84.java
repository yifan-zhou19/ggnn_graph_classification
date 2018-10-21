package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 1;i <= n;i++)
		{
			int y;
			int m1;
			int m2;
			int m = 0;
			int j;
			int sum = 0;
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				y = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				m1 = Integer.parseInt(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				m2 = Integer.parseInt(tempVar4);
			}
			if (m1 > m2)
			{
				m = m1;
				m1 = m2;
				m2 = m;
			}

			if ((y % 4 == 0 && y % 100 != 0) || (y % 400 == 0))
			{
				int[] mon = {0, 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
				for (j = m1;j <= m2 - 1;j++)
				{
					sum = sum + mon[j];
				}
				if (sum % 7 == 0)
				{
				System.out.print("YES\n");
				}
				else
				{
				System.out.print("NO\n");
				}
			}
			else if ((y % 4 != 0) || (y % 100 == 0 && y % 400 != 0))
			{
				int[] mon = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
				for (j = m1;j <= m2 - 1;j++)
				{
					sum = sum + mon[j];
				}
				if (sum % 7 == 0)
				{
				System.out.print("YES\n");
				}
				else
				{
				System.out.print("NO\n");
				}
			}
		}
		//int a;
		//scanf("%d",&a);
		//printf("%d",a);
		return 0;
	}

}

