package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int year;
		int month;
		int day;
		int Sn = 0;
		int i = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			year = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			month = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			day = Integer.parseInt(tempVar3);
		}
		if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0)
		{
			int[] months = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
			while (i < month - 1)
			{
				Sn = Sn + months[i];
				i++;
			}
			Sn = Sn + day;
		}
		else
		{
			int[] months = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
			while (i < month - 1)
			{
				Sn = Sn + months[i];
				i++;
			}
			Sn = Sn + day;
		}
		System.out.printf("%d",Sn);




		return 0;
	}
}

