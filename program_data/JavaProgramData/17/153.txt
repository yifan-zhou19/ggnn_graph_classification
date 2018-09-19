import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[105]);
		int[] mark = new int[105];
		while (a = new Scanner(System.in).nextLine())
		{
			for (int i = 0; i < a.length(); i++)
			{
				if (a.charAt(i) == '(')
				{
					mark[i] = 1;
				}
				if (a.charAt(i) == ')')
				{
					mark[i] = -1;
				}
			}
			for (int i = 1; i < a.length(); i++)
			{
				if (mark[i] == -1)
				{
					for (int j = i - 1; j >= 0; j--)
					{
						if (mark[j] == 1)
						{
							mark[i] = 0;
							mark[j] = 0;
							break;
						}
					}
				}
			}
			for (int i = 0; i < a.length(); i++)
			{
				System.out.print(a.charAt(i));
			}
			System.out.print("\n");
			for (int i = 0; i < a.length(); i++)
			{
				if (mark[i] == 0)
				{
					System.out.print(" ");
				}
				else if (mark[i] == 1)
				{
					System.out.print("$");
				}
				else
				{
					System.out.print("?");
				}
			}
			System.out.print("\n");
			for (int i = 0; i < a.length(); i++)
			{
				mark[i] = 0;
			}
		}
		return 0;
	}

}
