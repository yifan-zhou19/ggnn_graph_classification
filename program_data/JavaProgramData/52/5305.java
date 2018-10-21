package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m;
		int n;
		int i;
		int[] numbers = new int[105];
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = m; i < n; i++)
		{
			numbers[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		for (i = 0; i < m; i++)
		{
			numbers[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		for (i = 0; i < n; i++)
		{
			if (i != (n - 1))
			{
				System.out.print(numbers[i]);
				System.out.print(" ");
			}
			else
			{
				System.out.print(numbers[i]);
			}
		}
		return 0;
	}

}

