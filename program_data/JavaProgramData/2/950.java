public class book
{
	public int num;
	public String author = new String(new char[26]);
}

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int i;
		book[] book = tangible.Arrays.initializeWithDefaultbookInstances(1000);
		for (i = 0;i < n;i++)
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
		int[] b = new int[26];
		for (i = 0;i < n;i++)
		{
			int l;
			l = String.valueOf(book[i].author).length();
			int j;
			for (j = 0;j < l;j++)
			{
				b[book[i].author.charAt(j) - 65] = b[book[i].author.charAt(j) - 65] + 1;
			}
		}
		int max = b[0];
		for (i = 0;i < 26;i++)
		{
			if (b[i] > max)
			{
				max = b[i];
			}
		}
		for (i = 0;i < 26;i++)
		{
			if (b[i] == max)
			{
				break;
			}
		}
		char p;
		p = i + 65;
		System.out.printf("%c\n%d\n",p,max);
		for (i = 0;i < n;i++)
		{
			int j;
			int l;
			l = String.valueOf(book[i].author).length();
			for (j = 0;j < l;j++)
			{
				if (book[i].author.charAt(j) == p)
				{
					System.out.printf("%d\n",book[i].num);
					break;
				}
				else if (book[i].author.charAt(j) != p && j == l - 1)
				{
					break;
				}
			}
		}
		return 0;
	} //????????





}

