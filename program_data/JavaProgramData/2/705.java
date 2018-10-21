package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct writer
	//	{
	//		int sum;
	//		char c;
	//	}
	//	lit[26]={0,'A',0,'B',0,'C',0,'D',0,'E',0,'F',0,'G',0,'H',0,'I',0,'J',0,'K',0,'L',0,'M',0,'N',0,'O',0,'P',0,'Q',0,'R',0,'S',0,'T',0,'U',0,'V',0,'W',0,'X',0,'Y',0,'Z'};
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct book
	//	{
	//		int id;
	//		char name[26];
	//	}
	//	data[1000];
		int i;
		int j;
		int k;
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				data[i].id = tempVar2;
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				data[i].name = tempVar3;
			}
			for (j = 0;data[i].name[j] != '\0';j++)
			{
				for (k = 0;k < 26;k++)
				{
					if (data[i].name[j] == lit[k].c)
					{
						lit[k].sum++;
					}
				}
			}
		}
		for (i = 1;i < 26;i++)
		{
			if (lit[i].sum < lit[i - 1].sum)
			{
				writer tmp = new writer();
				tmp = lit[i - 1];
				lit[i - 1] = lit[i];
				lit[i] = tmp;
			}
		}
		System.out.printf("%c\n%d\n",lit[25].c,lit[25].sum);
		for (i = 0;i < n;i++)
		{
			for (j = 0;data[i].name[j] != '\0';j++)
			{
				if (data[i].name[j] == lit[25].c)
				{
					System.out.printf("%d\n",data[i].id);
				}
			}
		}
		return 0;
	}

}

