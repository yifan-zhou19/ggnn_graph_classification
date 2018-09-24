package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int[] hash = new int[100];
		int sum = 0;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1; i <= n; i++)
		{
			hash[i] = 1;
			if (i >= 70 && i <= 79)
			{
			  hash[i] = 0;
			}
			else if (i % 10 == 7)
			{
			  hash[i] = 0;
			}
			else if (i % 7 == 0)
			{
			  hash[i] = 0;
			}
		}
		for (i = 1; i <= n; i++)
		{
			if (hash[i] == 1)
			{
			sum = sum + i * i;
			}
		}
		System.out.print(sum);
		int a;
		a = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		return 0;

	}

}

