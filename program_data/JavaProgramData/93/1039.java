package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int x;
		x = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		if (x % 105 == 0)
		{
			System.out.print(3);
			System.out.print(" ");
			System.out.print(5);
			System.out.print(" ");
			System.out.print(7);
			System.out.print("\n");
		}
		else if (x % 35 == 0)
		{
			System.out.print(5);
			System.out.print(" ");
			System.out.print(7);
			System.out.print("\n");
		}
		   else if (x % 21 == 0)
		   {
			   System.out.print(3);
			   System.out.print(" ");
			   System.out.print(7);
			   System.out.print("\n");
		   }
		else if (x % 15 == 0)
		{
			System.out.print(3);
			System.out.print(" ");
			System.out.print(5);
			System.out.print("\n");
		}
		else if (x % 7 == 0)
		{
			System.out.print(7);
			System.out.print("\n");
		}
		else if (x % 5 == 0)
		{
			System.out.print(5);
			System.out.print("\n");
		}
		else if (x % 3 == 0)
		{
			System.out.print(3);
			System.out.print("\n");
		}
		else if (x % 3 != 0 && x % 5 != 0 && x % 7 != 0)
		{
			System.out.print("n");
			System.out.print("\n");
		}
		return 0;
	}
}

