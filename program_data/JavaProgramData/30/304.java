package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n = 0;
			 int i = 0;
		int sum = 0;
			 n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));

		for (i = 1;i <= n; i++)
		{
			if (i % 7 != 0 && (i - 7) % 10 != 0 && (i / 10) != 7)
			{
				sum += i * i;
			}
		}

		System.out.print(sum);



		return 0;

	}

}

