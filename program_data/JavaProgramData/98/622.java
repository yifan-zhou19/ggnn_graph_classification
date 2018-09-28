package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
	n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	int t = 0;
	String a = new String(new char[80]);
	int i;
	int j;
	a = ConsoleInput.readToWhiteSpace(true).charAt(0);
	t = a.length() + 1;
	System.out.print(a);
	for (i = 1;i < n;i++)
	{
		a = ConsoleInput.readToWhiteSpace(true).charAt(0);
	if (t + a.length() <= 80)
	{
		System.out.print(' ');
		System.out.print(a);
	t = t + a.length() + 1;
	}
	else
	{
		System.out.print("\n");
		System.out.print(a);
	t = a.length() + 1;
	}
	}


	return 0;

	}

}

