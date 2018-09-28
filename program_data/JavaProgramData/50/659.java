package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		int[] month = new int[13];
		int day;
		int n = 0;
		int i;
		int d;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			day = Integer.parseInt(tempVar);
		}
		for (i = 1;i <= 12;i++)
		{
			month[0] = 0;
			if (i == 2)
			{
				month[i] = 28;
			}

			if (i == 1 || i == 3 || i == 5 || i == 7 || i == 8 || i == 10 || i == 12)
			{
			   month[i] = 31;
			}
			if (i == 4 || i == 6 || i == 9 || i == 11)
			{
				month[i] = 30;
			}
			n += month[i - 1];
			d = ((((n + 13) % 7) + day) % 7) - 1;
			if (d == 5)
			{
				System.out.printf("%d\n",i);
			}
		}


	}


}

