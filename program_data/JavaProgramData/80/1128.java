package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int a;
		int b;
		int c;
		int x;
		int y;
		int z;
		int i;
		int[] year = new int[3001];
		for (i = 0;i < 3001;i++)
		{
			if ((i % 4 == 0 && i % 100 != 0) || (i % 400 == 0))
			{
				year[i] = 366;
			}
			else
			{
				year[i] = 365;
			}
		}
		int[][] month =
		{
			{0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31},
			{0, 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31}
		};
		a = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		b = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		c = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		x = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		y = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		z = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		if (a == x)
		{
			int sum = 0;
			for (i = b;i < y;i++)
			{
			   sum = sum + month[(x % 4 == 0 && x % 100 != 0) || (x % 400 == 0)][i];
			}
			sum = sum + z - c;
		System.out.print(sum);
		System.out.print("\n");
		}
		else
		{
		int sum = year[a];
		for (i = 1;i < b;i++)
		{
			sum = sum - month[(a % 4 == 0 && a % 100 != 0) || (a % 400 == 0)][i];
		}
		sum = sum - c;
		for (i = a + 1;i < x;i++)
		{
			sum = sum + year[i];
		}
		for (i = 1;i < y;i++)
		{
			sum = sum + month[(x % 4 == 0 && x % 100 != 0) || (x % 400 == 0)][i];
		}
		sum = sum + z;
		System.out.print(sum);
		System.out.print("\n");
		}
		return 0;
	}
}

