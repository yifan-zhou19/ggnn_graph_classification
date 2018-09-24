package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		int[] s = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct book
	//	{
	//		int a;
	//		char name[27];
	//	};
		book[] list = tangible.Arrays.initializeWithDefaultbookInstances(999);
		char c;
		int n;
		int i;
		int j;
		int b;
		int maxnum = 0;
		int max;
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
				list[i].a = tempVar2;
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				list[i].name = tempVar3;
			}
			for (j = 0;list[i].name[j] != '\0';j++)
			{
				c = list[i].name[j];
				b = c - 'A';
				s[b]++;
			}
		}
		for (i = 0;i < 26;i++)
		{
			if (s[i] > maxnum)
			{
			maxnum = s[i];
			max = i;
			}
		}
		System.out.printf("%c\n%d\n",'A' + max,maxnum);
		for (i = 0;i < n;i++)
		{
			for (j = 0;list[i].name[j] != '\0';j++)
			{
				if (list[i].name[j] - 'A' == max)
				{
					System.out.printf("%d\n",list[i].a);
				}
			}
		}

	}

}

