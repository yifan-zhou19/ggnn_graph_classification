package <missing>;

public class GlobalMembers
{
	//******************************************
	// ??????3?5?7????             *
	// ???1200012826 ??                   *
	// ???2012?9?30?                     *
	//******************************************
	public static int Main() // ?????
	{
		int N; // ????N?x=3?y=5?z=7
		int x = 3;
		int y = 5;
		int z = 7;
		char n = 'n'; // ?????n
		N = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		if (N % 3 == 0) // ??????
		{
			if (N % 5 == 0 && N % 7 == 0)
			{
				System.out.print(x);
				System.out.print(' ');
				System.out.print(y);
				System.out.print(' ');
				System.out.print(z);
				System.out.print("\n");
			} // N???3?5?7?????3 5 7
		else if (N % 5 == 0 && N % 7 != 0)
		{
				System.out.print(x);
				System.out.print(' ');
				System.out.print(y);
				System.out.print("\n");
		} // N??3?5?????3 5
		else if (N % 5 != 0 && N % 7 == 0)
		{
				System.out.print(x);
				System.out.print(' ');
				System.out.print(z);
				System.out.print("\n");
		} // N??3?7?????3 7
		else
		{
				System.out.print(x);
				System.out.print("\n");
		} // N???3?????3
		}
		else if (N % 5 == 0 && N % 7 == 0)
		{
				System.out.print(y);
				System.out.print(' ');
				System.out.print(z);
				System.out.print("\n");
		} // N???5?7?????5 7
		else if (N % 5 == 0 && N % 7 != 0)
		{
				System.out.print(y);
				System.out.print("\n");
		} // N???5?????5
		else if (N % 5 != 0 && N % 7 == 0)
		{
				System.out.print(z);
				System.out.print("\n");
		} // N???7?????7
		else
		{
				System.out.print(n);
				System.out.print("\n");
		} // N???3?5?7????????n
		return 0;
	}
}

