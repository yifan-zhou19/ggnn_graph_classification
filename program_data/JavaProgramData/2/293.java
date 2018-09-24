package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct book
	//	{
	//		int m;
	//		char a[26];
	//	};
		int n;
		int i;
		int j;
		int k;
		int q = 0;
		int[] b = new int[26];
		int[] c = new int[26];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		book[] p;
		p = tangible.Arrays.initializeWithDefaultbookInstances(n);
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				p[i].m = tempVar2;
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				p[i].a = tempVar3;
			}
		}
		for (i = 0;i < 26;i++)
		{
			for (j = 0;j < n;j++)
			{
				for (k = 0;k < 26;k++)
				{
					if (p[j].a[k] == 'A' + i)
					{
						b[i] = b[i] + 1;
					}
				}
			}
		}
		for (i = 0;i < 26;i++)
		{
			c[i] = b[i];
		}
		for (j = 0;j < 25;j++)
		{
			for (i = 0;i < 25 - j;i++)
			{
				if (b[i] > b[i + 1])
				{
					k = b[i];
					b[i] = b[i + 1];
					b[i + 1] = k;
				}
			}
		}
		for (i = 0;i < 26;i++)
		{
			if (c[i] == b[25])
			{
				System.out.printf("%c\n%d\n",'A' + i,b[25]);
				for (j = 0;j < n;j++)
				{
					for (k = 0;k < 26;k++)
					{
						if (p[j].a[k] == 'A' + i)
						{
							System.out.printf("%d\n",p[j].m);
						}
					}
				}
			}
		}
			p = null;


	}

}

