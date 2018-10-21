import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int length;
		int flag;
		String str = new String(new char[21]);
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		System.in.read();
		for (j = 0;j < n;j++)
		{
			str = new Scanner(System.in).nextLine();
			length = str.length();
			flag = 0;
			if ((str.charAt(0) >= 'A' && str.charAt(0) <= 'Z') || (str.charAt(0) >= 'a' && str.charAt(0) <= 'z') || (str.charAt(0) == '_'))
			{
				flag = 1;
				for (i = 1;i < length;i++)
				{
					if ((str.charAt(i) >= 'A' && str.charAt(i) <= 'Z') || (str.charAt(i) >= 'a' && str.charAt(i) <= 'z') || (str.charAt(i) == '_') || (str.charAt(i) >= '0' && str.charAt(i) <= '9'))
					{
						flag++;
					}
					else
					{
						System.out.print("no");
						System.out.print("\n");
						break;
					}
				}
				if (flag == length)
				{
					System.out.print("yes");
					System.out.print("\n");
				}
			}
			else
			{
				System.out.print("no");
				System.out.print("\n");
			}
		}
		return 0;
	}


}

