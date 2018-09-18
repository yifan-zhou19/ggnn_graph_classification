package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m;
		int i;
		int j;
		int a;
		int n;
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct book
	//	{
	//		int no;
	//		char name[30];
	//	}
	//	book[999];
		int[] author1 = new int[30];
		int[] author2 = new int[30];
		char k;
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
				book[i].no = tempVar2;
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				book[i].name = tempVar3;
			}
		}
		for (i = 0;i < m;i++)
		{
			a = String.valueOf(book[i].name).length();
			for (j = 0;j < a;j++)
			{
				for (k = 'A';k <= 'Z';k++)
				{
					if (book[i].name[j] == k)
					{
						author1[(int)k - 65]++;
					}
				}
			}
		}
		for (i = 0;i < 26;i++)
		{
			author2[i] = author1[i];
		}
		for (i = 0;i < 26;i++)
		{
			for (j = i + 1;j < 26;j++)
			{
				if (author1[i] < author1[j])
				{
					int tmp;
					tmp = author1[i];
					author1[i] = author1[j];
					author1[j] = tmp;
				}
			}
		}
		for (i = 0;i < 26;i++)
		{
			if (author2[i] == author1[0])
			{
				System.out.printf("%c\n", (char)(65 + i));
				System.out.printf("%d\n", author1[0]);
				for (j = 0;j < m;j++)
				{
					a = String.valueOf(book[j].name).length();
					for (n = 0;n < a;n++)
					{
						if (book[j].name[n] == (char)(65 + i))
						{
							System.out.printf("%d\n", book[j].no);
							break;
						}
					}
				}
			}
		}
		return 0;
	}

}

