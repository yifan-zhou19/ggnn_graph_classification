package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct book
	//	{
	//		int num;
	//		char name[27];
	//	}
	//	b[1000];
		int m;
		int i;
		int j;
		int a = 0;
		int[] c = new int[26];
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
				b[i].num = tempVar2;
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				b[i].name = tempVar3;
			}
		}
		for (i = 0;i < m;i++)
		{
			for (j = 0;j < String.valueOf(b[i].name).length();j++)
			{
				c[*(b[i].name + j) - 'A']++;
			}
		}
		for (i = 0;i < 26;i++)
		{
			a = c[i] > c[a] != 0?i:a;
		}
		System.out.printf("%c\n",a + 'A');
		System.out.printf("%d\n",c[a]);
		for (i = 0;i < m;i++)
		{
			for (j = 0;j < String.valueOf(b[i].name).length();j++)
			{
				if (*(b[i].name + j) == ('A' + a))
				{
					System.out.printf("%d\n",b[i].num);
				}
			}
		}
	return 0;
	}

}

