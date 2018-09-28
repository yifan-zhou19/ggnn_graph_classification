import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static void duilie(String a)
	{
		int i;
		int j;
		for (i = 0; i < a.length(); i++)
		{
			if (a[i].equals('w'))
			{
				for (j = i - 1; j >= 0; j--)
				{
					if (!a[j].equals('0'))
					{
						System.out.print(j);
						System.out.print(" ");
						System.out.print(i);
						System.out.print("\n");
						a[j] = '0';
						a[i] = '0';
						break;
					}

				}

			}

		}

	}

	public static int Main()
	{
		String s = new String(new char[101]);
		int i;
		s = new Scanner(System.in).nextLine();
		for (i = 1; i < s.length(); i++)
		{
			if (s.charAt(i) == s.charAt(0))
			{
				s = tangible.StringFunctions.changeCharacter(s, i, 'm');
			}
		}
		s = tangible.StringFunctions.changeCharacter(s, 0, 'm');
		for (i = 0; i < s.length(); i++)
		{
			if (s.charAt(i) != 'm')
			{
				s = tangible.StringFunctions.changeCharacter(s, i, 'w');
			}
		}
		duilie(s);

		return 0;
	}

}

