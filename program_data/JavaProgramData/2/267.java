package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int i;
		int j;
		int l;
		int max;
		int p;
		int[] a = new int[1000];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct book
	//	{
	//		int m;
	//		char c[27];
	//	};
		book[] b = tangible.Arrays.initializeWithDefaultbookInstances(1000);
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				b[i].m = tempVar2;
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				b[i].c = tempVar3;
			}
		}
		for (i = 0;i < 26;i++)
		{
			a[i] = 0;
		}
		for (i = 0;i < n;i++)
		{
			l = String.valueOf(b[i].c).length();
			for (j = 0;j < l;j++)
			{
				a[b[i].c[j] - 'A']++;
			}
		}
		max = a[0];
		for (i = 0;i < 26;i++)
		{
			if (a[i] > max)
			{
				max = a[i];
			}
		}
		for (i = 0;i < 26;i++)
		{
			if (max == a[i])
			{
				p = i;
			}
		}
		p = p + 'A';
		System.out.printf("%c\n",p);
		System.out.printf("%d\n",max);
		for (i = 0;i < n;i++)
		{
			l = String.valueOf(b[i].c).length();
			for (j = 0;j < l;j++)
			{
				if (b[i].c[j] == p)
				{
					System.out.printf("%d\n",b[i].m);
				}
			}
		}

	}
}

