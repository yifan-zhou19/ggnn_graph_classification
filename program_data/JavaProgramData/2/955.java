public class book
{
	   public String num = new String(new char[4]);
	   public String author = new String(new char[26]);
}

package <missing>;

public class GlobalMembers
{
	public static book[] book = tangible.Arrays.initializeWithDefaultbookInstances(999);
	public static int Main()
	{
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int i;
		int j;
		int a;
		char c;
		int max = 0;
		for (i = 0;i <= n - 1;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				book[i].num = tempVar2.charAt(0);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				book[i].author = tempVar3.charAt(0);
			}
		}
		int[] s = new int[26];
		for (i = 0;i <= 25;i++)
		{
			s[i] = 0;
		}
		for (i = 0;i <= n - 1;i++)
		{
			for (j = 0;j <= 25;j++)
			{
				if (0 <= (book[i].author.charAt(j) - 'A') && (book[i].author.charAt(j) - 'A') <= 25)
				{
																			a = book[i].author.charAt(j) - 'A';
																			s[a] = s[a] + 1;
				}
			}
		}

		for (i = 0;i <= 25;i++)
		{
			if (max < s[i])
			{
						 max = s[i];
			}
		}
		for (i = 0;i <= 25;i++)
		{
			if (max == s[i])
			{
						  c = 'A' + i;
			}
		}
		System.out.printf("%c\n", c);
		System.out.printf("%d\n", max);
		for (i = 0;i <= n - 1;i++)
		{
			for (j = 0;j <= 25;j++)
			{
				if (book[i].author.charAt(j) == c)
				{
										 System.out.printf("%s\n", book[i].num);
				}
			}
		}

		return 0;
	}


}

