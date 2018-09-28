package <missing>;

public class GlobalMembers
{
	public static int[] star = new int[3];
	public static int[] end = new int[3];
	public static int sum = 0;
	public static int[] month1 = {0, 31, 60, 91, 121, 152, 182, 213, 244, 274, 305, 335, 366};
	public static int[] month2 = {0, 31, 59, 90, 120, 151, 181, 212, 243, 273, 304, 334, 365};
	public static int countday(int[] ch1, int[] ch2)

	{
		sum = sum - ch1[2] + ch2[2];
		countmonth(star, end);

		return (sum);
	}
	public static int countmonth(int[] ch1, int[] ch2)
	{
		if ((ch1[0] % 4 == 0 && ch1[0] % 100 != 0) || (ch1[0] % 400 == 0))
		{
			if ((ch2[0] % 4 == 0 && ch2[0] % 100 != 0) || (ch2[0] % 400 == 0))
			{
				sum = sum - month1[ch1[1] - 1] + month1[ch2[1] - 1];
			}
			else
			{
				sum = sum - month1[ch1[1] - 1] + month2[ch2[1] - 1];

			}
		}
		else
		{
			if ((ch2[0] % 4 == 0 && ch2[0] % 100 != 0) || (ch2[0] % 400 == 0))
			{
				sum = sum - month2[ch1[1] - 1] + month1[ch2[1] - 1];
			}
			else
			{
				sum = sum - month2[ch1[1] - 1] + month2[ch2[1] - 1];


			}
		}
		countyear(star, end);
		return (sum);
	}
	public static int countyear(int[] ch1, int[] ch2)
	{
		while (ch1[0] < ch2[0])
		{
				if ((ch1[0] % 4 == 0 && ch1[0] % 100 != 0) || (ch1[0] % 400 == 0))
				{
					sum = sum + 366;
				}
				else
				{
					sum = sum + 365;
				}
				ch1[0]++;
		}
			return (sum);
	}



	public static void Main()
	{
		int i;
		int j;
		for (i = 0;i < 3;i++)
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				star[i] = Integer.parseInt(tempVar);
			}
		}
		for (j = 0;j < 3;j++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				end[j] = Integer.parseInt(tempVar2);
			}
		}
		countday(star, end);
		System.out.printf("%d\n",sum);
	}
}

