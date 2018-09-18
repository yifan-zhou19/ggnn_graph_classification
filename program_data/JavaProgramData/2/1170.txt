package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		char p = 0;
		int m;
		int i;
		int j;
		int[] max = new int[1000];
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct book
	//	{
	//		int num;
	//		char s[27];
	//	}
	//	book[1000];
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(max,0,(Integer.SIZE / Byte.SIZE));
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
				book[i].num = tempVar2;
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				book[i].s = tempVar3;
			}
		}
		for (i = 0;i < m;i++)
		{
			for (j = 0;book[i].s[j];j++)
			{
			if (++max[book[i].s[j]] > max[p])
			{
		p = book[i].s[j];
			}
			}
		}
		System.out.printf("%c\n%d\n",p,max[p]);
		for (i = 0;i < m;i++)
		{
			if (tangible.StringFunctions.strChr(book[i].s,p))
			{
		System.out.printf("%d\n",book[i].num);
			}
		}

			return 0;
	}
}

