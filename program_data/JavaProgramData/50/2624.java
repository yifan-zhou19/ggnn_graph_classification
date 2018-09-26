package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int day;
		int[] mon = new int[12];
		int i = 0;
		int k;

		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			day = Integer.parseInt(tempVar);
		}

		if ((13 + day + 1) % 7 == 0)
		{
			mon[i] = 1;
		i++;
		}

		if ((13 + day + 1 + 31) % 7 == 0)
		{
			mon[i] = 2;
		i++;
		}

		if ((13 + day + 1 + 31 + 28) % 7 == 0)
		{
				mon[i] = 3;
		i++;
		}

		if ((13 + day + 1 + 31 + 28 + 31) % 7 == 0)
		{
				mon[i] = 4;
		i++;
		}

		if ((13 + day + 1 + 31 + 28 + 31 + 30) % 7 == 0)
		{
				mon[i] = 5;
		i++;
		}

		if ((13 + day + 1 + 31 + 28 + 31 + 30 + 31) % 7 == 0)
		{
			mon[i] = 6;
		i++;
		}

		if ((13 + day + 1 + 31 + 28 + 31 + 30 + 30 + 31) % 7 == 0)
		{
			mon[i] = 7;
		i++;
		}

		if ((13 + day + 1 + 31 + 28 + 31 + 30 + 30 + 31 + 31) % 7 == 0)
		{
			mon[i] = 8;
		i++;
		}

		if ((13 + day + 1 + 31 + 28 + 31 + 30 + 30 + 31 + 31 + 31) % 7 == 0)
		{
			mon[i] = 9;
		i++;
		}

		if ((13 + day + 1 + 31 + 28 + 31 + 30 + 30 + 31 + 31 + 31 + 30) % 7 == 0)
		{
			mon[i] = 10;
		i++;
		}

		if ((13 + day + 1 + 31 + 28 + 31 + 30 + 30 + 31 + 31 + 31 + 30 + 31) % 7 == 0)
		{
			mon[i] = 11;
		i++;
		}

		if ((13 + day + 1 + 31 + 28 + 31 + 30 + 30 + 31 + 31 + 31 + 30 + 31 + 30) % 7 == 0)
		{
			mon[i] = 12;
		i++;
		}

		k = i;

		System.out.printf("%d",mon[0]);

		for (i = 1;i < k;i++)
		{
			System.out.printf("\n%d",mon[i]);
		}

		return 0;
	}







}

