import java.util.*;

package <missing>;

public class GlobalMembers
{
	/***************
	*??????
	*?????
	****************/
	public static int Main()
	{
		String a = new String(new char[101]);
		String b = new String(new char[101]);
		int l;
		a = new Scanner(System.in).nextLine();
		l = a.length();
		for (int i = 0; i < l; i++)
		{
			if (i < l - 1)
			{
				b = tangible.StringFunctions.changeCharacter(b, i, (char)(a.charAt(i) + a.charAt(i + 1)));
			}
			else
			{
				b = tangible.StringFunctions.changeCharacter(b, i, (char)(a.charAt(i) + a.charAt(0)));
			}
		}
		for (int j = 0; j < l; j++)
		{
			System.out.print(b.charAt(j));
		}
	return 0;
	}
}

