package <missing>;

public class GlobalMembers
{
	public static int PrimeQ(int n)
	{
		int i;
		for (i = 2; i <= (double)Math.sqrt(n); i++)
		{
			if (n % i == 0)
			{
				return 0;
			}
		}
		if (i != n + 1)
		{
			return 1;
		}
		return 0;
	}

	public static int Main()
	{
		int i;
		int j;
		int min;
		int max;
		int temp;
		int count;
		int flag = 0;
		int[] num = new int[15];
		int[] result = new int[100];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			min = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			max = Integer.parseInt(tempVar2);
		}
		for (i = min; i <= max; i++)
		{
			if (PrimeQ(i) == 1)
			{
				temp = i;
				for (j = 0; temp != 0; j++)
				{
					num[j] = temp - temp / 10 * 10;
					temp /= 10;
				}
				temp = j - 1;
				count = 0;
				for (j = 0; j < (temp + 1) / 2; j++)
				{
					if (num[j] != num[temp - j])
					{
						count = 1;
						break;
					}
				}
				if (count == 0)
				{
					result[flag] = i;
					flag++;
				}
			}
		}
		if (flag == 0)
		{
			System.out.print("no\n");
		}
		else
		{
			for (i = 0; i < flag; i++)
			{
			System.out.printf("%d", result[i]);
			if (i != flag - 1)
			{
				System.out.print(",");
			}
			else
			{
				System.out.print("\n");
			}
			}
		}
		return 0;
	}
}

