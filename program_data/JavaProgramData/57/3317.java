package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int i;
		String word = new String(new char[30]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				word = tempVar2.charAt(0);
			}
			if (!strcmp(word + word.length() - 2,"er") || !strcmp(word + word.length() - 2,"ly"))
			{
				word = word.substring(0, word.length() - 2);
			}
			else if (!strcmp(word + word.length() - 3,"ing"))
			{
				word = word.substring(0, word.length() - 3);
			}
			System.out.println(word);
		}
	}
}

