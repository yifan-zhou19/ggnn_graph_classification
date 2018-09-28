package <missing>;

public class GlobalMembers
{
	public static int f(int a,int n)
	{
		if (n == 0)
		{
			return 1;
		}
		else if (n == 1)
		{
			return a;
		}
		else
		{
			return (a * f(a, n - 1));
		}
	}
		public static String n = new String(new char[100]);
		public static String m = new String(new char[100]);
	public static int Main()
	{
		int a;
		int b;
		int num = 0;
		a = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		n = ConsoleInput.readToWhiteSpace(true).charAt(0);
		b = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int i = 0;i < (int)n.length();i++)
		{
			if (Character.isLowerCase(n.charAt(i)))
			{
				num += ((int)n.charAt(i) - 87) * f(a, (int)n.length() - i - 1);
			}
			else if (Character.isUpperCase(n.charAt(i)))
			{
				num += ((int)n.charAt(i) - 55) * f(a, (int)n.length() - i - 1);
			}
			else if (Character.isDigit(n.charAt(i)))
			{
				num += ((int)n.charAt(i) - 48) * f(a, (int)n.length() - i - 1);
			}
		}
		if (num == 0)
		{
			System.out.println("0");
			return 0;
		}
		int i = 0;
		while (num > 0)
		{
			if (num % b > 9)
			{
				m = tangible.StringFunctions.changeCharacter(m, i, (char)(num % b + 55));
				num = num / b;
			}
			else if (num % b == 0)
			{
				m = tangible.StringFunctions.changeCharacter(m, i, '0');
				num = num / b;
			}
			else
			{
				m = tangible.StringFunctions.changeCharacter(m, i, (char)(num % b + 48));
				num = num / b;
			}
			i++;
		}
		for (int j = 1; j <= i; j++)
		{
			System.out.print(m.charAt(i - j));
		}
		return 0;
	}

}

