public class Article
{
	public int number;
	public String author = new String(new char[26]);
}

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		Article[] book = tangible.Arrays.initializeWithDefaultArticleInstances(1000);
		int m;
		int i;
		int j;
		int k;
		int c;
		int max = 0;
		int[] writer = new int[26];

		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		for (i = 0; i < m; i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				book[i].number = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				book[i].author = tempVar3.charAt(0);
			}
		}

		for (i = 0; i < m; i++)
		{
			for (j = 0; j < 26; j++)
			{
				if (book[i].author.charAt(j) >= 'A' && book[i].author.charAt(j) <= 'Z')
				{
					c = book[i].author.charAt(j) - 'A';
					writer[c]++;
				}
			}
		}

		for (i = 0; i < 26; i++)
		{
			if (max < writer[i])
			{
				max = writer[i];
			}
		}

		for (i = 0; i < 26; i++)
		{
			if (max == writer[i])
			{
				System.out.printf("%c\n",i + 'A');
				System.out.printf("%d\n",max);
				for (j = 0; j < m; j++)
				{
					for (k = 0; k < 26; k++)
					{
						if (book[j].author.charAt(k) == i + 'A')
						{
							System.out.printf("%d\n",book[j].number);
						}
					}
				}
				break;
			}
		}
		return 0;
	}
}

