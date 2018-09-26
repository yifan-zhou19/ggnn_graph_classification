import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		char[] str = {0, '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0'};
		String str1 = new String(new char[101]);
		int i;
		int j;
		int q;
		str = new Scanner(System.in).nextLine();
			for (i = 0,j = 0; str[i] != '\0';)
			{
				if (str[i] == ' ')
				{
					if (str[i + 1] == ' ')
					{
						i++;
					}
					else if (str[i + 1] != '\0')
					{
						str1 = tangible.StringFunctions.changeCharacter(str1, j, ' ');
						i++;
						j++;
					}
					else if (str[i + 1] == '\0')
					{
						i++;
					}
				}
				else
				{
					str1 = tangible.StringFunctions.changeCharacter(str1, j, str[i]);
					i++;
					j++;
				}
			}
			for (q = 0;q < j;q++)
			{
				System.out.print(str1.charAt(q));
			}
			System.out.print("\n");
		  return 0;
	}

}

