import java.util.*;

package <missing>;

public class GlobalMembers
{
	//2013.12.8
	//zwb

	public static int Main()
	{
		final String a = "";
		final String b = "";
		a = new Scanner(System.in).nextLine();
		for (int i = 0; i < a.length(); i++)
		{
			if (i != a.length() - 1)
			{
				b = tangible.StringFunctions.changeCharacter(b, i, a.charAt(i) + a.charAt(i + 1));
			}
			else
			{
				b = tangible.StringFunctions.changeCharacter(b, i, a.charAt(i) + a.charAt(0));
			}
		}
		System.out.print(b);
		System.out.print("\n");
		return 0;
	}

}

