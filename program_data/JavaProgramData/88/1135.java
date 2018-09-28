import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String word = new String(new char[31]);
		int i = 0;
		int flag = 0;
		int flags = 0;
		int j = 0;
		int len = 0;
		word = new Scanner(System.in).nextLine();
		len = word.length();
		for (i = 0;i < len + 1;i++)
		{
			if (word.charAt(0) < '9' && word.charAt(0)>'0')
			{
				if (word.charAt(i) > '9' || word.charAt(i) < '0')
				{
					if (flag == 0)
					{
						for (j = flag;j < flags;j++)
						{
							System.out.print(word.charAt(j));
						}
					}
					else
					{
						for (j = flag + 1;j < flags;j++)
						{
							System.out.print(word.charAt(j));
						}
					}
					if (flags - flag > 1 && flag > 0)
					{
						System.out.print("\n");
					}
					else if (flags - flag >= 1 && flag == 0)
					{
						System.out.print("\n");
					}
					flag = flags;
					flags++;
				}
				else
				{
					flags++;
				}
			}
			else
			{
				if (word.charAt(i) > '9' || word.charAt(i) < '0')
				{
					for (j = flag + 1;j < flags;j++)
					{
						System.out.print(word.charAt(j));
					}

					if (flags - flag > 1)
					{
						System.out.print("\n");
					}
					flag = flags;
					flags++;
				}
				else
				{
					flags++;
				}
			}
		}
		return 0;
	}
}
