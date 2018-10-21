import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int plalindrome(tangible.RefObject<String> p)
	{ //?????????
		int n;
		int i;
		for (n = 0; * (p.argValue.Substring(n)) != 0;n++)
		{
			;
		}
		for (i = 0;i < n / 2;i++)
		{
			if (*(p.argValue.Substring(i)) != *(p.argValue.Substring(n) - 1 - i))
			{
				break;
			}
		}
		if (i < n / 2)
		{
			return 0; //??0????
		}
		return 1; //??1???
	}
	public static int Main()
	{
		int i;
		int j;
		int k;
		int n;
		String string = new String(new char[501]);
		String substring = new String(new char[501]);
		String = new Scanner(System.in).nextLine();
		for (n = 0;string.charAt(n) != 0;n++)
		{
			;
		}
		for (i = 2;i <= n;i++) //???????????  i??????
		{
			for (j = 0;j <= n - i;j++)
			{ //j????????
				for (k = 0;k < i;k++)
				{
					substring = tangible.StringFunctions.changeCharacter(substring, k, string.charAt(j + k));
				}
				substring = substring.substring(0, k);
			tangible.RefObject<String> tempRef_substring = new tangible.RefObject<String>(substring);
				if (plalindrome(tempRef_substring) != 0)
				{
					substring = tempRef_substring.argValue;
					System.out.print(substring);
					System.out.print("\n");
				}
				else
				{
					substring = tempRef_substring.argValue;
				}
			}
		}
		return 0;
	}
}

