package <missing>;

public class GlobalMembers
{
	public static String kid = new String(new char[100]);
	public static int f(int x)
	{
		if (kid.charAt(x) == 'g')
		{
			return x;
		}
		if (kid.charAt(x) == 'b')
		{
			int g = f(x + 1);
			System.out.print(x);
			System.out.print(" ");
			System.out.print(g);
			System.out.print("\n");
			return f(g + 1);
		}
	}
	public static int Main()
	{
		int i = 0;
		int sum;
		char c;
		char first;
		c = System.in.read();
		first = c;
		while (c != '\n')
		{
			if (c == first)
			{
				c = 'b';
			}
			else
			{
				c = 'g';
			}
			kid = tangible.StringFunctions.changeCharacter(kid, i, c);
			i += 1;
			c = System.in.read();
		} //??????????????????i??????
		f(0);
	return 0;
	}


}

