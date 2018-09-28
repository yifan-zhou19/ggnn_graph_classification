package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int r;
		int s;
		int u;
		int m;
		int a;
		int t = 0;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int[] num = new int[100000];
		for (i = 0; i <= n - 1; i++)
		{
			num[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		a = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (r = 0; r <= n - 1; r++)
		{
			if (num[r] == a)
			{
				t = t + 1;
			}
			if (num[r] != a)
			{
				num[r - t] = num[r];
			}
		}
		System.out.print(num[0]);
		for (m = 1; m <= n - 1 - t; m++)
		{
			System.out.print(" ");
			System.out.print(num[m]);
		}
		System.out.print("\n");
		return 0;
	}
}

