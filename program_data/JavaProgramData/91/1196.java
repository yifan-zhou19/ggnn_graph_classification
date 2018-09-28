import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[101]);
		String b = new String(new char[101]);
		int n;
		int i;
		a = new Scanner(System.in).nextLine();
		for (i = 1;i < 101;i++)
		{
			if (a.charAt(i) == '\0')
			{
				n = i;
				b = tangible.StringFunctions.changeCharacter(b, i - 1, a.charAt(i - 1) + a.charAt(0));
				break;
			}
			else
			{
				b = tangible.StringFunctions.changeCharacter(b, i - 1, a.charAt(i - 1) + a.charAt(i));
			}
		}
		for (i = 0;i < n;i++)
		{
			System.out.print(b.charAt(i));
		}
		System.out.print("\n");
		return 0;
	}
}

