package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int a;
		int b;
	n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	a = 1;
	b = 0;
	while (a <= n)
	{
		if (a % 7 == 0 || (69 < a && a < 80) || a % 10 == 7)
		{
			a++;
		}
		else
		{
			b = b + a * a,a++; //????
		}
	}
	System.out.print(b);
	System.out.print("\n");

	return 0;
	}

}

