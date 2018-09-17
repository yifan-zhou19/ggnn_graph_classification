package <missing>;

public class GlobalMembers
{
	public static char namef(int a,int b,int c,int n)
	{
		int i;
		String name = new String(new char[3]);
		for (i = 0;i < 3;i++)
		{
			if (a == i)
			{
				name = tangible.StringFunctions.changeCharacter(name, i, 'A');
			}
			if (b == i)
			{
				name = tangible.StringFunctions.changeCharacter(name, i, 'B');
			}
			if (c == i)
			{
				name = tangible.StringFunctions.changeCharacter(name, i, 'C');
			}
		}
		return name.charAt(n);
	}
	public static char numf(int a,int b,int c,int n)
	{
		int i;
		String num = new String(new char[3]);
		for (i = 0;i < 3;i++)
		{
			if (a == i)
			{
				num = tangible.StringFunctions.changeCharacter(num, i, 'a');
			}
			if (b == i)
			{
				num = tangible.StringFunctions.changeCharacter(num, i, 'b');
			}
			if (c == i)
			{
				num = tangible.StringFunctions.changeCharacter(num, i, 'c');
			}
		}
		return num.charAt(n);

	}

	public static int Main()
	{
		int a;
		int b;
		int c;
		int A;
		int B;
		int C;
		int i;
		int j;
		String name = new String(new char[3]);
		String num = new String(new char[3]);
		for (a = 0;a < 3;a++)
		{
			for (b = 0;b < 3;b++)
			{
				if (a == b)
				{
					continue;
				}
				for (c = 0;c < 3;c++)
				{
					if ((c == b) || (c == a))
					{
						continue;
					}
					A = (b > a) + (c == a);
					B = (a > b) + (a > c);
					C = (c > b) + (b > a);
					for (j = 0;j < 3;j++)
					{
						num = tangible.StringFunctions.changeCharacter(num, j, numf(a, b, c, j));
						name = tangible.StringFunctions.changeCharacter(name, j, namef(A, B, C, j));
					}
					if ((num.charAt(0) == name.charAt(2) + 32) && ((num.charAt(2) == name.charAt(0) + 32) && (num.charAt(1) == name.charAt(1) + 32)))
					{
						for (i = 2;i >= 0;i--)
						{
							System.out.printf("%c",name.charAt(i));
						}
					}
				}
			}
		}
		return 0;
	}

}

