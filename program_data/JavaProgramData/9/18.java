package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct m
	//	{
	//	char id[10];
	//	int year;
	//	}
	//	p[100],a[100],tmp;
		int n;
		int i;
		int j;
		int k = 0;
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
			p[i].id = tempVar2;
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			p[i].year = tempVar3;
		}
		if (p[i].year >= 60)
		{
			a[k] = p[i];
			k++;
			p[i].year = 0;
		}
		}
		for (i = 0;i < k;i++)
		{
			for (j = k - 1;j > i;j--)
			{
				if (a[j].year > a[j - 1].year)
				{
				tmp = a[j - 1];
				a[j - 1] = a[j];
				a[j] = tmp;
				}
			}
		}
		for (i = 0;i < k;i++)
		{
		System.out.printf("%s\n",a[i].id);
		}
		for (i = 0;i < n;i++)
		{
		if (p[i].year == 0)
		{
		continue;
		}
		System.out.printf("%s\n",p[i].id);
		}
		return 0;


	}
}

