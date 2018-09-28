import java.util.*;

package <missing>;

public class GlobalMembers
{
	//
	//	?????	???????
	//	?????	??????s??????s1
	//	?????	?  ? ? ? ?? 1000012733 ?
	//	?????	2010 ? 12 ? 18 ?
	//
	public static int Main()
	{
		String s = new String(new char[101]);
		String s1 = new String(new char[101]);
		int i;
		int len;
		s = new Scanner(System.in).nextLine();
		len = s.length();
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(s1, 0, 101);
		for (i = 0; i < len; i++)
		{
			if (i < len - 1)
			{
				s1 = tangible.StringFunctions.changeCharacter(s1, i, s.charAt(i) + s.charAt(i + 1));
			}
			else
			{
				s1 = tangible.StringFunctions.changeCharacter(s1, i, s.charAt(i) + s.charAt(0));
			}
		}
		System.out.print(s1);
		System.out.print("\n");
		return 0;
	}
}

