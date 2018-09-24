public class book
{
	public int num;
	public String author = new String(new char[27]);
}

package <missing>;

public class GlobalMembers
{
	public static book[] book = tangible.Arrays.initializeWithDefaultbookInstances(1000);

	public static void Main()
	{
		int m;
		int i;
		int j;
		int k;
		String s = new String(new char[26]);
		int[] w = new int[26];
		int[] len = new int[1000];
		int max;
		int most;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		for (i = 0;i < m;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				book[i].num = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				book[i].author = tempVar3.charAt(0);
			}
		}
		for (i = 0;i < 26;i++)
		{
			s = tangible.StringFunctions.changeCharacter(s, i, 'A' + i);
		}
		for (i = 0;i < m;i++)
		{
			len[i] = String.valueOf(book[i].author).length();
			for (j = 0;j < len[i];j++)
			{
				for (k = 0;k < 26;k++)
				{
					if (book[i].author.charAt(j) == s.charAt(k))
					{
						w[k]++;
					}
				}
			}
		}
		max = w[0];
		most = 0;
		for (i = 0;i < 26;i++)
		{
			if (w[i] > max)
			{
				max = w[i];
				most = i;
			}
		}
		System.out.printf("%c\n%d\n",s.charAt(most),max);
		for (i = 0;i < m;i++)
		{
			len[i] = String.valueOf(book[i].author).length();
			for (j = 0;j < len[i];j++)
			{
				if (book[i].author.charAt(j) == s.charAt(most))
				{
					System.out.printf("%d\n",book[i].num);
				}
			}
		}
	}
}

