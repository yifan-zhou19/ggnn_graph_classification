import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[200]);
		while (a = new Scanner(System.in).nextLine())
		{
			int n = a.length();
			int k;
			System.out.print(a);
			System.out.print("\n");
			for (int i = 0; i < n; i++)
			{
				if (a.charAt(i) == '?')
				{
					a = tangible.StringFunctions.changeCharacter(a, i, ' ');
				}
				if (a.charAt(i) == '$')
				{
					a = tangible.StringFunctions.changeCharacter(a, i, ' ');
				}
				if (a.charAt(i) == ')')
				{
					for (k = i - 1; k >= 0;k--)
					{
						if (a.charAt(k) == '(')
						{
							a = tangible.StringFunctions.changeCharacter(a, i, ' ');
							a = tangible.StringFunctions.changeCharacter(a, k, ' ');
							break;
						}
					}
					if (k < 0)
					{
						a = tangible.StringFunctions.changeCharacter(a, i, '?');
					}
				}
			}
			for (int i = 0; i < n; i++)
			{
				if (a.charAt(i) == '(')
				{
					a = tangible.StringFunctions.changeCharacter(a, i, '$');
				}
				else
				{
					if (a.charAt(i) != '?')
					{
						a = tangible.StringFunctions.changeCharacter(a, i, ' ');
					}
				}

			}
			System.out.print(a);
			System.out.print("\n");

		}
		return 0;
	}

}

