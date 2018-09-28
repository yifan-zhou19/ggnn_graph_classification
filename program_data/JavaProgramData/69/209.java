package <missing>;

public class GlobalMembers
{
	public static int max(int x,int y)
	{
		if (x >= y)
		{
			return x;
		}
		else
		{
			return y;
		}
	}
	public static int Main()
	{
		int i;
		int j;
		int k;
		int l;
		int tem;
		String a = new String(new char[300]);
		String b = new String(new char[300]);
		int[] c = new int[300];
			cin.get(a,290);
			System.in.read();
			cin.get(b,290);
		if (a.length() > b.length())
		{
			for (j = a.length() - 1;j >= a.length() - b.length();j--)
			{
				c[j] = a.charAt(j) - '0' + b.charAt(j - a.length() + b.length()) - '0';
				if (c[j] > 10)
				{
					c[j] = c[j] - 10;
					a = tangible.StringFunctions.changeCharacter(a, j - 1, a.charAt(j - 1) + 1);
				}
			}

			for (j >= max(a.length() - b.length() - 1, 0);j >= 0;j--)
			{
				c[j] = a.charAt(j) - '0';
			}
			for (j = a.length() - 1;j >= 1;j--)
			{
				if (c[j] >= 10)
				{
					c[j] = c[j] - 10;
					c[j - 1]++;
				}
			}
			for (j = 0;j < a.length();j++)
			{
				if (c[j] != 0)
				{
					tem = j;
					break;
				}
			}
			for (j = tem;j < a.length();j++)
			{
				System.out.print(c[j]);
			}
			System.out.print("\n");
		}
		if (a.length() == b.length())
		{
			for (j = 0;j < a.length();j++)
			{
				c[j] = a.charAt(j) + b.charAt(j) - '0'-'0';
			}
			for (j = a.length() - 1;j > 0;j--)
			{
				if (c[j] >= 10)
				{
					c[j] = c[j] - 10;
					c[j - 1]++;
				}
			}
			if (c[0] == 0 && a.length() == 1 && b.length() == 1)
			{
				System.out.print("0");
			}
			for (j = 0;j < a.length();j++)
			{
				if (c[j] != 0)
				{
					tem = j;
					break;
				}
			}
			for (j = tem;j < a.length();j++)
			{
				System.out.print(c[j]);
			}
		}
		if (b.length() > a.length())
		{
			for (j = b.length() - 1;j >= b.length() - a.length();j--)
			{
				c[j] = b.charAt(j) - '0' + a.charAt(j - b.length() + a.length()) - '0';
				if (c[j] > 10)
				{
					c[j] = c[j] - 10;
					b = tangible.StringFunctions.changeCharacter(b, j - 1, b.charAt(j - 1) + 1);
				}
			}

			for (j >= max(b.length() - a.length() - 1, 0);j >= 0;j--)
			{
				c[j] = b.charAt(j) - '0';
			}
			for (j = b.length() - 1;j >= 1;j--)
			{
				if (c[j] >= 10)
				{
					c[j] = c[j] - 10;
					c[j - 1]++;
				}
			}
			for (j = 0;j < b.length();j++)
			{
				if (c[j] != 0)
				{
					tem = j;
					break;
				}
			}
			for (j = tem;j < b.length();j++)
			{
				System.out.print(c[j]);
			}
			System.out.print("\n");
		}
	}

}

