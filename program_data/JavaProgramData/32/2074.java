package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[100]);
		String b = new String(new char[100]);
		int i;
		int j;
		int m;
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		while (m != 0)
		{
		a = ConsoleInput.readToWhiteSpace(true).charAt(0);
		b = ConsoleInput.readToWhiteSpace(true).charAt(0);
		for (i = b.length() - 1,j = a.length() - 1;i >= 0;i--,j--)
		{
			if (a.charAt(j) - b.charAt(i) < 0)
			{
				a = tangible.StringFunctions.changeCharacter(a, j, 10 + a.charAt(j) - b.charAt(i) + 48);
				a.charAt(j - 1) -= 1;
			}
			else
			{
				a = tangible.StringFunctions.changeCharacter(a, j, a.charAt(j) - b.charAt(i) + 48);
			}
		}

		for (i = 0;i <= a.length() - 1;i++)
		{
			if (a.charAt(i) != '0')
			{
				for (j = i;j <= a.length() - 2;j++)
				{
					System.out.print(a.charAt(j));
				}
					System.out.print(a.charAt(a.length() - 1));
					System.out.print("\n");
				break;
			}
		}
		m--;
		}
		return 0;
	}
}

