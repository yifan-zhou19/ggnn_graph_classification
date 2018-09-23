import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		String a = new String(new char[101]);
		String b = new String(new char[101]);
		while (a = new Scanner(System.in).nextLine())
		{
			for (i = 0; i <= 100; i++)
			{
				b = tangible.StringFunctions.changeCharacter(b, i, ' ');
			}
			for (i = 0; a.charAt(i) != '\0'; i++)
			{
				if (a.charAt(i) == '(')
				{
					b = tangible.StringFunctions.changeCharacter(b, i, '$');
				}
				if (a.charAt(i) == ')')
				{
					for (j = i; j >= 0; j--)
					{
						if (b.charAt(j) == '$')
						{
							b = tangible.StringFunctions.changeCharacter(b, j, ' ');
							break;
						}
					}
					if (j == -1)
					{
						b = tangible.StringFunctions.changeCharacter(b, i, '?');
					}
				}
			}
			for (i = 0; a.charAt(i) != '\0'; i++)
			{
					System.out.print(a.charAt(i));
			}
			System.out.print("\n");
			for (i = 0; a.charAt(i) != '\0'; i++)
			{
					System.out.print(b.charAt(i));
			}
			System.out.print("\n");
		}
		return 0;
	}

}

