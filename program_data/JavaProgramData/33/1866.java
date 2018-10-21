package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int len;
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct p
	//	{
	//		char a[256];
	//	}
	//	p[10000];
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
				p[i].a = tempVar2;
			}
		}
		for (i = 0;i < n;i++)
		{
			len = 0;
			len = String.valueOf(p[i].a).length();
			for (j = 0;j < len;j++)
			{
				if (p[i].a[j] == 'A')
				{
					p[i].a[j] = 'T';
				}
				else if (p[i].a[j] == 'T')
				{
					p[i].a[j] = 'A';
				}
				else if (p[i].a[j] == 'G')
				{
					p[i].a[j] = 'C';
				}
				else
				{
					p[i].a[j] = 'G';
				}
			}
		}
		for (i = 0;i < n;i++)
		{
			System.out.printf("%s\n",p[i].a);
		}
		return 0;
	}
}

