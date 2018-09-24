import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String s = new String(new char[101]);
		s = new Scanner(System.in).nextLine();
		int l = s.length();
		for (int i = 0;i < l;i++)
		{
			if (s.charAt(i) != ' ')
			{
				System.out.print(s.charAt(i));
				if (i < l - 1 && s.charAt(i + 1) == ' ')
				{
					System.out.print(' ');
				}
			}
		}
		return 0;
	}

}
