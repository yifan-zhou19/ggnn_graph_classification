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
	//	struct
	//	{
	//		int num;
	//		char a[25];
	//	}
	//	book [999];
		int i;
		int j;
		for (i = 0;i <= n - 1;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				book[i].num = tempVar2;
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				book[i].a = tempVar3;
			}
		}
		int[] s = new int[26];
		for (i = 0;i <= n - 1;i++)
		{
			int len = String.valueOf(book[i].a).length();
			for (j = 0;j < len;j++)
			{
				s[book[i].a[j] - 'A']++;
			}
		}
		int max = 0;
		char name;
		for (i = 0;i <= 25;i++)
		{
			if (s[i] > max)
			{
				max = s[i];
				name = 'A' + i;
			}
		}
		System.out.printf("%c\n",name);
		System.out.printf("%d\n",max);
		for (i = 0;i <= n - 1;i++)
		{
			int len = String.valueOf(book[i].a).length();
			for (j = 0;j < len;j++)
			{
				if (book[i].a[j] == name)
				{
					System.out.printf("%d\n",book[i].num);
				}
			}
		}






	}

}

