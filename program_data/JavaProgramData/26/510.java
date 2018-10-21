import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String c = new String(new char[101]);
		c = new Scanner(System.in).nextLine();
		int i;
		int j;
		int L;
		int k;
		L = (int)c.length();
		for (i = 0 ; ; i++)
		{
			if (c.charAt(i) == '\0')
			{
				break;
			}
			if (c.charAt(i) == ' ')
			{
				for (j = i ; ; j++)
				{
					if (c.charAt(j) != ' ')
					{
						for (k = j ; ; k++)
						{
							if (c.charAt(k) == '\0')
							{
								c = tangible.StringFunctions.changeCharacter(c, k - j + 1 + i, c.charAt(k));
								break;
							}
							c = tangible.StringFunctions.changeCharacter(c, k - j + i + 1, c.charAt(k));
						}
						break;
					}
				}
			}
		}
		System.out.print(c);
	}

}

