package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct
	//	{
	//		int name;
	//		char author[26];
	//	}
	//	book[999];

		for (i = 0; i < n; i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				book[i].name = tempVar2;
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				book[i].author = tempVar3;
			}
		}

		char t;
		char tmax;
		int max = 0;
		int j;
		int k;
		for (t = 'A'; t <= 'Z'; t++)
		{
			k = 0;
			for (i = 0; i < n; i++)
			{
				for (j = 0; j < String.valueOf(book[i].author).length(); j++)
				{
					if (book[i].author[j] == t)
					{
						k++;
					}
				}
			}
			if (k > max)
			{
				max = k;
				tmax = t;
			}
		}
		System.out.printf("%c\n%d\n", tmax, max);
		for (i = 0; i < n; i++)
		{
			for (j = 0; j < String.valueOf(book[i].author).length(); j++)
			{
				if (book[i].author[j] == tmax)
				{
						System.out.printf("%d\n", book[i].name);
						break;
				}
			}
		}
		return 0;
	}
}

