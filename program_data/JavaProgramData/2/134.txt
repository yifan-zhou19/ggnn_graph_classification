package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct Book
	//	{
	//		int id;
	//		char zz[26];
	//	}
	//	book[1000];

		int n;
		int i;
		int j;
		int max = 0;
		int index;
		int[] sum = new int[26];
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
				book[i].id = tempVar2;
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				book[i].zz = tempVar3;
			}
		}

		for (i = 0;i < n;i++)
		{
			for (j = 0;book[i].zz[j] != '\0';j++)
			{
				sum[book[i].zz[j] - 'A']++;
			}
		}

		for (i = 0;i < 26;i++)
		{
			if (sum[i] > max)
			{
				max = sum[i];
				author = 'A' + i;
			}
		}
		System.out.printf("%c\n%d\n",author,max);

		for (i = 0;i < n;i++)
		{
			for (j = 0;book[i].zz[j] != '\0';j++)
			{
				if (book[i].zz[j] == author)
				{
					System.out.printf("%d\n",book[i].id);
					break;
				}
			}
		}
		return 0;
	}
}

