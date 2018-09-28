package <missing>;

public class GlobalMembers
{
	/*
	*	5.cpp
	*	???
	*	2013.9.29
	*	???????3?5?7????
	*/
	public static int Main() // ???
	{
		int num; // ????
		int x;
		int y;
		int z;
		num = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		x = !(num % 3);
		y = !(num % 5);
		z = !(num % 7);
		if (x == 1 && y == 1 && z == 1)
		{
			System.out.print("3 5 7");
			System.out.print("\n");
		}
		else if (x == 1 && y == 1 && z == 0)
		{
			System.out.print("3 5");
			System.out.print("\n");
		}
		else if (x == 1 && y == 0 && z == 1)
		{
			System.out.print("3 7");
			System.out.print("\n");
		}
		else if (x == 0 && y == 1 && z == 1)
		{
			System.out.print("5 7");
			System.out.print("\n");
		}
		else if (x == 1 && y == 0 && z == 0)
		{
			System.out.print("3");
			System.out.print("\n");
		}
		else if (x == 0 && y == 1 && z == 0)
		{
			System.out.print("5");
			System.out.print("\n");
		}
		else if (x == 0 && y == 0 && z == 1)
		{
			System.out.print("7");
			System.out.print("\n");
		}
		else
		{
			System.out.print("n");
			System.out.print("\n");
		}
		return 0;
	}

}

