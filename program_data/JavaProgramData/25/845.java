package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] num = new int[100];
		num[0] = 1;
		int x;
		int i;
		int j;
		x = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0; i < x; i++)
		{
			for (j = 0; j < 100; j++)
			{
				num[j] = 2 * num[j];
			}
			for (j = 0; j < 100; j++)
			{
				if (num[j] > 9)
				{
					num[j] = num[j] - 10;
					num[j + 1]++;
				}
			}
		}
		i = 99;
		while (num[i] == 0)
		{
			i--;
		}
		for (; i >= 0; i--)
		{
			System.out.print(num[i]);
		}
		System.out.print("\n");
		return 0;
	}

}

