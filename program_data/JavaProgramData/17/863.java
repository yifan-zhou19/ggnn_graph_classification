import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int len;
		int i;
		int left = 0;
		int right = 0;
		String str = new String(new char[102]);
		String b = new String(new char[102]);
		while (str = new Scanner(System.in).nextLine())
		{
			len = str.length();
			left = 0;
			right = 0;
			for (i = 0 ; str.charAt(i) != '\0'; i++)
			{
				b = tangible.StringFunctions.changeCharacter(b, i, ' ');
				if (str.charAt(i) == '(')
				{
					left++;
				}
				if (str.charAt(i) == ')')
				{
					if (left <= 0)
					{
						b = tangible.StringFunctions.changeCharacter(b, i, '?');
					}
					else
					{
						left--;
					}
				}
			}
			for (i = len - 1 ;i >= 0; i--)
			{
				if (str.charAt(i) == ')')
				{
					right++;
				}
				if (str.charAt(i) == '(')
				{
					if (right <= 0)
					{
						b = tangible.StringFunctions.changeCharacter(b, i, '$');
					}
					else
					{
						right--;
					}
				}
			}
			for (i = 0 ;i < len; i++)
			{
				System.out.print(str.charAt(i));
			}
			System.out.print("\n");
			for (i = 0 ;i < len; i++)
			{
				System.out.print(b.charAt(i));
			}
			System.out.print("\n");
		}
		return 0;
	}

}

