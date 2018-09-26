package <missing>;

public class GlobalMembers
{
	//*******************************************************
	//*11.2??  ????????????                   *
	//*?????  ?? 1100012844                          *
	//*???2011?11?2?                                  *
	//*******************************************************
	public static int Main()
	{
		String str = new String(new char[100001]);
		int t;
		int[] count = new int[26];
		int i;
		int j;
		int flag;
		t = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0; i < t; i++)
		{
			str = ConsoleInput.readToWhiteSpace(true).charAt(0);
			flag = 1;
			for (j = 0; j < 26; j++)
			{
				count[j] = 0;
			}
			for (j = 0; str.charAt(j) != '\0'; j++)
			{
				count[str.charAt(j) - 'a']++;
			}
			for (j = 0; str.charAt(j) != '\0'; j++)
			{
				if (count[str.charAt(j) - 'a'] == 1)
				{
					System.out.print(str.charAt(j));
					System.out.print("\n");
					flag = 0;
					break;
				}
			}
			if (flag != 0)
			{
				System.out.print("no");
				System.out.print("\n");
			}
		}
		return 0;
	}
}

