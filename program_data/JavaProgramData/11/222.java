package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] year = new int[10];
		int[] mon = new int[10];
		int[] date = new int[10];
		int[] day = new int[12];
		int i;
		int j;
		int[] sum = new int[10];
		for (i = 0;i <= 4;i++)
		{
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			year[i] = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			mon[i] = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead(" ");
		if (tempVar3 != null)
		{
			date[i] = Integer.parseInt(tempVar3);
		}
		}
		for (i = 0;i <= 4;i++)
		{
			sum[i] = 0;
		day[0] = 31;
		if (((year[i] % 4 == 0) && (year[i] % 100 != 0)) || (year[i] % 400 == 0))
		{
			day[1] = 29;
		}
		else
		{
			day[1] = 28;
		}
		day[2] = 31;
		day[3] = 30;
		day[4] = 31;
		day[5] = 30;
		day[6] = 31;
		day[7] = 31;
		day[8] = 30;
		day[9] = 31;
		day[10] = 30;
		day[11] = 31;
		for (j = 0;j <= mon[i] - 2;j++)
		{
			sum[i] = sum[i] + day[j];
		}
		sum[i] = sum[i] + date[i];
		System.out.printf("%d\n",sum[i]);
		}
		return 0;
	}
}

