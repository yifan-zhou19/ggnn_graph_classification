import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] bs = new int[102];
		int i;
		int j;
		String a = new String(new char[102]);
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(bs,0,102);
		while (a = new Scanner(System.in).nextLine())
		{
			for (i = 0;i < 102;i++)
			{
				if (a.charAt(i) == '\0')
				{
					break;
				}
				if (a.charAt(i) == '(')
				{
					bs[i] = 1;
				}
				if (a.charAt(i) == ')')
				{
					bs[i] = 1;
					for (j = i;j >= 0;j--)
					{
						if (a.charAt(j) == '(' && bs[j] == 1)
						{
							bs[j] = 0;
							bs[i] = 0;
							break;
						}
					}
				}
			}
			System.out.print(a);
			System.out.print("\n");
			for (i = 0;i < 102;i++)
			{
				if (a.charAt(i) == '\0')
				{
					break;
				}
				if (a.charAt(i) == ')' && bs[i] == 1)
				{
					System.out.print("?");
				}
				else if (a.charAt(i) == '(' && bs[i] == 1)
				{
					System.out.print("$");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.print("\n");
		}
		return 0;
	}

}
