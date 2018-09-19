import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String ch1 = new String(new char[101]);
		String ch2 = new String(new char[101]);
		int i = 0;
		int j = 0;
		int k = 0;
		int len = 0;
		while (ch1 = new Scanner(System.in).nextLine())
		{
			len = ch1.length();
			int num = 0;
			for (i = 0;i < len;i++)
			{
				ch2 = tangible.StringFunctions.changeCharacter(ch2, i, ' ');
				if (ch1.charAt(i) == '(')
				{
					ch2 = tangible.StringFunctions.changeCharacter(ch2, i, '$');
					num++;
				}
				if (ch1.charAt(i) == ')')
				{
					ch2 = tangible.StringFunctions.changeCharacter(ch2, i, '?');
					num--;
					if (num == 0)
					{
						ch2 = tangible.StringFunctions.changeCharacter(ch2, i, ' ');
						for (j = 0;j < i;j++)
						{
							if (ch1.charAt(j) == '(')
							{
								for (k = j;k <= i;k++)
								{
									ch2 = tangible.StringFunctions.changeCharacter(ch2, k, ' ');
									break;
									break;
								}
							}
						}
					}
					if (num > 0)
					{
						ch2 = tangible.StringFunctions.changeCharacter(ch2, i, ' ');
						for (j = i;j >= 0;j--)
						{
							if (ch2.charAt(j) == '$')
							{
								ch2 = tangible.StringFunctions.changeCharacter(ch2, j, ' ');
								break;
							}
						}
					}
					if (num < 0)
					{
						num = 0;
					}

				}
			}
			ch2 = tangible.StringFunctions.changeCharacter(ch2, len, '\0');
			System.out.print(ch1);
			System.out.print("\n");
			System.out.print(ch2);
			System.out.print("\n");
		}
		return 0;
	}
}

