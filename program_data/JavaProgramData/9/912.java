package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int n;
		int e;
		String q = new String(new char[11]);
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct point
	//	{
	//		char name[11];
	//		int age;
	//	}
	//	p[100];
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
				p[i].name = tempVar2;
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				p[i].age = tempVar3;
			}
		}
		for (j = 0;j < n;j++)
		{
			for (i = 0;i < n - 1;i++)
			{
				if ((p[i].age > 60 || p[i].age == 60) && (p[i + 1].age > 60 || p[i + 1].age == 60) && p[i].age < p[i + 1].age || p[i].age < 60 && (p[i + 1].age>60 || p[i + 1].age == 60))
				{
					e = p[i].age;
					p[i].age = p[i + 1].age;
					p[i + 1].age = e;

					q = p[i].name;
					p[i].name = p[i + 1].name;
					p[i + 1].name = q;
				}
			}
		}
		for (i = 0;i < n;i++)
		{
			System.out.printf("%s",p[i].name);
			if (i != n - 1)
			{
				System.out.print("\n");
			}
		}
		return 0;
	}

}

