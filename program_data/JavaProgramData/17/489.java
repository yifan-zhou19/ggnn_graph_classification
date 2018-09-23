import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		final String a = "";
		final String b = "";
		int i;
		int j;
		while (a = new Scanner(System.in).nextLine())
		{
			for (i = 0;i < 101; i++)
			{
				if (a.charAt(i) == '\0')
				{
					break;
				}
				if (a.charAt(i) == '(')
				{
					b = tangible.StringFunctions.changeCharacter(b, i, '$');
				}
				else if (a.charAt(i) == ')')
				{
					b = tangible.StringFunctions.changeCharacter(b, i, '?');
				}
				else
				{
					b = tangible.StringFunctions.changeCharacter(b, i, ' ');
				}
				if (a.charAt(i) == ')')
				{
					for (j = i; j >= 0; j--)
					{
						if (a.charAt(j) == '(' && b.charAt(j) == '$')
						{
							b = tangible.StringFunctions.changeCharacter(b, i, ' ');
							b = tangible.StringFunctions.changeCharacter(b, j, ' ');
							break;
						}
					}
				}
			}
			System.out.print(a);
			System.out.print("\n");
			System.out.print(b);
			System.out.print("\n");
			for (i = 0; i < 101; i++)
			{
				a = tangible.StringFunctions.changeCharacter(a, i, '\0');
				b = tangible.StringFunctions.changeCharacter(b, i, '\0');
			}
		}
		return 0;
	}
}

