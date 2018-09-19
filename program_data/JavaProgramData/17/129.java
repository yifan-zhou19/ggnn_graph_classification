import java.util.*;

package <missing>;

public class GlobalMembers
{
	//****************************************
	//*?????????                   **
	//*?????? 1100012763              **
	//*???2011.11.15                     **
	//****************************************
	public static int Main()
	{
		String array = new String(new char[101]);
		String ans = new String(new char[101]);
		int len;
		int i;
		int left;
		int right;

		while (array = new Scanner(System.in).nextLine())
		{
			len = array.length();
			left = 0;
			right = 0;
			for (i = 0; i < len; i++)
			{
				ans = tangible.StringFunctions.changeCharacter(ans, i, ' ');
				if (array.charAt(i) == '(')
				{
					left++;
				}
				if (array.charAt(i) == ')')
				{
					right++;
					if (right > left)
					{
						left = 0;
						right = 0;
						ans = tangible.StringFunctions.changeCharacter(ans, i, '?');
					}
				}
			}
			left = 0;
			right = 0;
			for (i = len - 1; i >= 0; i--)
			{
				if (array.charAt(i) == '(')
				{
					left++;
					if (left > right)
					{
						left = 0;
						right = 0;
						ans = tangible.StringFunctions.changeCharacter(ans, i, '$');
					}
				}
				if (array.charAt(i) == ')')
				{
					right++;
				}
			}
			for (i = 0; i < len; i++)
			{
				System.out.print(array.charAt(i));
			}
			System.out.print("\n");
			for (i = 0; i < len; i++)
			{
				System.out.print(ans.charAt(i));
			}
			System.out.print("\n");
		}

		return 0;
	}

}

