import java.util.*;

package <missing>;

public class GlobalMembers
{
	/* ???
	 * ?????
	 */

	public static int Main()
	{
		String a = new String(new char[101]);
		a = new Scanner(System.in).nextLine();
		int l = a.length();
		int i;
		int k;
		for (i = 0;i < l;i++)
		{
		if (a.charAt(i) == ' ')
		{
			if (a.charAt(i + 1) == ' ')
			{
			for (int k = i;k < l - 1;k++)
			{
			   a = tangible.StringFunctions.changeCharacter(a, k, a.charAt(k + 1));
			}
				l--;
				i--;
				a = tangible.StringFunctions.changeCharacter(a, l, '\0');
			}
		}
		}
		System.out.print(a);
	  return 0;
	}


}

