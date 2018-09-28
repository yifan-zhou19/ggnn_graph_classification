package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int num;
		if (5 - n < 0)
		{
			num = 5 - n + 7;
		}
		else
		{
			num = 5 - n;
		}
		int[] month = {0, 31, 59, 90, 120, 151, 181, 212, 243, 273, 304, 334};
		for (int i = 0;i < 12;i++)
		{
			if ((month[i] + 12) % 7 == num)
			{
				System.out.print(i + 1);
				System.out.print("\n");
			}
		}

	}
}

