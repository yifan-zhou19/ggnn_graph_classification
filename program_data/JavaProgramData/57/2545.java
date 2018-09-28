package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 1;i <= n;i++)
		{
			String word = new String(new char[32]);
			final String word1 = "";
			char c;
		int t;
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			word = tempVar2.charAt(0);
		}
		t = word.length();
		c = word.charAt(t - 1);
		if (c == 'g')
		{
			word1 = word.substring(0, t - 3);
			System.out.printf("%s\n",word1);
		}
		else
		{
			word1 = word.substring(0, t - 2);
		System.out.printf("%s\n",word1);
		}
		}
		return 0;
	}

}

