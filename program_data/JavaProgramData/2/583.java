import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m;
		int i;
		int j;
		int[] num = new int[999];
		int[][] store = new int[26][999];
		int[] cal = new int[26];
		int max = 0;
		int maxnum;
		char[][] au = new char[999][26];
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0; i <= m - 1; i++)
		{
			num[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			System.in.read();
			au[i] = new Scanner(System.in).nextLine();
			for (j = 0; ;j++)
			{
				if (au[i][j] == '\0')
				{
					break;
				}
				else
				{
					store[au[i][j] - 'A'][cal[au[i][j] - 'A']] = num[i];
					cal[au[i][j] - 'A']++;
				}
			}
		}
		for (i = 0; i <= 25; i++)
		{
			if (cal[i] > max)
			{
				max = cal[i];
				maxnum = i;
			}
		}
		char t = 'A' + maxnum;
		System.out.print(t);
		System.out.print("\n");
		System.out.print(max);
		System.out.print("\n");
		for (i = 0; i < max ; i++)
		{
			System.out.print(store[maxnum][i]);
			System.out.print("\n");
		}
		return 0;
	}


}

