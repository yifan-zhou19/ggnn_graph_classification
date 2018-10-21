import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[200]);
		int l;
		int t = 1;
		a = new Scanner(System.in).nextLine();
		l = a.length();
		for (int i = 0;i < l;i++)
		{
			if (*(a.Substring(i)) != ' ')
			{
				t = 0;
				System.out.print((a.Substring(i)));
			}
			else if ((*(a.Substring(i)) = ' ') && t == 0)
			{
				System.out.print((a.Substring(i)));
				t = 1;
			}
		}
		return 0;
	}

}
