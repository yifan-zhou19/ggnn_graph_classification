package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		double q = 0;
		int n = 0;
		q = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
		System.in.read();
		String a = new String(new char[201]);
		String b = new String(new char[201]);
		int[] c = new int[201];
		double i = 0;
		int j = 0;
		int e = 0;
		int f = 0;
		int number = 0;
		int l = 0;
		a = ConsoleInput.readToWhiteSpace(true).charAt(0);
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		e = a.length();
		for (i = 0;i <= e-1;i++)
		{
			l = 0;
			if (a.charAt((int)i) >= '0' && a.charAt((int)i) <= '9')
			{
				l = a.charAt((int)i) - '0';
			}
			else if (a.charAt((int)i) >= 'A' && a.charAt((int)i) <= 'Z')
			{
				l = a.charAt((int)i) - 'A' + 10;
			}
			else if (a.charAt((int)i) >= 'a' && a.charAt((int)i) <= 'z')
			{
				l = a.charAt((int)i) - 'a' + 10;
			}
			number = l * Math.pow(q,e-1 - i) + number;
		}
		for (i = 0;i <= 200;i++)
		{
			c[(int)i] = number % n;
			if (c[(int)i] >= 0 && c[(int)i] <= 9)
			{
				b = tangible.StringFunctions.changeCharacter(b, (int)i, c[(int)i] + '0');
			}
			else
			{
				b = tangible.StringFunctions.changeCharacter(b, (int)i, c[(int)i] + 'A' - 10);
			}
			number = number / n;
			if (number == 0)
			{
				break;
			}
		}
		f = i;
		for (i = f;i >= 0;i--)
		{
			System.out.print(b.charAt((int)i));
		}
			System.out.print("\n");
		return 0;
	}
}

