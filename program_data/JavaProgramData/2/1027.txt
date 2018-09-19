package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] x = new int[26];
		char c;
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct books
	//	{
	//		int number;
	//		char name[27];
	//	};
		books[] book = tangible.Arrays.initializeWithDefaultbooksInstances(1000);
		int n;
		int i;
		int j;
		int t;
		int max = 0;
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		books * p = new books();
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (p = book;p < book + n;p++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				p.number = tempVar2;
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				p.name = tempVar3;
			}
		}
		for (p = book;p < book + n;p++)
		{
			for (j = 0;j < 26;j++)
			{
				for (i = 65;i <= 90;i++)
				{
					if (p.name[j] == i)
					{
						x[i - 65]++;
					}
				}
			}
		}
		for (i = 0;i < 26;i++)
		{
			if (x[i] > max)
			{
				max = x[i];
			}
		}
		for (i = 0;i < 26;i++)
		{
			if (x[i] == max)
			{
				break;
			}
		}
		c = i + 65;
		System.out.printf("%c\n%d\n",c,max);
		for (i = 0;i < n;i++)
		{
			for (j = 0;j < 26;j++)
			{
				if (book[i].name[j] == c)
				{
					System.out.printf("%d\n",book[i].number);
					break;
				}
			}
		}

		return 0;
	}



}

