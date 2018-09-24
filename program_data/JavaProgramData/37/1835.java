package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		char[][] str = new char[100][10010];
		int[] num = new int[26];
		int len;
		int cnt;
		int i;
		int j;
		int k;
		int t;
		t = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0 ; i < t ; i++)
		{
			str[i] = ConsoleInput.readToWhiteSpace(true).charAt(0);
		}
		for (j = 0 ; j < t ; j++)
		{
			cnt = 0;
			for (i = 0 ; i < 26 ; i++)
			{
				num[i] = 0;
			}
			len = String.valueOf(str[j]).length();
			for (k = 0 ; k < len ; k++)
			{
				num[str[j][k] - 'a']++;
			}

			for (i = 0 ; i < len ; i++)
			{

				if (num[str[j][i] - 'a'] == 1)
				{
					System.out.print(str[j][i]);
					System.out.print("\n");
					cnt++;
					break;
				}
			}
			if (cnt == 0)
			{
				System.out.print("no");
				System.out.print("\n");
			}
		}
		return 0;
	}
}

