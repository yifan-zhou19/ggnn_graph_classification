public class BOOK
{
	public int num;
	public String author = new String(new char[26]);
}

package <missing>;

public class GlobalMembers
{
	public static char maxbook(int[] a)
	{
		int i;
		int j;
		int bookmax = 0;
		for (i = 0;i < 26;i++)
		{
			if (bookmax < a[i])
			{
				bookmax = a[i];
				j = i;
			}
		}
		System.out.printf("%c\n%d\n",'A' + j,bookmax);
		return 'A' + j;
	}

	public static int contain(String author, char max)
	{
		String c = author;
		while (*c != null)
		{
			if (*c == max)
			{
				return 1;
			}
			c = c.Substring(1);
		}
		return 0;
	}

	public static void Main()
	{
		BOOK[] book = tangible.Arrays.initializeWithDefaultBOOKInstances(1000);
		int m;
		int i;
		int j;
		char c;
		char max;
		int[] AtoZ = new int[26];

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
			System.in.read();
			j = 0;
			while ((c = System.in.read()) != '\n')
			{
				book[i].author = tangible.StringFunctions.changeCharacter(book[i].author, j, c);
				AtoZ[c - 'A']++;
				j++;
			}
			book[i].author = tangible.StringFunctions.changeCharacter(book[i].author, j, '\0');
		}
		max = maxbook(AtoZ);

		for (i = 0;i < m;i++)
		{
			if (contain(book[i].author, max) != 0)
			{
				System.out.printf("%d\n",book[i].num);
			}
		}
	}

}

