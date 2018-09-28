package <missing>;

public class GlobalMembers
{
	//1000062701
	public static int Main()
	{
		int i;
		int n;
		int sum = 0;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1;i <= n;i++)
		{
			if (i % 7 == 0 || i % 10 == 7 || i / 10 == 7)
			{
				continue;
			}
			sum = sum + i * i;
		}
		System.out.print(sum);
		System.out.print("\n");
		System.in.read();
		System.in.read();
		return 0;
	}
}

