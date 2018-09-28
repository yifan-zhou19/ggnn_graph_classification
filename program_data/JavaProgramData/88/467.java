import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String s = new String(new char[40]);
		s = new Scanner(System.in).nextLine();
		for (int i = 0;i < s.length();i++)
		{
			if (s.charAt(i) < 48 || s.charAt(i)>57)
			{
				continue;
			}
			if (s.charAt(i) > 47 && s.charAt(i) < 58)
			{
				if (s.charAt(i + 1) < 48 || s.charAt(i + 1)>57)
				{
					System.out.print(s.charAt(i));
					System.out.print("\n");
				}
				else
				{
					System.out.print(s.charAt(i));
				}
			}
		}


		return 0;
	}
}
