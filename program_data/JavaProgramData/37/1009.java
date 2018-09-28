package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int t;
		String c = new String(new char[100000]);
		String store = new String(new char[30]);
		char count = char ch[];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			t = Integer.parseInt(tempVar);
		}
		for (i = 0;i < t;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				c = tempVar2.charAt(0);
			}
			store = tangible.StringFunctions.changeCharacter(store, i, count(c));
		}
		for (i = 0;i < t;i++)
		{
			if (store.charAt(i) != '\0')
			{
				System.out.printf("%c\n",store.charAt(i));
			}
			else
			{
				System.out.print("no\n");
			}
		}
		return 0;
	}

	public static char count(String ch)
	{
		int i;
		int j;
		int count;
		int length;
		length = ch.length();
		for (i = 0;i < length;i++)
		{
			count = 0;
			for (j = 0;j < length;j++)
			{
				if (ch[i].equals(ch[j]))
				{
					count = count + 1;
				}
			}
			if (count == 1)
			{
				return ch[i];
			}
		}
		if (count != 1)
		{
			return '\0';
		}
	}

}

