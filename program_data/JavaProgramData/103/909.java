package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[1100]);
		a = ConsoleInput.readToWhiteSpace(true).charAt(0);
		String c = new String(new char[1100]);
		int n;
		int p = 0;
		int[] b = new int[1100];
		n = a.length();
		for (int i = 0;i < n;i++)
		{
			b[i] = 1;
		}
		for (int i = 0;i < n;i++)
		{
			if (a.charAt(i) - 'a' >= 0)
			{
				a = tangible.StringFunctions.changeCharacter(a, i, a.charAt(i) - 32);
			}
		}
		for (int i = 1;i < n;i++)
		{
			if (a.charAt(i) == a.charAt(i - 1))
			{
				b[p]++;
				c = tangible.StringFunctions.changeCharacter(c, p, a.charAt(i));
			}
			else
			{
				p++;
				c = tangible.StringFunctions.changeCharacter(c, p, a.charAt(i));
			}
		}
		c = tangible.StringFunctions.changeCharacter(c, 0, a.charAt(0));
		for (int j = 0;j <= p;j++)
		{
			System.out.print("(");
			System.out.print(c.charAt(j));
			System.out.print(",");
			System.out.print(b[j]);
			System.out.print(")");
		}
		return 0;
	}
}

