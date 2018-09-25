import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		System.in.read();
		while (n-- != 0)
		{
			String str = new String(new char[100]);
			str = new Scanner(System.in).nextLine();
			int k = str.length();
			int flag = 0;
			if (str.charAt(0) >= '0' && str.charAt(0) <= '9') //??????????????
			{
				System.out.print("no");
				System.out.print("\n");
			}
			else
			{
				for (int i = 0;i < k;i++)
				{
					if (str.charAt(i) >= 'a' && str.charAt(i) <= 'z')
					{
						flag++;
					}
					else if (str.charAt(i) >= 'A' && str.charAt(i) <= 'Z')
					{
						flag++;
					}
					else if (str.charAt(i) >= '0' && str.charAt(i) <= '9')
					{
						flag++;
					}
					else if (str.charAt(i) == '_')
					{
						flag++;
					}
					else
					{
						break;
					}
				}
				if (flag == k)
				{
					System.out.print("yes");
					System.out.print("\n");
				}
				else
				{
					System.out.print("no");
					System.out.print("\n");
				}
			}
		}
		return 0;
	}

}

