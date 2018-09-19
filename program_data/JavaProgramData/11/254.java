package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		int[] a = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		int[] year = new int[5];
		int[] mon = new int[5];
		int[] day = new int[5];
		int sum = 0;
		int i;
		int j;
		for (j = 0;j < 5;j++)
		{
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			year[j] = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			mon[j] = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			day[j] = Integer.parseInt(tempVar3);
		}
		}
		for (j = 0;j < 5;j++)
		{
			if (year[j] % 400 == 0)
			{
				a[1] = 29;
			}
			else if (year[j] % 4 == 0)
			{
				if (year[j] % 100 == 0)
				{
					a[1] = 28;
				}
				else
				{
					a[1] = 29;
				}
			}
			for (i = 0;i <= (mon[j] - 2);i++)
			{
				sum = sum + a[i];
			}
			sum = sum + day[j];
			System.out.printf("%d\n",sum);
			sum = 0;
		}
	}
}

