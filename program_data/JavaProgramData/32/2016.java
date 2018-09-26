package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[100]);
		String b = new String(new char[100]);
		int n;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int i = 0;i < n;i++)
		{
			a = ConsoleInput.readToWhiteSpace(true).charAt(0);
			b = ConsoleInput.readToWhiteSpace(true).charAt(0);
			int mark = 0;
			if (a.length() < b.length())
			{
				String d = new String(new char[1000]);
				d = a;
				a = b;
				b = d;
				mark = 1;
			}
			else if (a.length() == b.length())
			{
				int s = 0;
				for (int i = 0;i < a.length();i++)
				{
					if (a.charAt(i) - b.charAt(i) > 0)
					{
						s = 1;
						break;
					}
					else if (a.charAt(i) - b.charAt(i) < 0)
					{
						s = -1;
						break;
					}
				}
				if (s == -1)
				{
					String d = new String(new char[1000]);
					d = a;
					a = b;
					b = d;
					mark = 1;
				}
			}
			if (mark != 0)
			{
				System.out.print("-");
			}
			int i = 0;
			int j = 0;
			int k = 0;
			int lend = 0;
			int[] c = new int[1000];
			for (i = a.length() - 1, j = b.length() - 1, k = 0;i >= 0 && j >= 0;i--, j--, k++)
			{
				if (lend != 0)
				{
					if (a.charAt(i) == 48)
					{
						lend = 1;
						a = tangible.StringFunctions.changeCharacter(a, i, a.charAt(i) + 9);
					}
					else
					{
						a.charAt(i)--;
						lend = 0;
					}
				}
				if (a.charAt(i) >= b.charAt(j))
				{
					c[k] = a.charAt(i) - b.charAt(j);
				}
				else
				{
					c[k] = a.charAt(i) - b.charAt(j) + 10;
					lend = 1;
				}
			}

			while (i >= 0)
			{
				if (lend != 0)
				{
					if (a.charAt(i) == 48)
					{
						lend = 1;
						a = tangible.StringFunctions.changeCharacter(a, i, a.charAt(i) + 9);
					}
					else
					{
						a.charAt(i)--;
						lend = 0;
					}
				}
				c[k] = a.charAt(i) - 48;
				k++;
				i--;
			}
			while (j >= 0)
			{
				if (lend != 0)
				{
					if (a.charAt(i) == 48)
					{
						lend = 1;
						a = tangible.StringFunctions.changeCharacter(a, i, a.charAt(i) + 9);
					}
					else
					{
						a.charAt(i)--;
						lend = 0;
					}
				}
				c[k] = b.charAt(j) - 48;
				k++;
				j--;
			}

			for (i = k - 1;i >= 0;i--)
			{
			if (c[i] != 0)
			{
				break;
			}
			}
			if (i == -1)
			{
				System.out.print(c[0]);
			}
			else
			{
				for (j = i;j >= 0;j--)
				{
			System.out.print(c[j]);
				}
			}
			System.out.print("\n");
		}
		return 0;
	}
}

