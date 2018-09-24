package <missing>;

public class GlobalMembers
{
	public static int[] b = new int[21];

	public static void cal()
	{
		b[0] = 1;
		b[1] = 1;
		for (int i = 2 ;i <= 20;i++)
		{
			b[i] = b[i - 1] + b[i - 2];
		}
	}

	public static int Main()
	{
		int a;
		int n;
		cal();
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		while (n-- != 0)
		{
			a = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			System.out.print(b[a - 1]);
			System.out.print("\n");
		}
		return 0;
	}
}

