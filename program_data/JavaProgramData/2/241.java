package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int k;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}

//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct book
	//	{
	//	int num;
	//	char name[26];
	//	 }
	//	 book[999];

		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				book[i].num = tempVar2;
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				book[i].name = tempVar3;
			}
		}

//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct author
	//	{
	//	char l;
	//	int count;
	//	 }
	//	 au[26];

		for (i = 0;i < 26;i++)
		{
			au[i].l = 65 + i;
		  au[i].count = 0;
		}

		for (i = 0;i < 26;i++)
		{
			for (j = 0;j < n;j++)
			{
				for (k = 0;k < 26;k++)
				{
					 if (au[i].l == book[j].name[k])
					 {
						 au[i].count++;
					  break;
					 }
				}
			}
		}

		int max = 0;
		for (i = 1;i < 26;i++)
		{
			if (au[max].count < au[i].count)
			{
			   max = i;
			}
		}
		System.out.printf("%c\n%d\n",au[max].l,au[max].count);

		for (j = 0;j < n;j++)
		{
			for (k = 0;k < 26;k++)
			{
		   if (au[max].l == book[j].name[k])
		   {
				  System.out.printf("%d\n",book[j].num);
				break;
		   }
			}
		}
		return 0;
	}

}

