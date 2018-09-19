package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct book1
	//	{
	//		int num;
	//		char author[20];
	//	}
	//	book[999];
		int[] time = new int[26];
		int n;
		int i;
		int j;
		int k;
		int maxi;
		int sign = 0;
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
				book[i].num = tempVar2;
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				book[i].author = tempVar3;
			}
		}
		for (i = 0;i < n;i++)
		{
			for (j = 0;book[i].author[j] != '\0';j++)
			{
				for (k = 0;k < 26;k++)
				{
					if (book[i].author[j] == 'A' + k)
					{
						time[k] += 1;
						break;
					}
				}
			}
		}
		maxi = 0;
		for (i = 0;i < 26;i++)
		{
			if (time[maxi] < time[i])
			{
				maxi = i;
			}
		}
		System.out.printf("%c\n%d\n", 'A' + maxi, time[maxi]);
		for (i = 0;i < n && sign == 0;i++)
		{
			for (j = 0;book[i].author[j] != '\0';j++)
			{
				if (book[i].author[j] == 'A' + maxi)
				{
					System.out.printf("\n%d", book[i].num);
					sign = 1;
					break;
				}
			}
		}
		for (;i < n;i++)
		{
			for (j = 0;book[i].author[j] != '\0';j++)
			{
				if (book[i].author[j] == 'A' + maxi)
				{
					System.out.printf("\n%d", book[i].num);
					break;
				}
			}
		}
		return 0;
	}
}

