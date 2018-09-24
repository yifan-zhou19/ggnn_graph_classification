package <missing>;

public class GlobalMembers
{
	public static int i;
	public static int k;
	public static int[] num = new int[50];
	public static int[] temp = new int[50];
	public static int mul()
	{
		int m;
		for (m = 0;m < 50;m++)
		{
			temp[m] = temp[m] + num[m] * 2;
			if (temp[m] >= 10)
			{
				temp[m + 1]++;
				temp[m] = temp[m] % 10;
			}
		}
		for (m = 0;m < 50;m++)
		{
			num[m] = temp[m];
		}
		for (m = 0;m < 50;m++)
		{
			temp[m] = 0;
		}
		return 0;
	}
	public static int Main()
	{
		k = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		num[0] = 2;
		if (k != 0)
		{
			for (i = 0;i < k - 1;i++)
			{
			mul();
			}
		for (i = 1;num[50 - i] == 0;i++)
		{
			;
		}
		for (;i <= 50;i++)
		{
			System.out.print(num[50 - i]);
		}
		}
		else
		{
			System.out.print(1);
		}

		return 0;
	}
}

