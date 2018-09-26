import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int t;
		int i;
		int j;
		int k;
		int flag;
		String a = new String(new char[100000]);
		t = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i <= t;i++)
		{
			a = new Scanner(System.in).nextLine();
			int len = a.length();
			for (j = 0;j < len;j++)
			{
				flag = 1;
				for (k = 0;k < len;k++)
				{
					if (a.charAt(j) == a.charAt(k) && k != j)
					{
						flag = 0;
						break;
					}
				}
				if (flag == 1)
				{
					System.out.print(a.charAt(j));
					System.out.print("\n");
					break;
				}
				if (flag == 0)
				{
					continue;
				}

			}
			if (flag == 0)
			{
				System.out.print("no");
				System.out.print("\n");
			}
		}
		return 0;
	}

}

