package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] year = new int[5];
		int[] month = new int[5];
		int[] day = new int[5];
		int[] l = new int[5];
		int i = 0;
		for (i = 0;i < 5;i++)
		{
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			year[i] = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			month[i] = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			day[i] = Integer.parseInt(tempVar3);
		}
		}
		for (i = 0;i < 5;i++)
		{
		if ((year[i] % 4 == 0) && (year[i] % 100 != 0) || (year[i] % 400 == 0))
		{
			switch (month[i])
			{
				case 12:
					l[i] = l[i] + 30;
				case 11:
					l[i] = l[i] + 31;
				case 10:
					l[i] = l[i] + 30;
				case 9:
					l[i] = l[i] + 31;
				case 8:
					l[i] = l[i] + 31;
				case 7:
					l[i] = l[i] + 30;
				case 6:
					l[i] = l[i] + 31;
				case 5:
					l[i] = l[i] + 30;
				case 4:
					l[i] = l[i] + 31;
				case 3:
					l[i] = l[i] + 29;
				case 2:
					l[i] = l[i] + 31;
				case 1:
					l[i] = l[i];
			}
		}
		else
		{
			switch (month[i])
			{
				case 12:
					l[i] = l[i] + 30;
				case 11:
					l[i] = l[i] + 31;
				case 10:
					l[i] = l[i] + 30;
				case 9:
					l[i] = l[i] + 31;
				case 8:
					l[i] = l[i] + 31;
				case 7:
					l[i] = l[i] + 30;
				case 6:
					l[i] = l[i] + 31;
				case 5:
					l[i] = l[i] + 30;
				case 4:
					l[i] = l[i] + 31;
				case 3:
					l[i] = l[i] + 28;
				case 2:
					l[i] = l[i] + 31;
				case 1:
					l[i] = l[i];
			}
		}
		l[i] = l[i] + day[i];
		}
		for (i = 0;i < 5;i++)
		{
			System.out.printf("%d\n",l[i]);
		}
		return 0;
	}
}

