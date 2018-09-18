import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String str = new String(new char[101]);
		int i;
		int j;
		int[] a = new int[101];
		int len;
		int count;
		while (str = new Scanner(System.in).nextLine())
		{
			count = 0;
			len = str.length();
			for (i = 0 ; i <= len - 1 ; i++)
			{
				System.out.print(str.charAt(i));
			}
			System.out.print("\n");
			for (i = 0 ; i <= len - 1 ; i++)
			{
				if (str.charAt(i) == ')')
				{
					count++;
					a[count] = i;
				}
			}
			for (i = 1 ; i <= count ; i++)
			{
				for (j = a[i] - 1 ; j >= 0 ; j--)
				{
					if (a[i] == 0)
					{
						str = tangible.StringFunctions.changeCharacter(str, a[i], '?');
					}
					if (str.charAt(j) == '(')
					{
						str = tangible.StringFunctions.changeCharacter(str, j, ' ');
						str = tangible.StringFunctions.changeCharacter(str, a[i], ' ');
						break;
					}
				}
				if (str.charAt(a[i]) != ' ')
				{
					str = tangible.StringFunctions.changeCharacter(str, a[i], '?');
				}
			}
			for (i = 0 ; i <= len - 1 ; i++)
			{
				if (str.charAt(i) == '(')
				{
					str = tangible.StringFunctions.changeCharacter(str, i, '$');
				}
			}
			for (i = 0 ; i <= len - 1 ; i++)
			{
				if ((str.charAt(i) != ' ') && (str.charAt(i) != '?') && (str.charAt(i) != '$'))
				{
					str = tangible.StringFunctions.changeCharacter(str, i, ' ');
				}
			}
			for (i = 0 ; i <= len - 1 ; i++)
			{
				System.out.print(str.charAt(i));
			}
			System.out.print("\n");
		}
		return 0;
	}
}

