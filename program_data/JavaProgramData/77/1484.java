package <missing>;

public class GlobalMembers
{
	public static void function(String p, int num, int num1, char a, char b)
	{
		if (num1 == num / 2 - 1)
		{
			System.out.print(0);
			System.out.print(' ');
			System.out.print(num - 1);
			System.out.print("\n");
		}
		else
		{
			for (int i = 0 ; i < num ; i++)
			{
				if (*(p[0].Substring(i)) == b)
				{
					for (int j = i - 1 ; j >= 0 ; j--)
					{
						if (*(p[0].Substring(j)) == a)
						{
							System.out.print(j);
							System.out.print(' ');
							System.out.print(i);
							System.out.print("\n");
							*(p[0].Substring(i)) = ' ';
							*(p[0].Substring(j)) = ' ';
							break;
						}
					}
					break;
				}
			}
			function(p, num, num1 + 1, a, b);
		}
	}
	public static int Main()
	{
		char[][] c = new char[2][101];
		String p = new String(new char[101]);
		char a;
		char b;
		int num;
		c[0] = ConsoleInput.readToWhiteSpace(true).charAt(0);
		a = c[0][0];
		b = c[0][String.valueOf(c[0]).length() - 1];
		for (int i = 0 ; i < String.valueOf(c[0]).length() ; i++)
		{
			c[1][i] = i;
		}
		p = c;
		num = String.valueOf(c[0]).length();
		function(p, num, 0, a, b);

	}
}

