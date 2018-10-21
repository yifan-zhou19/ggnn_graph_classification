import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String s = new String(new char[101]);
		String s1 = new String(new char[101]);
		s = new Scanner(System.in).nextLine();
		int len = s.length();
		for (int i = 0;i < len;i++)
		{
			if (i == len - 1)
			{ //?????????
				*(s1.Substring(i)) = *(s.Substring(i)) + *(s); //??????????????
			}
			else
			{
				*(s1.Substring(i)) = *(s.Substring(i)) + *(s.Substring(i) + 1); //???????????????
			}
		}
		*(s1.Substring(len)) = '\0'; //?????\0
		System.out.print(s1);
		System.out.print("\n");
		return 0;
	}
}
