package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int max = 0;
		int[] zuozhe = new int[26];
		char maxer;
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct book
	//	{
	//		 int num;
	//		 char author[26];
	//	}
	//	shu[1000];
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
				shu[i].num = tempVar2;
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				shu[i].author = tempVar3;
			}
			for (j = 0;j < 26;j++)
			{
			   zuozhe[shu[i].author[j] - 65]++;
			}
		}
		for (j = 0;j < 26;j++)
		{
			if (zuozhe[j] > max)
			{
				max = zuozhe[j];
				maxer = j + 65;
			}
		}
		System.out.printf("%c\n%d\n",maxer,max);
		for (i = 0;i < n;i++)
		{
			for (j = 0;j < 26;j++)
			{
				if (shu[i].author[j] == maxer)
				{
					System.out.printf("%d\n",shu[i].num);
					continue;
				}
			}
		}
	}

}

