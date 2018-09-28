package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int[] month = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		int j = 0;
		for (int i = 13;i < 365;i = i + month[j++])
		{
			if ((i + n - 1) % 7 == 5)
			{
				System.out.print(j + 1);
				System.out.print("\n");
			}

		}
		return 0;
	}



}

