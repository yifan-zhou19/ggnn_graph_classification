package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[1000]);
		String c = new String(new char[1000]);
		int[] b = new int[1000];
		a = ConsoleInput.readToWhiteSpace(true).charAt(0);
		int len;
		int i;
		int j;
		for (i = 0;i < 1000;i++)
		{
			b[i] = 1;
		}
		len = a.length();
		for (i = 0;i < len;i++)
		{
			if (a.charAt(i) >= 'a' && a.charAt(i) <= 'z')
			{
				a = tangible.StringFunctions.changeCharacter(a, i, a.charAt(i) - 32);
			}
		}
		a = tangible.StringFunctions.changeCharacter(a, len, 1);
		len = len + 1;
			for (i = 0,j = 0;i < len;i++)
			{
				if (a.charAt(i) == a.charAt(i + 1))
				{
					c = tangible.StringFunctions.changeCharacter(c, j, a.charAt(i));
					b[j]++;
				}
				else
				{
				c = tangible.StringFunctions.changeCharacter(c, j, a.charAt(i));
				j++;
				}
			}
		for (i = 0;i < j - 1;i++)
		{
			System.out.print("(");
			System.out.print(c.charAt(i));
			System.out.print(",");
			System.out.print(b[i]);
			System.out.print(")");
		}
		System.out.print("\n");
		return 0;
	}
}

