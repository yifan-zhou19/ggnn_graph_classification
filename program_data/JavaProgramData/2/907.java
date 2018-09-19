package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct bookinf
	//	{
	//		int code;
	//		char auth[27];
	//	}
	//	book[999];
		int i;
		int k;
		int m;
		int max = 0;
		int[] num = new int[26];
		for (i = 0;i < 26;i++)
		{
			num[i] = 0;
		}
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
				book[i].code = tempVar2;
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				book[i].auth = tempVar3;
			}
			for (k = 0;book[i].auth[k] != '\0';k++)
			{
					num[book[i].auth[k] - 'A'] += 1;
			}
		}
		for (i = 1;i < 26;i++)
		{
			if (num[i] > num[max])
			{
				max = i;
			}
		}
		System.out.printf("%c\n%d\n", max + 'A', num[max]);
		for (i = 0;i < m;i++)
		{
			for (k = 0;book[i].auth[k] != '\0';k++)
			{
				if (book[i].auth[k] == max + 'A')
				{
					System.out.printf("%d\n", book[i].code);
					break;
				}
			}
		}
		return 0;
	}


}

