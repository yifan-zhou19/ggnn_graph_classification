import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int m;
		String str = new String(new char[101]);
		str = new Scanner(System.in).nextLine();
		m = str.length();
		for (i = 0;i < m;i++)
		{
			if (str.charAt(i) != 32 || (str.charAt(i) == 32 && str.charAt(i + 1) != 32))
			{
				System.out.print(str.charAt(i));
			}
		}
		return 0;
	}

}
