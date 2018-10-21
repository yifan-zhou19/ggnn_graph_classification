package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct book
	//	{
	//	int num;
	//	char s[26];
	//}
	//b[1000];
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//struct author
	//{
	//	int n[1000];
	//	int p;
	//	char c;
	//}
	//a[26],e;

	int i;
	int j;
	int k;
	int m;
	int q;
	int max;
	char d;
	for (i = 0;i < 26;i++)
	{
		a[i].p = 0;
	}
	for (i = 0,d = 'A';i < 26;i++,d++)
	{
		a[i].c = d;
	}
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
			b[i].s = tempVar3;
		}
	}
	for (i = 0;i < m;i++)
	{
		for (j = 0;;j++)
		{
		if (b[i].s[j] == '\0')
		{
		break;
		}
	for (k = 0;k < 26;k++)
	{
		if (b[i].s[j] == a[k].c)
		{
		a[k].n[a[k].p] = b[i].num;
	a[k].p += 1;
		}
	}
		}
	}
	max = a[0].p;
	e = a[0];
	for (i = 0;i < 26;i++)
	{
		if (a[i].p > max)
		{
		e = a[i];
		max = a[i].p;
		}
	}
	System.out.printf("%c\n",e.c);
	System.out.printf("%d\n",e.p);
	for (j = 0;j < e.p;j++)
	{
		System.out.printf("%d\n",e.n[j]);
	}
	}

}

