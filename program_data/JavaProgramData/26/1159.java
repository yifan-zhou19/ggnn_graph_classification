import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String sen = new String(new char[110]);
		String sen2 = new String(new char[110]);
		int len;
		int cnt = 0;
		sen = new Scanner(System.in).nextLine();
		len = sen.length();
		for (int i = 0 ; i < len ; i++)
		{
			if (sen.charAt(i) != ' ' || (sen.charAt(i) == ' ' && sen.charAt(i + 1) != ' '))
			{
				sen2 = tangible.StringFunctions.changeCharacter(sen2, cnt, sen.charAt(i));
				cnt++;
			}
		}
		for (int k = 0 ; k < cnt ; k++)
		{
			System.out.print(sen2.charAt(k));
		}
		return 0;
	}

}

