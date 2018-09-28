package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int x;
	int sum = 0;
	x = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	if (x % 3 == 0)
	{
	sum = sum + 3;
	}
	if (x % 5 == 0)
	{
	sum = sum + 5;
	}
	if (x % 7 == 0)
	{
	sum = sum + 7;
	}
	switch (sum)
	{
	case 15:
		System.out.print("3 ");
		System.out.print("5 ");
		System.out.print("7");
		System.out.print("\n");
		break;
	case 8:
		System.out.print("3 ");
		System.out.print("5");
		System.out.print("\n");
		break;
	case 10:
		System.out.print("3 ");
		System.out.print("7");
		System.out.print("\n");
		break;
	case 12:
		System.out.print("5 ");
		System.out.print("7");
		System.out.print("\n");
		break;
	case 3:
		System.out.print("3");
		System.out.print("\n");
		break;
	case 5:
		System.out.print("5");
		System.out.print("\n");
		break;
	case 7:
		System.out.print("7");
		System.out.print("\n");
		break;
	default:
		System.out.print("n");
		System.out.print("\n");
		break;
	}
	return 0;
	}
}

