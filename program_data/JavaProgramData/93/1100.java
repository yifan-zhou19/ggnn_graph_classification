package <missing>;

public class GlobalMembers
{
	public static int Main() //???
	{
		int n;
		int a;
		int b;
		int c;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		if (n % 3 == 0 && n % 5 == 0 && n % 7 == 0) //?3?5,7??
		{
			System.out.print("3");
			System.out.print(" ");
			System.out.print("5");
			System.out.print(" ");
			System.out.print(7);
		}
		else if (n % 3 == 0 && n % 5 == 0 && n % 7) //?3?5??
		{
			System.out.print("3");
			System.out.print(" ");
			System.out.print("5");
		}
		else if (n % 3 == 0 && n % 5 && n % 7 == 0) //?3?7??
		{
			System.out.print("3");
			System.out.print(" ");
			System.out.print("7");
		}
		else if (n % 3 && n % 5 == 0 && n % 7 == 0) //?5,7??
		{
			System.out.print("5");
			System.out.print(" ");
			System.out.print("7");
		}
		else if (n % 3 == 0 && n % 5 && n % 7) //?3??
		{
			System.out.print(3);
		}
		else if (n % 3 && n % 5 == 0 && n % 7) //?5??
		{
			System.out.print(5);
		}
		else if (n % 3 && n % 5 && n % 7 == 0) //?7??
		{
			System.out.print(7);
		}
		else if (n % 3 && n % 5 && n % 7) //??3?5,7??
		{
			System.out.print("n");
		}
	return 0;
	}

}

