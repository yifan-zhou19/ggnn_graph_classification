package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int t;
		int i;
		int j;
		int[] b = new int[26];
		int x;
		int flag;
		String a = new String(new char[100000]);
		t = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0; i < t; i++)
		{
			flag = 0;
			a = ConsoleInput.readToWhiteSpace(true).charAt(0);
			for (j = 0; j < 26; j++)
			{
				b[j] = 0;
			}
			for (j = 0; j < a.length(); j++)
			{
				x = a.charAt(j) - 'a';
				b[x]++;
			}
			for (j = 0; j < a.length(); j++)
			{
				if (b[a.charAt(j) - 'a'] == 1)
				{
					System.out.print(a.charAt(j));
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

