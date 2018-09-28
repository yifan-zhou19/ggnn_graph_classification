import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[100]); //???????????
		int len; //????????????
		int i;
		a = new Scanner(System.in).nextLine();
		len = a.length();
		System.out.print(a.charAt(0));
		for (i = 1;i < len;i++)
		{
			if (!(a.charAt(i) == ' ' && a.charAt(i - 1) == ' ')) //?????????????????????
			{
			System.out.print(a.charAt(i));
			}
		}
		return 0;
	}
}
