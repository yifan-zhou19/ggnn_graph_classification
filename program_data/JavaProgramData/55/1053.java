package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		double a;
		double b;
		int s = 0;
		int i;
		int l;
		int j;
		int[] c = new int[100];
		String n = new String(new char[100]);
		a = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
		n = ConsoleInput.readToWhiteSpace(true).charAt(0);
		b = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
		l = n.length();
		for (i = l - 1; i >= 0; i--)
		{
			if (n.charAt(i) >= 48 && n.charAt(i) <= 57)
			{
				s = s + (n.charAt(i) - '0') * Math.pow(a,(double)(l - i - 1));
			}
			if (n.charAt(i) >= 65 && n.charAt(i) <= 90)
			{
				s = s + (n.charAt(i) - 55) * Math.pow(a,(double)(l - i - 1));
			}
			if (n.charAt(i) >= 97 && n.charAt(i) <= 122)
			{
				s = s + (n.charAt(i) - 87) * Math.pow(a,(double)(l - i - 1));
			}
		}
		if (s == 0)
		{
			System.out.print(0);
			System.out.print("\n");
			return 0;
		}
		if (b <= 10)
		{
			for (i = 0; ;i++)
			{
				c[i] = s % (int)b;
				s = s / (int)b;
				if (s < b)
				{
					c[i + 1] = s;
					break;
				}
			}
			for (j = i + 1; j >= 0; j--)
			{
				System.out.print(c[j]);
			}
		}
		else
		{
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
			memset(n, 0, (Character.SIZE / Byte.SIZE));
			for (i = 0; ;i++)
			{
				if ((s % (int)b) > 9)
				{
					n = tangible.StringFunctions.changeCharacter(n, i, (char)(s % (int)b + 55));
				}
				else
				{
					n = tangible.StringFunctions.changeCharacter(n, i, (char)(s % (int)b + '0'));
				}
				s = s / (int)b;
				if (s < b)
				{
					if (s > 9)
					{
						n = tangible.StringFunctions.changeCharacter(n, ++i, (char)(s + 55));
					}
					else
					{
						n = tangible.StringFunctions.changeCharacter(n, ++i, (char)(s + '0'));
					}
					break;
				}

			}
			for (j = i; j >= 0; j--)
			{
				System.out.print(n.charAt(j));
			}
		}
		System.out.print("\n");
		return 0;
	}
}

