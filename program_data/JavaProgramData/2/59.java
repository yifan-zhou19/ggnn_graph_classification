package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct book
	//	{
	//		int num;
	//		char author[26];
	//	}
	//	b[999];
		int[] a = new int[26];
		int n;
		int i;
		int j;
		int k;
		int max = 0;
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
				b[i].num = tempVar2;
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				b[i].author = tempVar3;
			}
		}
		for (i = 0;i < 26;i++)
		{
			for (j = 0;j < n;j++)
			{
				k = 0;
				while (b[j].author[k] != '\0')
				{
					if (b[j].author[k] == i + 65)
					{
						a[i]++;
					}
				k++;
				}
			}
		}
		for (i = 0;i < 26;i++)
		{
			if (max < a[i])
			{
				max = a[i];
			}
		}
		i = 0;
		while (max != a[i])
		{
			i++;
		}
		System.out.printf("%c\n%d\n",i + 65,a[i]);
		for (j = 0;j < n;j++)
		{
			k = 0;
		while (b[j].author[k] != i + 65 && b[j].author[k] != '\0')
		{
			k++;
		}
		if (b[j].author[k] == i + 65)
		{
			System.out.printf("%d\n",b[j].num);
		}
		}
	}



}

