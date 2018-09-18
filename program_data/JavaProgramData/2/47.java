package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
	int m;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		m = Integer.parseInt(tempVar);
	}
	int i;
	int j;
	int k;
	int x;
	int t;
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//struct book
	//	{
	//		int num;
	//		char w[26];
	//	}
	//	b[1000];

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
				b[i].w = tempVar3;
			}
	}
	int[] c = new int[26];
	for (i = 0;i < 26;i++)
	{
		c[i] = 0;
	}
	for (i = 0;i < 26;i++)
	{
			for (j = 0;j < m;j++)
			{
				for (k = 0;k < 26;k++)
				{
					if (b[j].w[k] != '\0' && b[j].w[k] - i == 'A')
					{
						c[i]++;
					}
				}
			}
	}
	int[] d = new int[26];
	for (i = 0;i < 26;i++)
	{
		d[i] = c[i];
	}
	for (i = 0;i < 25;i++)
	{
			if (d[i] > d[i + 1])
			{
				t = d[i];
				d[i] = d[i + 1];
				d[i + 1] = t;
			}
	}
	for (i = 0;i < 26;i++)
	{
			if (c[i] == d[25])
			{
				x = i;
			}
	}
	System.out.printf("%c\n",'A' + x);
	System.out.printf("%d\n",c[x]);
	for (j = 0;j < m;j++)
	{
			for (k = 0;k < 26;k++)
			{
					if (b[j].w[k] - x == 'A')
					{
						System.out.printf("%d\n",b[j].num);
					}
			}
	}
	}






}

