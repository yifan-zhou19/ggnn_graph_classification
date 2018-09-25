package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int Number;
		Number = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		if (Number % 3 == 0 && Number % 5 == 0 && Number % 7 == 0)
		{
		System.out.print(3);
		System.out.print(" ");
		System.out.print(5);
		System.out.print(" ");
		System.out.print(7);
		System.out.print("\n");
		}
		if (Number % 3 == 0 && Number % 5 == 0 && Number % 7 != 0)
		{
		System.out.print(3);
		System.out.print(" ");
		System.out.print(5);
		System.out.print("\n");
		}
		if (Number % 3 == 0 && Number % 5 != 0 && Number % 7 == 0)
		{
		System.out.print(3);
		System.out.print(" ");
		System.out.print(7);
		System.out.print("\n");
		}
		if (Number % 3 != 0 && Number % 5 == 0 && Number % 7 == 0)
		{
		System.out.print(5);
		System.out.print(" ");
		System.out.print(7);
		System.out.print("\n");
		}
		if (Number % 3 != 0 && Number % 5 != 0 && Number % 7 == 0)
		{
		System.out.print(7);
		System.out.print("\n");
		}
		 if (Number % 3 != 0 && Number % 5 == 0 && Number % 7 != 0)
		 {
		System.out.print(5);
		System.out.print("\n");
		 }
		 if (Number % 3 == 0 && Number % 5 != 0 && Number % 7 != 0)
		 {
		System.out.print(3);
		System.out.print("\n");
		 }
		if (Number % 3 != 0 && Number % 5 != 0 && Number % 7 != 0)
		{
		System.out.print("n");
		System.out.print("\n");
		}
		System.in.read();
		System.in.read();
		System.in.read();
		System.in.read();
		return 0;
	}
}

