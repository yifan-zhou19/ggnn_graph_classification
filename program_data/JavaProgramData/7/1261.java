import java.util.*;

package <missing>;

public class GlobalMembers
{
	/*************************************************************************************************************
	* @file .cpp
	* @author ????
	* @date 
	* @description
	*         
	*/

	public static String word = new String(new char[256]);
	public static String substring = new String(new char[256]);
	public static String replacement = new String(new char[256]);
	public static int l1;
	public static int l2;
	public static int l3;
	public static int the_same(tangible.RefObject<String> ch)
	{
		int i;
		for (i = 0; i < l2; i++)
		{
			if (*(ch.argValue.Substring(i)) != substring.charAt(i))
			{
				return 0;
			}
		}
		return 1;
	}
	public static int Main()
	{
		String p = null;
		String q = null;
		int i;
		int t;
		word = new Scanner(System.in).nextLine();
		l1 = word.length();
		substring = new Scanner(System.in).nextLine();
		l2 = substring.length();
		replacement = new Scanner(System.in).nextLine();
		l3 = replacement.length();
		for (i = 0; i < l1; i++)
		{
			t = the_same(word.charAt(i));
			if (t == 1)
			{
				p = word.Substring(i);
				break;
			}
		}
		if (p == null)
		{
			for (i = 0; i < l1; i++)
			{
				System.out.print(word.charAt(i));
			}
		}
		else
		{
			for (q = word; q < p; q++)
			{
				System.out.print(q);
			}
			for (i = 0;i < l3; i++)
			{
				System.out.print(replacement.charAt(i));
			}
			for (q = p.Substring(l2); q < word.Substring(l1);q++)
			{
				System.out.print(q);
			}
		}
		return 0;
	}
}

