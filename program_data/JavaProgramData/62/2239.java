import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[5000]);
		a = new Scanner(System.in).nextLine();
		int b = a.length();
		int c = b;
		for (int i = 0;i < b;i++)
		{
			if ((a.charAt(i) == ' ') && (a.charAt(i + 1) == ' ')) //???????????
			{
				for (int j = i + 1;j < b;j++) //????
				{
					a = tangible.StringFunctions.changeCharacter(a, j, a.charAt(j + 1));
				}
				i--;
				c--;
			}
		}
		for (int i = 0;i < c;i++)
		{
			System.out.print(a.charAt(i));
		}
		return 0;
	}
}

