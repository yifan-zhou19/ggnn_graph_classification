package <missing>;

public class GlobalMembers
{
	//C++ program by Ruby;
	//to judge whether n could be divided by 3,5,7.
	public static int Main()
	{
		int n; //n for testing number;s for a sumer
		int s;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		s = 0;
		if (n % 3 == 0)
		{
			s = s + 1;
			System.out.print("3");
		}
		if (n % 5 == 0)
		{
			if (s >= 1)
			{
				System.out.print(" ");
			}
			s = s + 1;
			System.out.print("5");
		}
		if (n % 7 == 0)
		{
			if (s >= 1)
			{
				System.out.print(" ");
			}
			s = s + 1;
			System.out.print("7");
		}
		if (s == 0)
		{
			System.out.print("n");
			System.out.print("\n");
		}
		return 0;
	}

}

