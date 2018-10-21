import java.util.*;

package <missing>;

public class GlobalMembers
{
	//  ???????


	public static int Main()
	{
		String str = new String(new char[50]);
		str = new Scanner(System.in).nextLine();
		for (int i = 1;i < 50;i++)
		{
			if (str.charAt(i) == ' ')
			{
				while (str.charAt(i + 1) == ' ')
				{
					for (int j = i + 1;j < 50;j++)
					{
						str = tangible.StringFunctions.changeCharacter(str, j, str.charAt(j + 1));
					}
				}
			}
		}
		System.out.print(str);
		return 0;
	}
}

