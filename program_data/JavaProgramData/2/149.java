package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct book
	//	{
	//		int a;
	//		char b[20];
	//	}
	//	book[999];
		int n;
		int i;
		int k;
		int max;
		int m;
		int j;
		int p;
		int[] c = new int[999];
		String str1 = new String(new char[20]);
		String str2 = new String(new char[20]);
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
				book[i].a = tempVar2;
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				book[i].b = tempVar3;
			}
			m = String.valueOf(book[i].b).length();
			str1 = book[i].b;
			for (j = 0;j < m;j++)
			{
			c[str1.charAt(j)] = c[str1.charAt(j)] + 1;
			}
		}
		max = 0;
		for (p = 65;p < 91;p++)
		{
			if (c[p] > max)
			{
				max = c[p];
			k = p;
			}
		}
	System.out.printf("%c\n",k);
	System.out.printf("%d\n",max);
	for (i = 0;i < n;i++)
	{
		str2 = book[i].b;
			m = String.valueOf(book[i].b).length();
			for (j = 0;j < m;j++)
			{
				if (str2.charAt(j) == k)
				{
			System.out.printf("%d\n",book[i].a);
				}
			}
	}


	}


}

