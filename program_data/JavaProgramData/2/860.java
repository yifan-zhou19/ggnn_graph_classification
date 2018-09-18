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
	//	book[999];
		int m;
		int i;
		int n;
		int j;
		int max;
		String a = new String(new char[26]);
		String c = new String(new char[26]);
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
				book[i].num = tempVar2;
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				book[i].writer = tempVar3;
			}
		}
		for (i = 0;i < 26;i++)
		{
			a = tangible.StringFunctions.changeCharacter(a, i, i + 65);
			c = c.substring(0, i);
		}
		for (i = 0;i < 26;i++)
		{
			for (j = 0;j < m;j++)
			{
				for (n = 0;n < 26;n++)
				{
					if (a.charAt(i) == book[j].writer[n])
					{
						c.charAt(i)++;
					}
				}
			}
		}
		max = 0;
		for (i = 0;i < 26;i++)
		{
			if (c.charAt(i) > c.charAt(max))
			{
				max = i;
			}
		}
		System.out.printf("%c\n%d\n",a.charAt(max),c.charAt(max));
		for (i = 0;i < m;i++)
		{
			for (j = 0;j < 26;j++)
			{
				if (book[i].writer[j] == a.charAt(max))
				{
					System.out.printf("%d\n",book[i].num);
				}
			}
		}
		return 0;
	}
}

