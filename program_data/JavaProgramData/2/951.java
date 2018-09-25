package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct book
	//	{
	//		int num;
	//		char author[26];
	//	}
	//	list[999],*p;

		int n;
		int[] count = new int[26];
		int i;
		char k = 'A';
		int max;

		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (p = list;p < list + n;p++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				p.num = tempVar2;
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				p.author = tempVar3;
			}
		}

		for (p = list;p < list + n;p++)
		{
			for (i = 0;;i++)
			{
				if (p.author[i] == '\0')
				{
					break;
				}
				else
				{
					count[p.author[i] - 65]++;
				}
			}
		}

		max = count[0];
		for (i = 1;i < 26;i++)
		{
			if (count[i] > max)
			{
				max = count[i];
				k = i + 65;
			}
		}

		System.out.printf("%c\n",k);
		System.out.printf("%d\n",max);

		for (p = list;p < list + n;p++)
		{
			for (i = 0;;i++)
			{
				if (k == p.author[i])
				{
					System.out.printf("%d\n",p.num);
				}
				if (p.author[i] == '\0')
				{
					break;
				}
			}
		}

		return 0;
	}

}

