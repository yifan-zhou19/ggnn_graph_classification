package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int a;
	a = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	int s;
	int t;
	int d;
	s = (a % 3 == 0);
	t = (a % 5 == 0);
	d = (a % 7 == 0);
	if (s != 0 && t != 0 && d == 1)
	{
		System.out.print("3 5 7");
		System.out.print("\n");
	}
	if (s != 0 && (t == 0) && d == 1)
	{
		System.out.print("3 7");
		System.out.print("\n");
	}
	if (s != 0 && t != 0 && (d == 0) == 1)
	{
		System.out.print("3 5");
		System.out.print("\n");
	}
	if ((s == 0) && t != 0 && d == 1)
	{
		System.out.print("5 7");
		System.out.print("\n");
	}
	if ((s == 0) && (t == 0) && d == 1)
	{
		System.out.print("7");
		System.out.print("\n");
	}
	if ((s == 0) && t != 0 && (d == 0) == 1)
	{
		System.out.print("5");
		System.out.print("\n");
	}
	if (s != 0 && (t == 0) && (d == 0) == 1)
	{
		System.out.print("3");
		System.out.print("\n");
	}
	if ((s == 0) && (t == 0) && (d == 0) == 1)
	{
		System.out.print("n");
		System.out.print("\n");
	}
	return 0;
	}

}

