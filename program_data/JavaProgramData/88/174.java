import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[31]);
		a = new Scanner(System.in).nextLine();
		int i = -1;
		int len = a.length();
		while (i < len)
		{
			i++;
			if (a.charAt(i) > '9' || a.charAt(i) < '0')
			{
				continue; //??????????
			}
			while (a.charAt(i) <= '9' && a.charAt(i) >= '0')
			{ //????????????????????
				System.out.print(a.charAt(i));
				i++;
			}
			System.out.print("\n");
		}
			 System.out.print("\n");
		return 0;
	}
}
