package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int p;
		int[] n = new int[5];
		int[] year = new int[5];
		int[] month = new int[5];
		int[] day = new int[5];
		int[] days = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
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
		if ((year[i] % 4 == 0 && year[i] % 100 != 0) || year[i] % 400 == 0)
		{
			days[2] = 29;
		}
		else
		{
			days[2] = 28;
		}
		for (p = 0;p < month[i];p++)
		{
			n[i] = n[i] + days[p];
		}
		n[i] = n[i] + day[i];
		}
		for (i = 0;i < 5;i++)
		{
		System.out.printf("%d\n",n[i]);
		}
		return 0;
	}

}

