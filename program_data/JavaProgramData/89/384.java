package <missing>;

public class GlobalMembers
{
	public static int[][] pe = new int[2][100000];
	public static int Main()
	{
		int n;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int a;
		int b;
		for (int i = 0;i < n;i++)
		{
		pe[0][i] = 0;
		pe[1][i] = 0;
		}
		while (true)
		{
		a = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		b = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		if (a == 0 && b == 0)
		{
		break;
		}
		pe[0][a]++;
		pe[1][b]++;
		}
		for (int i = 0;i < n;i++)
		{
		if (pe[0][i] == 0 && pe[1][i] == n - 1)
		{
		System.out.print(i);
		System.out.print("\n");
		return 0;
		}
		}
		System.out.print("NOT FOUND");
		System.out.print("\n");
		return 0;
	}

}

