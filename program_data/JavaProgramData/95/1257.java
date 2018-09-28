import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String sen1 = new String(new char[81]);
		String sen2 = new String(new char[80]);
		sen1 = new Scanner(System.in).nextLine();
		sen2 = new Scanner(System.in).nextLine(); //?????
		int n = sen1.length();
		int m = sen2.length();
		for (int i = 0; i < n; i++)
		{
			sen1 = tangible.StringFunctions.changeCharacter(sen1, i, Character.toLowerCase(sen1.charAt(i)));
		}
		for (int i = 0; i < m; i++)
		{
			sen2 = tangible.StringFunctions.changeCharacter(sen2, i, Character.toLowerCase(sen2.charAt(i))); //?????
		}
		System.out.println(strcmp(sen1,sen2) == 0?"=":(strcmp(sen1,sen2) > 0?">":"<")); //???????
		return 0;
	}
}

