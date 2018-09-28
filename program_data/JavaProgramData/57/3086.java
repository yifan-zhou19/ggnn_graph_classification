import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String str = new String(new char[1000]);
		String a = new String(new char[10]);
		a = new Scanner(System.in).nextLine();
		int n = Integer.parseInt(a);
		while (n-- != 0)
		{
			str = new Scanner(System.in).nextLine();
			int len = str.length();
			String p1 = str.Substring(len) - 1 - 1;
			String p2 = str.Substring(len) - 1 - 2;
			if ((p1 == 'e') && (*(p1.Substring(1)) == 'r'))
			{
				p1 = '\0';
			}
			if ((p1 == 'l') && (*(p1.Substring(1)) == 'y'))
			{
				p1 = '\0';
			}
			if ((p2 == 'i') && (*(p2.Substring(1)) == 'n') && (*(p2.Substring(2)) == 'g'))
			{
				p2 = '\0';
			}
		System.out.println(str);
		}
		return 0;
	}


}
