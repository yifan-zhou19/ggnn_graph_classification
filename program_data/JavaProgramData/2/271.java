package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct book
	//	{
	//		int num;
	//		char writer[26];
	//	}
	//	bookn[999];
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct zuozhe
	//	{
	//		char w;
	//		int count;
	//	}
	//	zuozhen[26];
		int n;
		int i;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < 26;i++)
		{
			zuozhen[i].w = 'A' + i;
			zuozhen[i].count = 0;
		}
		int h = 0;
		int m;
		int j;
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				bookn[i].num = tempVar2;
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				bookn[i].writer = tempVar3;
			}
			m = String.valueOf(bookn[i].writer).length();
			for (j = 0;j < m;j++)
			{
				h = bookn[i].writer[j] - 'A';
				zuozhen[h].count++;
			}
		}
		zuozhe a = new zuozhe();
		a = zuozhen[0];
		for (i = 1;i < 26;i++)
		{
			if (a.count < zuozhen[i].count)
			{
				a = zuozhen[i];
			}
		}
		System.out.printf("%c\n",a.w);
		System.out.printf("%d\n",a.count);
		int t;
		for (i = 0;i < n;i++)
		{
			t = String.valueOf(bookn[i].writer).length();
			for (j = 0;j < t;j++)
			{
				if (bookn[i].writer[j] == a.w)
				{
					System.out.printf("%d\n",bookn[i].num);
				}
			}
		}
	}






}

