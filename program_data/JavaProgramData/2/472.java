public class Book
{
	public int id;
	public String author = new String(new char[26]);
	public int flag;
}

package <missing>;

public class GlobalMembers
{
	public static Book[] book = tangible.Arrays.initializeWithDefaultBookInstances(1000);
	public static int Main()
	{
		int n;
		int i;
		int j;
		int l;
		int max;
		int maxnum;
		int num = 0;
		int[] a = new int[26];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0; i < n; i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				book[i].id = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				book[i].author = tempVar3.charAt(0);
			}
			l = String.valueOf(book[i].author).length();
			for (j = 0; j < l; j++)
			{
				a[book[i].author.charAt(j) - 65]++;
			}

		}
		max = 0;
		maxnum = 0;
		for (i = 0; i < 26; i++)
		{
			if (a[i] > max)
			{
				max = a[i];
				maxnum = i;
			}
		}
		System.out.printf("%c\n", maxnum + 65);
		for (i = 0; i < n; i++)
		{
			book[i].flag = 0;
			l = String.valueOf(book[i].author).length();
			for (j = 0; j < l; j++)
			{
				if (book[i].author.charAt(j) == maxnum + 65)
				{
					num++;
					book[i].flag = 1;
					break;
				}
			}
		}
		System.out.printf("%d\n", num);
		for (i = 0; i < n; i++)
		{
			if (book[i].flag == 1)
			{
				System.out.printf("%d\n", book[i].id);
			}
		}
		return 0;
	}
}

