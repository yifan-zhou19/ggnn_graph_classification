package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int x;
		int biggest = 0;
		int bigger = 0;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		while (n-- != 0)
		{
			x = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			if (x > biggest)
			{
				bigger = biggest;
				biggest = x;
			}
			else if (x > bigger)
			{
				bigger = x;
			}
		}
		System.out.print(biggest);
		System.out.print("\n");
		System.out.print(bigger);
		System.out.print("\n");
		return 0;
	}
}

