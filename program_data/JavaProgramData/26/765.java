import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
			 String a = new String(new char[1000]);
		int i;
		int j;
		a = new Scanner(System.in).nextLine();
		for (i = 0;i < a.length();i++)
		{
			if (a.charAt(i) != ' ')
			{
				continue;
			}
			else
			{
				for (j = i + 1;j < a.length();j++)
				{
					if (a.charAt(j) == ' ')
					{
						a = tangible.StringFunctions.changeCharacter(a, j, '0');
					}
					else
					{
						break;
					}
				}
			}
		}
		for (i = 0;i < a.length();i++)
		{
			if (a.charAt(i) != '0')
			{
				System.out.print(a.charAt(i));
			}
		}
		return 0;
	}


}

