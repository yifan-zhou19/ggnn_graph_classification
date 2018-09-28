import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		final String str = "";
		String p;
		int len;
		int t;
		int flag;
		t = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		System.in.read();
		for (int i = 0;i < t;i++)
		{
			str = new Scanner(System.in).nextLine();
			len = str.length();
			for (int i = 0;i < len;i++)
			{
				if (str.charAt(i) >= 'a' && str.charAt(i) <= 'z')
				{
				flag = 0;
				for (int j = i + 1;j < len;j++)
				{
					if (str.charAt(i) == str.charAt(j))
					{
						flag = 1;
						str = tangible.StringFunctions.changeCharacter(str, j, '0');
						break;
					}
				}
				if (flag == 0)
				{
					System.out.print(str.charAt(i));
					System.out.print("\n");
					break;
				}
				}
			}
			if (flag == 1)
			{
				System.out.print("no");
				System.out.print("\n");
			}
		}
		return 0;
	}
}

