public class library
{
	public int num;
	public String authors = new String(new char[27]);
}

package <missing>;

public class GlobalMembers
{
	public static int[] alpha = new int[26];
	public static library[] books = tangible.Arrays.initializeWithDefaultlibraryInstances(999);
	public static void addauthor(String string)
	{
		int i = 0;
		do
		{
			alpha[string[i] - 'A']++;
		i++;
		} while (String[i] != '\0');
	}
	public static void hewroteit(library book, int maxalpha)
	{
		int i;
		for (i = 0;book.authors.charAt(i) != '\0';i++)
		{
			if (book.authors.charAt(i) - 'A' == maxalpha)
			{
				System.out.printf("%d\n",book.num);
				break;
			}
		}
	}
	public static int Main()
	{
		int m;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		int i;
		for (i = 0;i < m;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				books[i].num = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				books[i].authors = tempVar3.charAt(0);
			}
		}
		for (i = 0;i < m;i++)
		{
			addauthor(books[i].authors);
		}
		int max = 0;
		int maxalpha = 0;
		for (i = 0;i < 26;i++)
		{
			if (alpha[i] > max)
			{
				max = alpha[i];
				maxalpha = i;
			}
		}
		System.out.printf("%c\n%d\n",'A' + maxalpha,max);
		for (i = 0;i < m;i++)
		{
			hewroteit(books[i], maxalpha);
		}
		return 0;
	}




}

