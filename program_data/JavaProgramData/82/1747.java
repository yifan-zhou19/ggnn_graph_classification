package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int hour;
		int answer;
		int k;
		int p;
		int[] sys = new int[100];
		int[] dia = new int[100];
		int[] hours = new int[100];
		//???????sys???????dia???????hours???????
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 1,k = 0,hour = 0;i <= n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				sys[i] = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				dia[i] = Integer.parseInt(tempVar3);
			}
			if (sys[i] <= 140 && sys[i] >= 90 && dia[i] <= 90 && dia[i] >= 60)
			{
				hour += 1;
				if (hour > k)
				{
					k = hour;
				}
				else
				{
					k = k;
				}
			}
			else
			{
				hour = 0;
			}
			hours[i] = hour;
		}
		hours[0] = 0;
		for (i = 1,answer = 0;i <= n;i++)
		{
			if (hours[i] >= hours[i - 1])
			{
				answer = hours[i];
			}
			else
			{
				answer = answer;
			}
		}
		answer = k;
		System.out.printf("%d\n",answer);
		return 0;
	}
}

