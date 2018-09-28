package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct ren
	//	{
	//		char id[10];
	//		int age;
	//	}
	//	p[100];
		ren t = new ren();
		int i;
		int j;
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
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				p[i].age = tempVar3;
			}
		}
		for (i = 0;i < n - 1;i++)
		{
			for (j = 0;j < n - 1 - i;j++)
			{
				if (p[j].age < p[j + 1].age && p[j + 1].age >= 60)
				{
					t = p[j];
					p[j] = p[j + 1];
					p[j + 1] = t;
				}
			}
		}
		for (i = 0;i < n;i++)
		{
		System.out.printf("%s\n",p[i].id);
		}

		return 0;
	}

}

