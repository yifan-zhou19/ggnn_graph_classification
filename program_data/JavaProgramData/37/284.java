import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String str = new String(new char[100001]);
		int t = 0;
		int i = 0;
		int k = 0;
		int j = 0;
		int flag = 0;
		int m = 0;
		int[] num = new int[27];
		for (i = 0;i < 27;i++)
		{
			num[i] = 0;
		}
		t = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		System.in.read();
		for (i = 1;i <= t;i++)
		{
			for (j = 0;j < 27;j++)
			{
				num[j] = 0;
			}
			flag = 0;
			str = new Scanner(System.in).nextLine();
			k = str.length();
			for (j = 0;j < k;j++)
			{
				num[str.charAt(j) - 'a' + 1]++;
			}
			for (m = 1;m < 27;m++)
			{
				if (num[m] == 1)
				{
					flag = 1;
				}
			}
			if (flag == 0)
			{
				System.out.print("no");
			}
			else
			{
				for (j = 0;j < k;j++)
				{
					if (num[str.charAt(j) - 'a' + 1] == 1)
					{
						System.out.print(str.charAt(j));
						break;
					}
				}
			}
			System.out.print("\n");
		}
		return 0;
	}
}

