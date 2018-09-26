import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[101]);
		a = new Scanner(System.in).nextLine();
		int b = a.length();
		int j;
		for (int i = 0;i < b;i++)
		{
			if (a.charAt(i) == ' ')
			{
			if (a.charAt(i + 1) == ' ')
			{
				for (j = i + 1;j < b;j++)
				{
					a = tangible.StringFunctions.changeCharacter(a, j, a.charAt(j + 1));
				}
				i--;
			}
			}
		}
		System.out.print(a);
		System.out.print("\n");
		return 0;
	}
}

