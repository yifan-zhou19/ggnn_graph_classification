public class book
{
	public int num;
	public String author = new String(new char[27]);
}

package <missing>;

public class GlobalMembers
{
	public static book[] book = tangible.Arrays.initializeWithDefaultbookInstances(1000);

	public static int Main()
	{
		int n;
		int i;
		int a;
		int max = 0;
		int[] alp = new int[26];
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * j;

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
				book[i].num = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				book[i].author = tempVar3.charAt(0);
			}
			int len = String.valueOf(book[i].author).length();
			for (j = book[i].author;j < (book[i].author.Substring(len));j++)
			{
				int x = j;
				++alp[x - 65];
				if (alp[x - 65] > max)
				{
					max = (alp + x - 65);
					a = x;
				}
			}
		}

		System.out.printf("%c\n%d\n", a, max);

		for (i = 0;i < n;i++)
		{
			int len = String.valueOf(book[i].author).length();
			for (j = book[i].author;j < (book[i].author.Substring(len));j++)
			{
				if ((int) * j == a)
				{
					System.out.printf("%d\n", book[i].num);
				}
			}
		}

		return 0;
	}

}

