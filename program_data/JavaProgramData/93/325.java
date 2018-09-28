package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n = 0; //n???? s??n??????
		int s = 0;
	n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	if (n % 3 == 0)
	{
		System.out.print("3");
		s++;
	}
	if (n % 5 == 0)
	{
		if (s != 0)
		{
			System.out.print(' ');
		}
		System.out.print("5");
		s++;
	}
	if (n % 7 == 0)
	{
		if (s != 0)
		{
			System.out.print(' ');
		}
		System.out.print("7");
		s++;
	}
	if (s == 0)
	{
		System.out.print("n");
	}
	return 0;
	}


}

