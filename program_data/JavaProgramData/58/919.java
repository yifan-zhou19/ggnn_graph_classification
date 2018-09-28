import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static String s = new String(new char[81]);
	public static int a;
	public static int Main()
	{
		int str;
		int l;
		int i;
		int n;
		int m;
		int p;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		System.in.read();
		for (l = 0;l < n;l++)
		{

			s = new Scanner(System.in).nextLine();
			str = s.length();
			m = 0;
			p = 0;

			if (s.charAt(0) == '_' || (s.charAt(0) >= 'a' && s.charAt(0) <= 'z') || (s.charAt(0) >= 'A' && s.charAt(0) <= 'Z'))
			{
				m = 1;
			}
			else
			{
				m = 0;
			}
			for (i = 0;i < str;i++)
			{
				if (s.charAt(i) == '_' || (s.charAt(i) >= '0' && s.charAt(i) <= '9') || (s.charAt(i) >= 'a' && s.charAt(i) <= 'z') || (s.charAt(i) >= 'A' && s.charAt(i) <= 'Z'))
				{
					p = 1;
				}
				else
				{
					p = 0;
					break;
				}
			}

			if (p != 0 && m == 1)
			{
				a = 1;
			}
			else
			{
				a = 0;
			}
			System.out.print(a);
			System.out.print('\n');
		}
		return 0;
	}
}

