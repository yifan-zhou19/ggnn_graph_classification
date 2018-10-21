package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int i;
		int j;
		int[] t = new int[26];
		int k = 0;
		int max;
		int h;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}

//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct book
	//	{
	//		int a;
	//		char b[26];
	//	}
	//	book[100]={0,""};


		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				book[i].a = tempVar2;
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				book[i].b = tempVar3;
			}
		}

		for (i = 0;i < n;i++)
		{
			k = String.valueOf(book[i].b).length();
			for (j = 0;j < k;j++)
			{
				t[book[i].b[j] - 65]++;
			}
		}
		max = 0;
		for (i = 0;i < 26;i++)
		{
			//printf("%d ",t[i]);
			if (t[i] > max)
			{
				max = t[i];
				 h = i;
			}
		}
		System.out.printf("%c\n%d\n",h + 65,max);
		for (i = 0;i < n;i++)
		{
			k = String.valueOf(book[i].b).length();
			for (j = 0;j < k;j++)
			{
				if (book[i].b[j] == h + 65)
				{
					System.out.printf("%d\n",book[i].a);
				}
			}
		}

	}
}

