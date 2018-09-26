import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String str1 = new String(new char[103]);
		String str2 = new String(new char[103]);
	str1 = new Scanner(System.in).nextLine();
	String p = str1;
	String q = str2;
	int l = str1.length();
	for (int i = 0;i < l - 1;i++)
	{
		q = tangible.StringFunctions.changeCharacter(q, i, p.charAt(i) + p.charAt(i + 1));
	}
	q = tangible.StringFunctions.changeCharacter(q, l - 1, p.charAt(l - 1) + p.charAt(0));
	for (int i = 0;i < l;i++)
	{
		System.out.print(q.charAt(i));
	}

	return 0;
	}
}

