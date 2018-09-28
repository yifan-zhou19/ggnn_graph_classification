package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int[] order = new int[21];
		int total_number;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1; i <= n; i++)
		{
			order[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			int Rabbit_Amount = int x;
			total_number = Rabbit_Amount(order[i]);
			System.out.print(total_number);
			System.out.print("\n");
		}
		return 0;
	}

	public static int Rabbit_Amount(int x)
	{
		int f1;
		int f2;
		int f;
		f1 = 1;
		f2 = 1;
		if ((x == 1) || (x == 2))
		{
			f = 1;
		}
		else
		{
			for (int j = 1; j <= x - 2; j++)
			{
				f = f1 + f2;
				f1 = f2;
				f2 = f;
			}
		}
		return f;
	}








}

