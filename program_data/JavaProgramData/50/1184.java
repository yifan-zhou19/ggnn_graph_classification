package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int w;
		int i;
		int sum;
		int[] month = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		w = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		sum = 13 + w;
		for (i = 0; i <= 11; i++)
		{
			sum += month[i];
			if (sum % 7 == 6)
			{
				System.out.print(i + 1);
				System.out.print("\n");
			}
		}
		return 0;
	}
}

