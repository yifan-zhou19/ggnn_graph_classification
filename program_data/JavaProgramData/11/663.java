package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int DJT = 0;
		int[] D = new int[12];
		D[0] = 31;
		D[1] = 28;
		D[2] = 31;
		D[3] = 30;
		D[4] = 31;
		D[5] = 30;
		D[6] = 31;
		D[7] = 31;
		D[8] = 30;
		D[9] = 31;
		D[10] = 30;
		D[11] = 31;
		int year;
		int month;
		int day;
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
		if (year % 400 == 0)
		{
			D[1] = D[1] + 1;
		}
		else if (year % 100 != 0 && year % 4 == 0)
		{
			D[1] = D[1] + 1;
		}
		else
		{
			D[1] = D[1];
		}
		for (int i = 0;i < month - 1;i++)
		{
			DJT = DJT + D[i];
		}
		DJT = DJT + day;
		System.out.printf("%d\n",DJT);
		return 0;
	}
}

