package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[1000]);
		a = ConsoleInput.readToWhiteSpace(true).charAt(0);
		int length;
		int i;
		length = a.length();
		String b = new String(new char[1000]);
		int[] c = new int[1000];
		int x;
		x = 0;
		for (i = 0;i < length;i++)
		{
			if (a.charAt(i) >= 'a' && a.charAt(i) <= 'z')
			{
				a = tangible.StringFunctions.changeCharacter(a, i, a.charAt(i) - 32);
			}
		}
		b = tangible.StringFunctions.changeCharacter(b, 0, a.charAt(0));
		c[0] = 1;
		for (i = 1;i < length;i++)
		{
			if (a.charAt(i) == a.charAt(i - 1))
			{
				b = tangible.StringFunctions.changeCharacter(b, x, a.charAt(i));
				c[x]++;
			}
			else
			{
				x++;
				b = tangible.StringFunctions.changeCharacter(b, x, a.charAt(i));
				c[x] = 1;
			}
		}
		for (i = 0;i <= x;i++)
		{
			System.out.print('(');
			System.out.print(b.charAt(i));
			System.out.print(',');
			System.out.print(c[i]);
			System.out.print(')');
		}
		System.out.print("\n");
		return 0;
	}

}

