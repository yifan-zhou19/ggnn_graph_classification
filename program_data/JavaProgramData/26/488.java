import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[101]);
		a = new Scanner(System.in).nextLine();
		for (int i = 0;i < a.length();i++)
		{
			if (a.charAt(i) == ' ' && a.charAt(i + 1) == ' ')
			{
				for (int j = i + 1;j < a.length();j++)
				{
					if (a.charAt(j) == ' ')
					{
						int k;
						for (k = j;k < a.length() - 1;k++)
						{
							a = tangible.StringFunctions.changeCharacter(a, k, a.charAt(k + 1));
						}
						a = tangible.StringFunctions.changeCharacter(a, k, '\0');
					}
					if (a.charAt(j) != ' ')
					{
						i--;
						break;
					}
				}
			}
		}
		System.out.print(a);
		System.out.print("\n");
		return 0;
	}

}

