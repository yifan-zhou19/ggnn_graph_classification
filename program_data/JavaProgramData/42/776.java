package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int sum = 0;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int[] num = new int[n];
		int a;
		for (i = 0; i < n; i++)
		{
			num[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		a = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0; i < n; i++)
		{
			if (num[i] == a)
			{
				num[i] = 1000;
			}
		}
		for (i = 0; i < n; i++)
		{
			if (num[i] != 1000)
			{
				if (sum == 0)
				{
					System.out.print(num[i]);
				}
				else
				{
					System.out.print(' ');
					System.out.print(num[i]);
				}
				sum++;
			}
		}
		return 0;
	}
}

