import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[101]);
		String b = new String(new char[101]);
		int i;
		a = new Scanner(System.in).nextLine();
		int la;
		int t = 1;
		int k = 0;
		la = a.length();
		for (i = 0;i < la;i++)
		{
			if (a.charAt(i) != ' ')
			{
				t = 0;
				b = tangible.StringFunctions.changeCharacter(b, k, a.charAt(i));
				k++;
			}
			else
			{
				if (t == 0)
				{
					t = 1;
					b = tangible.StringFunctions.changeCharacter(b, k, a.charAt(i));
					k++;
				}
			}
		}
		b = tangible.StringFunctions.changeCharacter(b, k + 1, '\0');
		for (i = 0;i <= k - 1;i++)
		{
			System.out.print(b.charAt(i));
		}
		System.out.print("\n");
		return 0;
	}
}

