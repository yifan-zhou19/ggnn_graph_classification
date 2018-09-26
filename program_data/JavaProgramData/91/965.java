import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[1000]);
		char temp;
		int i;
		int l;
		a = new Scanner(System.in).nextLine();
		temp = (a);
		l = a.length();
		for (i = 0;i < l;i++)
		{
			if (i < l - 1)
			{
			*(a.Substring(i)) = *(a.Substring(i)) + *(a.Substring(i) + 1);
			}
			else
			{
			*(a.Substring(i)) = *(a.Substring(i)) + temp;
			}
		}
		for (i = 0;i < l;i++)
		{
			System.out.print((a.Substring(i)));
		}
		return 0;
	}
}
