package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int[] first = new int[100];
		for (int i = 0;i <= n - 1;i++)
		{
			first[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		for (int i = 0;i <= n - 1;i++)
		{
			if (i != n - 1)
			{
				System.out.print(first[n - 1 - i]);
				System.out.print(" ");
			}
			else
			{
				System.out.print(first[n - 1 - i]);
			}
		}
		System.in.read();
		System.in.read();
		return 0;
	}
}

