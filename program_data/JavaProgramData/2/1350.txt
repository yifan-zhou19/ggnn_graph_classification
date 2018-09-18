public class book
{
	public int id;
	public String peo = new String(new char[26]);
}

package <missing>;

public class GlobalMembers
{
	public static book[] book1 = tangible.Arrays.initializeWithDefaultbookInstances(999);
	public static int Main()
	{
		int n;
		int i;
		int j;
		int m = 0;
		int[] num = new int[26];
		int length;
		int max = 0;
		int t;
		char author;
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
				book1[i].id = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				book1[i].peo = tempVar3.charAt(0);
			}
		}
		for (i = 0;i < n;i++)
		{
			length = String.valueOf(book1[i].peo).length();
			for (j = 0;j < length;j++)
			{
				num[(int)(book1[i].peo.charAt(j) - 'A')]++;
			}
		}
		for (i = 0;i < 26;i++)
		{
			if (num[i] > max)
			{
				max = num[i];
				t = i;
				author = i + 'A';
			}
		}
		System.out.printf("%c\n%d\n",author,num[t]);
		for (i = 0;i < n;i++)
		{
			length = String.valueOf(book1[i].peo).length();
			for (j = 0;j < length;j++)
			{
				if (book1[i].peo.charAt(j) == author)
				{
					System.out.printf("%d\n",book1[i].id);
				}
			}
		}
		return 0;
	}

}

