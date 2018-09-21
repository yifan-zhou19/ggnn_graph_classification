package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String newWord = new String(new char[50]);
		char ch;
		String shortest = new String(new char[50]);
		String longest = new String(new char[50]);
		int slen = 1000;
		int llen = 0;
		int i;
		int index = 0;
		int len;
		int charlen;
		while (true)
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				newWord = tempVar.charAt(0);
			}
			String tempVar2 = ConsoleInput.scanfRead(null, 1);
			if (tempVar2 != null)
			{
				ch = tempVar2.charAt(0);
			}
			len = newWord.length();
			if (len > llen)
			{
					longest = newWord;
					llen = len;
			}
				if (len < slen && len>0)
				{
					shortest = newWord;
					slen = len;
				}
			if (ch == '\n')
			{
				break;
			}
		}
		System.out.printf("%s\n",longest);
		System.out.printf("%s\n",shortest);
		return 0;
	}
}

