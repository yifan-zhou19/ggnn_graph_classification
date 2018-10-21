package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int t;
		int i;
		int j;
		int k;
		int[] record = new int[26];
		final String s = "";
		t = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < t;i++)
		{
			k = 0;
			s = ConsoleInput.readToWhiteSpace(true).charAt(0);
			for (j = 0;j < s.length();j++)
			{
				record[s.charAt(j) - 'a']++;
			}
			for (j = 0;j < s.length();j++)
			{
				if (record[s.charAt(j) - 'a'] == 1)
				{
						System.out.print(s.charAt(j));
						System.out.print("\n");
						k = 1;
						break;
				}
			}
			if (k == 0)
			{
				System.out.print("no");
				System.out.print("\n");
			}
			for (j = 0;j < s.length();j++)
			{
				s = s.substring(0, j);
			}
			for (j = 0;j < 26;j++)
			{
				record[j] = 0;
			}
		}
			return 0;
	}

}

