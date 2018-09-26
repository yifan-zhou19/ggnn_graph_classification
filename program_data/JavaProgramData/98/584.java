package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int i;
		int m = 0;
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct word
	//	{
	//		char word[40];
	//		int len;
	//	}
	//	words[500];
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
				words[i].word = tempVar2;
			}
			words[i].len = String.valueOf(words[i].word).length();
		}
		System.out.printf("%s",words[0].word);
		m = words[0].len;
		for (i = 1;i < n;i++)
		{
			m += (words[i].len + 1);
			if (m <= 80)
			{
				System.out.printf(" %s",words[i].word);
			}
			else
			{
				System.out.print("\n");
				System.out.printf("%s",words[i].word);
				m = words[i].len;
			}
		}
		System.out.print("\n");
	}

}

