package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int a;
		int b;
		int num = 0;
		int i;
		String n = new String(new char[31]);
		String m = new String(new char[31]);
		a = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		n = ConsoleInput.readToWhiteSpace(true).charAt(0);
		b = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < n.length();i++)
		{
			if (n.charAt(i) < 58)
			{
				n.charAt(i) -= 48;
			}
			else
			{
				if (n.charAt(i) > 96)
				{
					n.charAt(i) -= 87;
				}
				else
				{
					n.charAt(i) -= 55;
				}
			}
			num = num * a + n.charAt(i);
		}
		for (i = 0;num != 0;i++)
		{
			if (num % b < 10)
			{
				m = tangible.StringFunctions.changeCharacter(m, i, num % b + 48);
			}
			else
			{
				m = tangible.StringFunctions.changeCharacter(m, i, num % b + 55);
			}
			num = num / b;
		}
		if (i != 0)
		{
			for (;i > 0;i--)
			{
				System.out.print(m.charAt(i - 1));
			}
		}
			else
			{
				System.out.print(0);
			}
		return 0;
	}
}

