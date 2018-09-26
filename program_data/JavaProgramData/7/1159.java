import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String sentence = new String(new char[256]);
		String sub_sen = new String(new char[256]);
		String replacement = new String(new char[256]);
		sentence = new Scanner(System.in).nextLine();
		sub_sen = new Scanner(System.in).nextLine();
		replacement = new Scanner(System.in).nextLine();
		String p;
		p = tangible.StringFunctions.strStr(sentence, sub_sen);
		if (p == null)
		{
			System.out.print(sentence);
			System.out.print("\n");
		}
		int i;
		int length = sub_sen.length();
		if (p != null)
		{
			for (i = 0; i < p - sentence; i++)
			{
				System.out.print(sentence.charAt(i));
			}
			System.out.print(replacement);
			System.out.print(p.Substring(length));
			System.out.print("\n");
		}
		return 0;
	}




}

