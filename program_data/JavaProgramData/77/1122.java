import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[101]);
		String flag = new String(new char[2]);
		int t;
		int i;
		int j;
		int k;
		a = new Scanner(System.in).nextLine();
		flag = tangible.StringFunctions.changeCharacter(flag, 0, a.charAt(0));
		j = a.length();
		for (i = 0; i < j; i++)
		{
			if (a.charAt(i) != flag.charAt(0) && a.charAt(i) != '0')
			{
				for (k = i - 1; k >= 0; k--)
				{
					if (a.charAt(k) == flag.charAt(0))
					{
						System.out.print(k);
						System.out.print(" ");
						System.out.print(i);
						System.out.print("\n");
						a = tangible.StringFunctions.changeCharacter(a, i, '0');
						a = tangible.StringFunctions.changeCharacter(a, k, '0');
						break;
					}
				}
			}
		}
		return 0;
	}
}

