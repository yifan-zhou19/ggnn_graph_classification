import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String str1 = new String(new char[51]);
		String str2 = new String(new char[51]);
		cin.getline(str1,51,' ');
		str2 = new Scanner(System.in).nextLine();
		int i;
		int flag = 0;
		int len = str1.length();
		int j;
		for (i = 0; str2.charAt(i) != '\n'; i++)
		{
			flag = 0;
			if (str2.charAt(i) == str1.charAt(0))
			{
				for (j = 0; j < len ; j++)
				{
					if (str2.charAt(i + j) == str1.charAt(j))
					{
						;
					}
					else
					{
						flag = 1;
						break;
					}

				}
			}
			else
			{
				   flag = 1;
			}

			if (flag == 0)
			{
				System.out.print(i);
				System.out.print("\n");
				break;
			}
		}

		return 0;
	}

}
