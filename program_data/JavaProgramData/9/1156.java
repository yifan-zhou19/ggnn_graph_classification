package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int m = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct p
	//	{
	//		char num[10000];
	//		int age;
	//	}
	//	p[100];
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct p1
	//	{
	//		char num1[10000];
	//		int age1;
	//	}
	//	p1[100];
		int i;
		int j;
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				p[i].num = tempVar2;
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				p[i].age = tempVar3;
			}
			if (p[i].age >= 60)
			{
				p1[m].num1 = p[i].num;
				p1[m].age1 = p[i].age;
				m = m + 1;
			}
		}
		int e;
		String w = new String(new char[10000]);
		for (i = 1;i < m;i++)
		{
			for (j = 0;j < m - i;j++)
			{
				if (p1[j].age1 < p1[j + 1].age1)
				{
					w = p1[j + 1].num1;
					p1[j + 1].num1 = p1[j].num1;
					p1[j].num1 = w;
					e = p1[j + 1].age1;
					p1[j + 1].age1 = p1[j].age1;
					p1[j].age1 = e;

				}
			}
		}
		for (i = 0;i < m;i++)
		{
			System.out.printf("%s\n",p1[i].num1);
		}
		for (i = 0;i < n;i++)
		{
			if (p[i].age < 60)
			{
				System.out.printf("%s\n",p[i].num);
			}
		}
		return 0;
	}




}

