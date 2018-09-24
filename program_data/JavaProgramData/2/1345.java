package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct bookst
	//	{
	//		int Num;
	//		char name[26];
	//	};
		bookst[] book;
		int[] cnt = new int[26];
		int num;
		int i;
		int j;
		int max = 0;
		int max_idx = 0;
		for (i = 0;i < 26;i++)
		{
			cnt[i] = 0;
		}
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			num = Integer.parseInt(tempVar);
		}
		book = tangible.Arrays.initializeWithDefaultbookstInstances(num);
		for (i = 0;i < num;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				book[i].Num = tempVar2;
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				book[i].name = tempVar3;
			}
			for (j = 0;book[i].name[j] != 0;j++)
			{
				cnt[book[i].name[j] - 'A']++;
			}
		}
		for (i = 0;i < 26;i++)
		{
			if (cnt[i] > max)
			{
				max = cnt[i];
				max_idx = i;
			}
		}
		System.out.printf("%c\n%d\n",'A' + max_idx,max);
		for (i = 0;i < num;i++)
		{
			for (j = 0;book[i].name[j] != 0;j++)
			{
				if (book[i].name[j] == 'A' + max_idx)
				{
					System.out.printf("%d\n",book[i].Num);
				}
			}
		}
		return 0;
	}
}

