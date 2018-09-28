package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int a;
		int b = 0;
		a = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		if (a % 3 == 0)
		{
		   System.out.print(3);
		   b = 1;
		}
		if (a % 5 == 0)
		{
		   if (b == 1)
		   {
		   System.out.print(" ");
		   }
		   System.out.print(5);
		   b = 1;
		}
		if (a % 7 == 0)
		{
			if (b == 1)
			{
			System.out.print(" ");
			}
			System.out.print(7);
			b = 1;
		}
		if (b == 0)
		{
		System.out.print("n");
		}
		System.out.print("\n");
		return EXIT_SUCCESS;
	}

}

