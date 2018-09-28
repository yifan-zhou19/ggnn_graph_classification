package <missing>;

public class GlobalMembers
{
	public static int djt(int year,int month)
	{
		int i;
		int sum = 1;
		for (i = 1;i < month;i++)
		{
			switch (i)
			{
				case 1:
				case 3:
				case 5:
				case 7:
				case 8:
				case 10:
					sum += 31;
					break;
				case 4:
				case 6:
				case 9:
				case 11:
					sum += 30;
					break;
				case 2:
					if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0)
					{
						sum += 29;
					}
					else
					{
						sum += 28;
					}
			}
		}
		return sum;
	}
	public static int Main()
	{
		int n;
		int i;
		int[] year = new int[200];
		int[] month1 = new int[200];
		int[] month2 = new int[200];
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
				(year[i]) = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				(month1[i]) = Integer.parseInt(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				(month2[i]) = Integer.parseInt(tempVar4);
			}
		}
		for (i = 0;i < n;i++)
		{
			if ((djt(year[i], month1[i]) - djt(year[i], month2[i])) % 7 == 0)
			{
				System.out.print("YES\n");
			}
			else
			{
				System.out.print("NO\n");
			}

		}
		return 0;
	}
}

