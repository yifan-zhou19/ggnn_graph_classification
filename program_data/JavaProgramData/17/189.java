import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[101]);
		int i;
		int j;
		int k;
		int len;
		int p;
		while (a = new Scanner(System.in).nextLine())
		{
			System.out.print(a);
			System.out.print("\n");
			len = a.length();
			for (i = len;i >= 0;i--)
			{

				 if (a.charAt(i) == '(')
				 {
					for (j = i + 1;a.charAt(j) != '\0';j++)
					{
						if (a.charAt(j) == ')')
						{
							a = tangible.StringFunctions.changeCharacter(a, i, '1');
							a = tangible.StringFunctions.changeCharacter(a, j, '1');
							break;
						}
					}
					if (a.charAt(i) == '1')
					{
						continue;
					}
					else
					{
						a = tangible.StringFunctions.changeCharacter(a, i, '$');
					}
				 }

			}
			for (p = 0;a.charAt(p) != '\0';p++)
			{
				if (a.charAt(p) == ')')
				{
					for (j = p - 1;j >= 0;j--)
					{
						if (a.charAt(j) == '(')
						{
							a = tangible.StringFunctions.changeCharacter(a, p, '1');
							a = tangible.StringFunctions.changeCharacter(a, j, '1');
							break;
						}
					}
					if (a.charAt(p) == '1')
					{
						continue;
					}
					else
					{
						a = tangible.StringFunctions.changeCharacter(a, p, '?');
					}
				}
			}
			for (k = 0;a.charAt(k) != '\0';k++)
			{
				if ((a.charAt(k) != '$') && (a.charAt(k) != '?'))
				{
					a = tangible.StringFunctions.changeCharacter(a, k, ' ');
				}
			}
			System.out.print(a);
			System.out.print("\n");

		}
		return 0;
	}





}

