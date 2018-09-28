package <missing>;

public class GlobalMembers
{
	public static int i;
	public static int j;
	public static int len1;
	public static int len2;
	public static void f(String a, String b)
	{ //???????
		int[] c = new int[255]; //???????
		if (len1 > len2)
		{ //???????
			for (i = 0;i <= len2 - 1;i++)
			{
				c[i] = a[len1 - 1 - i] + b[len2 - 1 - i] - '0' - '0'; //?????
				if (c[i] >= 10)
				{ //??????
					c[i] -= 10;
					a[len1 - i - 2] += 1;
				} //??
			}
			for (i = len2;i <= len1 - 2;i++)
			{
				c[i] = a[len1 - i - 1] - '0';
			if (c[i] >= 10)
			{ //??? ????
				c[i] -= 10;
				a[len1 - i - 2] += 1;
			}
			}
			c[len1 - 1] = a[0] - '0'; //?????
			if (c[len1 - 1] >= 10)
			{
				c[len1 - 1] -= 10;
				c[len1] = 1;
				j = len1;
			} //????
			else
			{
				j = len1 - 1;
			}
			int x = 0; //???????
			int y = 0;
			for (i = j;i >= 0;i--)
			{ //????
				if (c[i] == 0 && x == 0)
				{
					continue; //????0
				}
				else
				{
				System.out.print(c[i]);
				x = 1;
				y = 1;
				}
			}
			if (y == 0)
			{
				System.out.print("0");
				System.out.print("\n");
			}
		}
		else
		{ //???????
			for (i = 0;i <= len1 - 2;i++)
			{
				c[i] = a[len1 - 1 - i] + b[len2 - 1 - i] - '0'-'0';
				if (c[i] >= 10)
				{
								c[i] -= 10;
								a[len1 - i - 2] += 1;
				}
			}
			c[len1 - 1] = a[0] + b[0] - '0'-'0';
			if (c[len1 - 1] > 10)
			{
				c[len1] = 1;
				c[len1 - 1] -= 10;
				j = len1;
			}
			else
			{
				j = len1 - 1;
			}
			int x = 0;
			int y = 0;
			for (i = j;i >= 0;i--)
			{
				if (c[i] == 0 && x == 0)
				{
					continue;
				}
				else
				{
				System.out.print(c[i]);
				x = 1;
				y = 1;
				}
			}
			if (y == 0)
			{
				System.out.print("0");
				System.out.print("\n");
			}
		}
	}
	public static int Main()
	{ //?????
		String a = new String(new char[255]);
		String b = new String(new char[255]);
		a = ConsoleInput.readToWhiteSpace(true).charAt(0);
		b = ConsoleInput.readToWhiteSpace(true).charAt(0);
		len1 = a.length();
		len2 = b.length();
		if (len1 >= len2) //????????????
		{
		f(a, b);
		}
		else
		{ //???????
			int y;
			y = len1;
			len1 = len2;
			len2 = y;
			f(b, a);
		}
		return 0;
	}

}

