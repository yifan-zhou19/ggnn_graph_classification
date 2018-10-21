package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int a;
		int b;
		int c;
		int p;
		int q;
		int r;
		int m;
	String n = new String(new char[3]);
	for (a = 0;a <= 2;a++)
	{

		for (b = 0;b <= 2;b++)
		{
			for (c = 0;c <= 2;c++)
			{
		if (a == b || b == c || c == a)
		{
			continue;
		}
	p = (b > a) + (c == a);
	q = (a > b) + (a > c);
	r = (c > b) + (b > a);
			if (p + a == q + b && p + a == r + c)

			{
				n = tangible.StringFunctions.changeCharacter(n, a, 'A');
			n = tangible.StringFunctions.changeCharacter(n, b, 'B');
			n = tangible.StringFunctions.changeCharacter(n, c, 'C');
			System.out.print(n.charAt(0));
			System.out.print(n.charAt(1));
			System.out.print(n.charAt(2));

			}
			}
		}
	}


	}
}

