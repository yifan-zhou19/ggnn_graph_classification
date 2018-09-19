package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		int n;
		int i;
		int j;
		int m;
		int b = 0;
		int max;
		int[] let = new int[26];
		char a;
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct student
	//	{
	//		int num;
	//		char name[26];
	//	}
	//	book[999];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				book[i].num = tempVar2;
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				book[i].name = tempVar3;
			}
		}
		for (i = 0;i < n;i++)
		{
			m = String.valueOf(book[i].name).length();
			for (j = 0;j < m;j++)
			{
				let[book[i].name[j] - 'A']++;
			}
		}
		max = let[0];
		for (i = 0;i < 25;i++)
		{
			if (let[i] > max)
			{
				max = let[i];
				b = i;
			}
		}
		a = b + 'A';
		System.out.printf("%c\n%d\n",a,max);
		for (i = 0;i < n;i++)
		{
			m = String.valueOf(book[i].name).length();
			for (j = 0;j < m;j++)
			{
				if (book[i].name[j] == a)
				{
					System.out.printf("%d\n",book[i].num);
				}
			}
		}
	}

}

