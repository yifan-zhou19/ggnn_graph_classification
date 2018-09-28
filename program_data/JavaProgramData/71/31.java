package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int year;
		int m1;
		int n;
		int m2;
		int d1 = 0;
		int d2 = 0;
		int i;
		int j;
		int k;
		int[] month1 = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30};
		int[] month2 = {0, 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30};
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 1;i <= n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				year = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				m1 = Integer.parseInt(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead(" ");
			if (tempVar4 != null)
			{
				m2 = Integer.parseInt(tempVar4);
			}
			if ((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0)) //???//
			{
				for (j = 1;j <= m1;j++)
				{
					d1 += month2[j - 1];
				}
				for (j = 1;j <= m2;j++)
				{
					d2 += month2[j - 1];
				}
				if ((d1 - d2) % 7 == 0)
				{
					System.out.print("YES\n");
				}
				else
				{
					System.out.print("NO\n");
				}
			}
			else
			{
				for (j = 1;j <= m1;j++)
				{
					d1 += month1[j - 1];
				}
				for (j = 1;j <= m2;j++)
				{
					d2 += month1[j - 1];
				}
				if ((d1 - d2) % 7 == 0)
				{
					System.out.print("YES\n");
				}
				else
				{
					System.out.print("NO\n");
				}
			}
			d1 = 0;
			d2 = 0;
		}
		return 0;
	}
}

