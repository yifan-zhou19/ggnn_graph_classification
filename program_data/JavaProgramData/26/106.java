import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String str = new String(new char[101]);
		int i;
		int j;
		int num;
		int a;
		str = new Scanner(System.in).nextLine();
		num = str.length();
		for (i = 0; i < num; i++)
		{
			a = 0;
			if (str.charAt(i) == '\0')
			{
				break;
			}
			if (str.charAt(i) == ' ')
			{
				for (j = i; j < num; j++)
				{
					if (str.charAt(j) != ' ')
					{
						break;
					}
					a++;
				}
				for (j = i + 1; j < num; j++)
				{
					str = tangible.StringFunctions.changeCharacter(str, j, str.charAt(j + a - 1));
				}
			}
		}
		System.out.print(str);
		System.out.print("\n");
		return 0;
	}
}

