import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		String s1 = new String(new char[5]);
		s1 = new Scanner(System.in).nextLine();
		while (n != 0)
		{
			int tem = 1;
			String s = new String(new char[90]);
			s = new Scanner(System.in).nextLine();
			int i;
			for (i = 0;i < s.length();i++)
			{
				if (i == 0)
				{
					if (s.charAt(0) == '_' || (s.charAt(0) >= 'a' && s.charAt(0) <= 'z') || (s.charAt(0) >= 'A' && s.charAt(0) <= 'Z'))
					{
						tem = 1;
					}
					else
					{
						tem = 0;
						break;
					}
				}
				else
				{
					if (s.charAt(i) >= 'a' && s.charAt(i) <= 'z' || (s.charAt(i) >= 'A' && s.charAt(i) <= 'Z') || s.charAt(i) >= '0' && s.charAt(i) <= '9' || s.charAt(i) == '_')
					{
						tem = 1;
					}
					else
					{
						tem = 0;
						break;
					}
				}
			}
		System.out.print(tem);
		System.out.print("\n");
		n--;
		}
			return 0;
	}

}

