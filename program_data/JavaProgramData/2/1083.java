public class author
{
	public char id;
	public int count;
	public int[] books = new int[1000];
}

package <missing>;

public class GlobalMembers
{
	public static int cmp(Object a, Object b)
	{
		author pa = (struct author) a;
		author pb = (struct author) b;
		return pb.count - pa.count;
	}

	public static int Main()
	{
		int i;
		int j;
		int num;
		int id;
		int len;
		int idx;
		author[] authors = tangible.Arrays.initializeWithDefaultauthorInstances(26); // 'A' -- 'Z'
		char c;
		String buffer = new String(new char[26]);

		for (i = 0; i < 26; ++i)
		{
			authors[i].id = 'A' + i;
			authors[i].count = 0;
		}

		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			num = Integer.parseInt(tempVar);
		}
		for (i = 0; i < num; ++i)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				id = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				buffer = tempVar3.charAt(0);
			}
			len = buffer.length();
			for (j = 0; j < len; ++j)
			{
				idx = buffer.charAt(j) - 'A';
				authors[idx].books[authors[idx].count] = id;
				authors[idx].count++;
			}
		}

//C++ TO JAVA CONVERTER TODO TASK: There is no Java equivalent to 'sizeof':
		qsort(authors, 26, sizeof(author), cmp);

		System.out.printf("%c\n", authors[0].id);
		System.out.printf("%d\n", authors[0].count);
		for (i = 0; i < authors[0].count; ++i)
		{
			System.out.printf("%d\n", authors[0].books[i]);
		}
	}

}

