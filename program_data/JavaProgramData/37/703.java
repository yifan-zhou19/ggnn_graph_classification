package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String str = new String(new char[100000]);
		int t;
		int i;
		int j;
		int flag;
		t = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0; i < t; i++)
		{
			int[] count = new int[26];
			flag = 0;
			str = ConsoleInput.readToWhiteSpace(true).charAt(0);
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
					flag = 1;
					break;
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

