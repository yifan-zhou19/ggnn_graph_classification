import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String str = new String(new char[30]);
		String newstr = new String(new char[30]);
		char max;
		int l = 0;
		int p = 0;
		int i;
		while (str = new Scanner(System.in).nextLine())
		{
			max = str.charAt(0);
			l = str.length();
			for (int i = 0;i <= l - 5;i++)
			{
				if (max < str.charAt(i))
				{
					max = str.charAt(i);
					p = i;
				}
			}
			for (i = 0;i <= p;i++)
			{
				newstr = tangible.StringFunctions.changeCharacter(newstr, i, str.charAt(i));
			}
			for (i = 1;i <= 3;i++)
			{
				newstr = tangible.StringFunctions.changeCharacter(newstr, p + i, str.charAt(l - 4 + i));
			}
			for (i = p + 4;i <= l - 2;i++)
			{
				newstr = tangible.StringFunctions.changeCharacter(newstr, i, str.charAt(i - 3));
			}
			for (i = 0;i <= l - 2;i++)
			{
				System.out.print(newstr.charAt(i));
			}
			System.out.print("\n");



		}
			return 0;
	}









}

