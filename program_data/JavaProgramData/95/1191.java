import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int min(int x,int y)
	{
		return (x < y != 0?x:y);
	}
	public static int Main()
	{
		char ans = '=';
		String str1 = new String(new char[90]);
		String str2 = new String(new char[90]);
		str1 = new Scanner(System.in).nextLine();
		str2 = new Scanner(System.in).nextLine();
		int x = 'a'-'A';
		int len1 = str1.length();
		int len2 = str2.length();
		for (int i = 0;i < min(len1, len2);i++)
		{
			if (str1.charAt(i) >= 'a' && str1.charAt(i) <= 'z')
			{
				str1 = tangible.StringFunctions.changeCharacter(str1, i, str1.charAt(i) - x);
			}
		  if (str2.charAt(i) >= 'a' && str2.charAt(i) <= 'z')
		  {
			  str2 = tangible.StringFunctions.changeCharacter(str2, i, str2.charAt(i) - x);
		  }

		  if (str1.charAt(i) > str2.charAt(i))
		  {
			  ans = '>';
			  break;
		  }

		 else if (str2.charAt(i) > str1.charAt(i))
		 {
			 ans = '<';
			 break;
		 }
		}
		System.out.print(ans);
		System.out.print("\n");

		return 0;
	}

}

