package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int n;
	n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	char a = 'n';
	for (int i = 3;i <= 7;i += 2)
	{
	if (n % i == 0)
	{
	if (a == 'n')
	{
		System.out.print(i);
	}
	else
	{
		System.out.print(' ');
		System.out.print(i);
	}
	a = '\n';
	}
	}
	System.out.print(a);
	return 0;
	}
}

