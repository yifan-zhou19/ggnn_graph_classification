import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int n;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		String l = new String(new char[1]);

		while (n > 0)
		{
			l = new Scanner(System.in).nextLine();
			String a = new String(new char[100]);
			String b = new String(new char[100]);
			String c = new String(new char[100]);
			a = new Scanner(System.in).nextLine();
			b = new Scanner(System.in).nextLine();
			int len1 = a.length();
			int len2 = b.length();
			for (i = len1 - 1;i >= len1 - len2;i--)
			{
				b = tangible.StringFunctions.changeCharacter(b, i, b.charAt(i + len2 - len1));
			}
			for (i = 0;i < len1 - len2;i++)
			{
				b = tangible.StringFunctions.changeCharacter(b, i, 48);
			}
			b = tangible.StringFunctions.changeCharacter(b, len1, '\0');

			for (i = len1 - 1;i >= 0;i--)
			{
				c = tangible.StringFunctions.changeCharacter(c, i, a.charAt(i) - b.charAt(i) + 48);
				if (c.charAt(i) < 48)
				{
					c = tangible.StringFunctions.changeCharacter(c, i, a.charAt(i) - b.charAt(i) + 58);
					a = tangible.StringFunctions.changeCharacter(a, i - 1, a.charAt(i - 1) - 1);
				}
			}
			i = 0;
			c = tangible.StringFunctions.changeCharacter(c, len1, '\0');
			while (c.charAt(i) == 0 && c.length() > 1)
			{
				for (j = 0;j < len1;j++)
				{
					c = tangible.StringFunctions.changeCharacter(c, j, c.charAt(j + 1));

				}
			}
			System.out.print(c);
			System.out.print("\n");
			n--;
		}
		return 0;
	}

}

