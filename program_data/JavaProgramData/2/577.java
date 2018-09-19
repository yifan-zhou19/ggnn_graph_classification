package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		char[][] mname = new char[999][26];
		char name;
		int i;
		int j;
		int m;
		int len;
		int max = 0;
		int[] num = new int[999];
		int[] count = new int[26];
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0; i < m; i++)
		{
			num[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			mname[i] = ConsoleInput.readToWhiteSpace(true).charAt(0);
			len = String.valueOf(mname[i]).length();
			for (j = 0; j < len; j++)
			{
				count[mname[i][j] - 'A']++;
			}
		}
		for (i = 0; i < 26; i++)
		{
			if (count[i] > max)
			{
				max = count[i];
				name = i + 'A';
			}
		}
		System.out.print(name);
		System.out.print("\n");
		System.out.print(max);
		System.out.print("\n");
		for (i = 0; i < m; i++)
		{
			len = String.valueOf(mname[i]).length();
			for (j = 0; j < len; j++)
			{
				if (mname[i][j] == name)
				{
					System.out.print(num[i]);
					System.out.print("\n");
					break;
				}
			}
		}
		return 0;
	}

}

