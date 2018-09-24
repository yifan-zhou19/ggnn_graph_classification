package <missing>;

public class GlobalMembers
{
	public static int Main()
	{

	int n = 0;
	int a;
	int b;
	int c;
	int[] d = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
	a = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	b = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	c = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));

	for (int i = 1;i <= (a - 1) % 400;++i)
	{
	if (i % 400 == 0 || (i % 4 == 0 && i % 100 != 0))
	{
	n += 2;
	}
	else
	{
	n += 1;
	}
	}

	if (a % 400 == 0 || (a % 4 == 0 && a % 100 != 0))
	{
	++d[2];
	}

	for (int i = 1;i < b;++i)
	{
		n += d[i];
	}
	n = (n + c - 1) % 7;
	switch (n)
	{
	case 0:
		System.out.print("Mon.");
		break;
	case 1:
		System.out.print("Tue.");
		break;
	case 2:
		System.out.print("Wed.");
		break;
	case 3:
		System.out.print("Thu.");
		break;
	case 4:
		System.out.print("Fri.");
		break;
	case 5:
		System.out.print("Sat.");
		break;
	default:
		System.out.print("Sun.");

	}
	return 0;

	}


}

