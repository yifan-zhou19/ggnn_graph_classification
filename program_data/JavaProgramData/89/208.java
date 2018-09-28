package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int[] take = new int[10000];
		int[] check = new int[10000];
		for (int p = 0; p < n; p++)
		{
			take[p] = 0;
			check[p] = 0;
		}
		int i;
		int j;
		while (true)
		{
			i = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			j = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			if (i == 0 && j == 0)
			{
				break;
			}
			else
			{
				take[i] = 1;
				check[j]++;
			}
		}
		int flag = 0;
		for (int k = 0; k < n; k++)
		{
			if (take[k] == 0 && check[k] == n - 1)
			{
				System.out.print(k);
				System.out.print("\n");
				flag = 1;
			}
		}
		if (flag == 0)
		{
			System.out.print("NOT FOUND");
			System.out.print("\n");
		}
		return 0;
	}
}

