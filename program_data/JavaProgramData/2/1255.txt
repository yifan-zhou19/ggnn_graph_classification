public class book
{
	public String num = new String(new char[4]);
	public String author = new String(new char[27]);
}

package <missing>;

public class GlobalMembers
{
	public static book[] book = tangible.Arrays.initializeWithDefaultbookInstances(100);
	public static int Main()
	{
		int n;
		int i;
		int k;
		int[] sz = new int[26];
		int t;
		int m;
		int e;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		m = 0;
		for (i = 0;i < 26;i++)
		{
			sz[i] = 0;
		}
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				book[i].num = tempVar2.charAt(0);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				book[i].author = tempVar3.charAt(0);
			}
			t = String.valueOf(book[i].author).length();
			for (k = 0;k < t;k++)
			{
					sz[book[i].author.charAt(k) - 'A']++;
			}
		}
		for (i = 0;i < 26;i++)
		{
			if (sz[i] > m)
			{
				m = sz[i];
				e = i;
			}
		}
		System.out.printf("%c\n%d\n",e + 'A',m);
		for (i = 0;i < n;i++)
		{
			t = String.valueOf(book[i].author).length();
			for (k = 0;k < t;k++)
			{
				if (book[i].author.charAt(k) == e + 'A')
				{
					System.out.printf("%s\n",book[i].num);
				}
			}
		}
		return 0;
	}
}

