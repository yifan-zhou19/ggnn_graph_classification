package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		final int[] month1 = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		final int[] month2 = {0, 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		int[] year = new int[200];
		int[] yue1 = new int[200];
		int[] yue2 = new int[200];
		int n;
		int day;
		int i;
		int j;
		int t;

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
				year[i] = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				yue1[i] = Integer.parseInt(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				yue2[i] = Integer.parseInt(tempVar4);
			}
			if (year[i] % 400 == 0 || year[i] % 4 == 0 && year[i] % 100 != 0) //??
			{
				if (yue1[i] > yue2[i])
				{
					t = yue1[i];
					yue1[i] = yue2[i];
					yue2[i] = t;
				}
				day = 0;
				for (j = yue1[i];j < yue2[i];j++)
				{
					day += month2[j];
				}
				if (day % 7 == 0)
				{
					System.out.print("YES\n");
				}
				else
				{
					System.out.print("NO\n");
				}


			}
			else //??
			{
					if (yue1[i] > yue2[i])
					{
					t = yue1[i];
					yue1[i] = yue2[i];
					yue2[i] = t;
					}
				day = 0;
				for (j = yue1[i];j < yue2[i];j++)
				{
					day += month1[j];
				}
				if (day % 7 == 0)
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

