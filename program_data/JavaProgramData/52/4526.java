package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int m;
		int[] num = new int[100];
		int[] k = new int[100];
		int t;
		int p;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int i = 0;i < n;i++)
		{
			num[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		for (int i = 0;i < m;i++)
		{
			p = num[n - 1];
		for (int j = n - 1;j > 0;j--)
		{
			num[j] = num[j - 1];
		}
		num[0] = p;
		}
		for (int i = 0;i < n - 1;i++)
		{
			System.out.print(num[i]);
			System.out.print(" ");
		}
		System.out.print(num[n - 1]);
		return 0;
	}
}

