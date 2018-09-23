import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String str = new String(new char[1100]);
		int i = 0;
		int p = 0;
		int[] used = new int[1100];
		int len = 0;
		int sum = 0;
		str = new Scanner(System.in).nextLine();
		len = str.length();
		for (i = 0;i < len;i++)
		{
			if (str.charAt(i) >= 'a' && str.charAt(i) <= 'z')
			{
				str = tangible.StringFunctions.changeCharacter(str, i, str.charAt(i) - 32);
			}
			else
			{
				str = tangible.StringFunctions.changeCharacter(str, i, str.charAt(i));
			}
		}
		for (i = 0;i < len;i++)
		{
			used[i] = 1;
		}
		for (i = 0;i < len;i++)
		{
			if (used[i] != 0)
			{
				p = i + 1;
				while (str.charAt(i) == str.charAt(p))
				{
					used[i]++;
					used[p] = 0;
					p++;
				}
			}
		}
		for (i = 0;i < len;i++)
		{
			if (used[i] != 0)
			{
				System.out.print("(");
				System.out.print(str.charAt(i));
				System.out.print(",");
				System.out.print(used[i]);
				System.out.print(")");
			}
		}
		return 0;
	}

}

