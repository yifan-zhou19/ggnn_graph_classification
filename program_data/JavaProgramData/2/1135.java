package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m;
		int i;
		int j;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}

//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct Bookinfo
	//	{
	//		int number;
	//		char auther[27];
	//	};

		Bookinfo[] a = tangible.Arrays.initializeWithDefaultBookinfoInstances(1000);
		for (i = 0;i < m;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[i].number = tempVar2;
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				a[i].auther = tempVar3;
			}
		}

//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct Author
	//	{
	//		int count;
	//		int number[1000];
	//	};

		Author[] b = tangible.Arrays.initializeWithDefaultAuthorInstances(26);
		for (i = 0;i < 26;i++)
		{
			b[i].count = 0;
		}
		int max;
		int record;

		for (i = 0;i < m;i++)
		{
			int k;
			k = String.valueOf(a[i].auther).length();
			for (j = 0;j < k;j++)
			{
				b[a[i].auther[j] - 'A'].number[b[a[i].auther[j] - 'A'].count] = a[i].number;
				b[a[i].auther[j] - 'A'].count++;
			}
		}

		max = b[0].count;
		for (i = 0;i < 26;i++)
		{
			if (b[i].count >= max)
			{
				max = b[i].count;
				record = i;
			}
		}
		System.out.printf("%c\n%d\n",record + 'A',max);
		for (i = 0;i < max;i++)
		{
			System.out.printf("%d\n",b[record].number[i]);
		}
		return 0;
	}
}

