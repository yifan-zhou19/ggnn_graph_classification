package <missing>;

public class GlobalMembers
{
	public static int times(int a,int n)
	{
		int sum = 1;
		for (int i = 1;i <= n;i++)
		{
			sum *= a;
		}
		return sum;
	}
	public static int input(String n, int a)
	{
		int la;
		int out = 0;
		la = n.length();
		for (int i = la - 1;i >= 0;i--)
		{
			if (n[i].compareTo(57) <= 0)
			{
				int p;
				p = (int)n[i] - 48;
				out += ((int)p) * times(a, (la - i - 1));
			}
			else
			{
				if (n[i].compareTo(90) <= 0)
				{
					int p;
					p = (int)n[i] - 55;
					out += ((int)p) * times(a, (la - i - 1));
				}
				else
				{
					int p;
					p = (int)n[i] - 87;
					out += ((int)p) * times(a, (la - i - 1));
				}
			}
		}
		return out;
	}
	public static int Main()
	{
		int a;
		int b;
		String n = new String(new char[1000]);
		a = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		n = ConsoleInput.readToWhiteSpace(true).charAt(0);
		b = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int out;
		out = input(n, a);
		String on = new String(new char[1000]);
		int la;
		la = n.length();
		int l;
		for (l = 1; out / (int)b >= times(b, l - 1);l++)
		{
		}
		for (int i = 0;i < l;i++)
		{
			int p;
			for (p = 0;out - times(b, (l - 1 - i)) >= 0;p++)
			{
				out -= times(b, (l - 1 - i));
			}
			if (p <= 9)
			{
				on = tangible.StringFunctions.changeCharacter(on, i, (char)(p + 48));
			}
			else
			{
				on = tangible.StringFunctions.changeCharacter(on, i, (char)(p + 55));
			}
		}
		on = tangible.StringFunctions.changeCharacter(on, l, '\0');
		System.out.print(on);

	}

}

