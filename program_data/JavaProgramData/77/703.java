package <missing>;

public class GlobalMembers
{
	public static String kid = new String(new char[100]);
	public static void seek_boy(int n)
	{
		int i;
		for (i = (n - 1);i >= 0;)
		{
			if (kid.charAt(i) == 'b')
			{
				System.out.print(i);
				System.out.print(" ");
				System.out.print(n);
				System.out.print("\n");
				kid = tangible.StringFunctions.changeCharacter(kid, n, '0');
				kid = tangible.StringFunctions.changeCharacter(kid, i, '0');
				i = -1;
			}
			else
			{
				i -= 1;
			}
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
		sum = i;
		for (i = 0;i < sum;i++)
		{
			if (kid.charAt(i) == 'g')
			{
				seek_boy(i);
			}
		}
		return 0;
	}
}

