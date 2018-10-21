package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[105]);
		String b = new String(new char[105]);
		int n;
		int i;
		int j;
		int k;
		int chang1;
		int chang2;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		while (n-- != 0)
		{
			a = ConsoleInput.readToWhiteSpace(true).charAt(0);
			b = ConsoleInput.readToWhiteSpace(true).charAt(0);
			chang1 = a.length();
			chang2 = b.length();
			i = chang1 - 1;
			j = chang2 - 1;
			while (j >= 0)
			{
				if (a.charAt(i) < b.charAt(j))
				{
					if (a.charAt(i - 1) == 0)
					{
						a.charAt(i - 2)--;
						a = tangible.StringFunctions.changeCharacter(a, i - 1, '9');
						a = tangible.StringFunctions.changeCharacter(a, i, a.charAt(i) + 10);
					}
					else
					{
						a.charAt(i - 1)--;
						a = tangible.StringFunctions.changeCharacter(a, i, a.charAt(i) + 10);
					}
				}
				a = tangible.StringFunctions.changeCharacter(a, i, a.charAt(i) - b.charAt(j) + '0');
				i--;
				j--;
			}
			k = 0;
			if (a.charAt(0) == '0')
			{
				for (k = 0;k < chang1;k++)
				{
					if (a.charAt(k) != '0')
					{
						break;
					}
				}
			}
			if (k == chang1 - 1)
			{
				System.out.print(a.charAt(k));
			}
			else
			{
				for (i = k;i < chang1;i++)
				{
					System.out.print(a.charAt(i));
				}
			}

			System.out.print("\n");
		}
		return 0;
	}

}

