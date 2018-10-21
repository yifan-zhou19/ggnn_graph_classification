package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String word = new String(new char[max]);
		int p;
		int n;
		int i;
		void del(int x,char word.charAt(max));
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 1;i <= n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				word = tempVar2.charAt(0);
			}
			p = word.length() - 1;
			del(p, word);
			System.out.printf("%s\n",word);
		}
	}

	public static void del(int x, String word)
	{
		if (word[x].equals('g'))
		{
			word[x - 2] = null;
		}
		else
		{
			word[x - 1] = null;
		}
	}
}

