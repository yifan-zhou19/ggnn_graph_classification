import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int t;
		t = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		System.in.read();
		for (int i = 0;i < t;i++)
		{
			int[] flag = new int[26];
			int str_len;
			String str = new String(new char[100000]);
			str = new Scanner(System.in).nextLine();
			str_len = str.length();
			for (int j = 0;j < str_len;j++)
			{
				int c = str.charAt(j) - 'a';
				if (flag[c] == -1)
				{
					continue;
				}
				else
				{
					if (flag[c] == 0)
					{
						flag[c] = j + 1;
					}
					else
					{
						flag[c] = -1;
					}
				}
			}
			int min_pos = 100000;
			char c = '@';
			for (int j = 0;j < 26;j++)
			{
				if (flag[j] == -1 || flag[j] == 0)
				{
					continue;
				}
				else
				{
					if (flag[j] < min_pos)
					{
						min_pos = flag[j];
						c = j + 'a';
					}
				}
			}
			if (c == '@')
			{
				System.out.print("no");
				System.out.print("\n");
			}
			else
			{
				System.out.print(c);
				System.out.print("\n");
			}
		}
		return 0;
	}
}

