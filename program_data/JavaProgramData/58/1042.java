import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int len;
		int i;
		int j;
		int flag;
		String s = new String(new char[81]);
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		System.in.read();
		for (i = 0;i < n;i++)
		{
			s = new Scanner(System.in).nextLine();
			len = s.length();
			if (s.charAt(0) == '_' || s.charAt(0) > 64 && s.charAt(0) < 91 || s.charAt(0)>96 && s.charAt(0) < 96 + 27)
			{
				flag = 1;
				for (j = 1;j < len;j++)
				{
					if (!(s.charAt(j) == '_' || s.charAt(j) > 64 && s.charAt(j) < 91 || s.charAt(j)>96 && s.charAt(j) < 96 + 27 || s.charAt(j)>47 && s.charAt(j) < 58))
					{
						flag = 0;
						break;
					}
				}
				if (flag != 0)
				{
					System.out.print(1);
					System.out.print("\n");
				}
				else
				{
					System.out.print(0);
					System.out.print("\n");
				}

			}
			else
			{
				System.out.print(0);
				System.out.print("\n");
			}
		}
		return 0;
	}
}

