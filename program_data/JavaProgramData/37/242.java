package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] hash = new int[26];
		int flag;
		int t;
		int i;
		int j;
		String a = new String(new char[10001]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			t = Integer.parseInt(tempVar);
		}
		System.in.read();
		for (i = 0; i < t; ++i)
		{
			a = new Scanner(System.in).nextLine();
			for (j = 0; j < 26; ++j)
			{
				hash[j] = 0;
			}
			for (j = 0; a.charAt(j) ; ++j)
			{
				if (a.charAt(j) != '\n')
				{
					++hash[a.charAt(j) - 'a'];
				}
			}
			flag = 1;
			for (j = 0; a.charAt(j) ; ++j)
			{
				if (hash[a.charAt(j) - 'a'] == 1)
				{
					System.out.printf("%c\n",a.charAt(j));
					flag = 0;
					break;
				}
			}
			if (flag != 0)
			{
				System.out.print("no\n");
			}
		}

		System.in.read();
		System.in.read();
		return 0;
	}

}

