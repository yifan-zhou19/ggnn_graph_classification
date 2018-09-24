package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int n;
		int[] tim = new int[26];
		int tell;
		String a = new String(new char[1000]);
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (; n > 0; n--)
		{
			tell = 0;
			for (i = 0; i < 26; i++)
			{
				tim[i] = 0;
			}
			a = ConsoleInput.readToWhiteSpace(true).charAt(0);
			for (i = 0;i < a.length(); i++)
			{
				tim[a.charAt(i) - 'a']++;
			}
			for (i = 0; i < a.length(); i++)
			{
				if (tim[a.charAt(i) - 'a'] == 1)
				{
					System.out.print(a.charAt(i));
					System.out.print("\n");
					tell = 1;
					break;
				}
			}
			if (tell == 0)
			{
				System.out.print("no");
				System.out.print("\n");
			}
		}
		return 0;
	}
}

