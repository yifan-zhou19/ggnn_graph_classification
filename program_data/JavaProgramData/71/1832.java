package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] year =
		{
			{31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31},
			{31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31}
		};
		int n;
		int i;
		int month1;
		int month2;
		int nyear;
		int sum = 0;
		int j;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			sum = 0;
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				nyear = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				month1 = Integer.parseInt(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead(" ");
			if (tempVar4 != null)
			{
				month2 = Integer.parseInt(tempVar4);
			}
			if (month1 < month2)
			{
			if (nyear % 4 != 0 || (nyear % 100 == 0 && nyear % 400 != 0))
			{
				for (j = month1 - 1;j < month2 - 1;j++)
				{
					sum = sum + year[0][j];
				}

			}
			else
			{
				for (j = month1 - 1;j < month2 - 1;j++)
				{
					sum = sum + year[1][j];
				}
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
		else
		{
			if (nyear % 4 != 0 || (nyear % 100 == 0 && nyear % 400 != 0))
			{
				for (j = month2 - 1;j < month1 - 1;j++)
				{
					sum = sum + year[0][j];
				}

			}
			else
			{
				for (j = month2 - 1;j < month1 - 1;j++)
				{
					sum = sum + year[1][j];
				}
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


	}

}

