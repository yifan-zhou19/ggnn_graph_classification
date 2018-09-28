import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int k;
		int j;
		String a = new String(new char[1000]); //????
		a = new Scanner(System.in).nextLine();
		k = a.length(); //?i????
		for (i = 0;i < k;i++)
		{
			if (a.charAt(i) == ' ')
			{
				if (a.charAt(i + 1) == ' ')
				{
						for (j = i + 1;j < k - 1;j++)
						{
					a = tangible.StringFunctions.changeCharacter(a, j, a.charAt(j + 1));
						}
				a = a.substring(0, j);
				k--;
				i--;
				} //???????k??1?i?1????i
			}
		}
		System.out.print(a);
		return 0;
	}

}

