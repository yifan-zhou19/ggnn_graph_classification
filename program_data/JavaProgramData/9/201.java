package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct pa
	//	{
	//		char ID[10];
	//		int age;
	//	}
	//	*p;
		int n;
		int i;
		int k;
		int num = 0;
		int m = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
//C++ TO JAVA CONVERTER TODO TASK: There is no Java equivalent to 'sizeof':
		p = (pa)malloc(sizeof(pa) * n);
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				p[i].ID = tempVar2;
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				p[i].age = tempVar3;
			}
			if (p[i].age >= 60)
			{
				num++;
			}
		}

		int w = 0;
		for (i = 0;i < n;i++)
		{
			if (p[i].age >= 60)
			{
				pa q = p[i];
				for (k = i;k > w;k--)
				{
					p[k] = p[k - 1];
				}
				p[w] = q;
				w++;
			}
		}

		for (i = num - 1;i > 0;i--)
		{
			for (k = 0;k < i;k++)
			{
				if (p[k].age < p[k + 1].age)
				{
					pa q = p[k];
					p[k] = p[k + 1];
					p[k + 1] = q;
				}
			}
		}
		for (i = 0;i < n;i++)
		{
			System.out.printf("%s\n",p[i].ID);
		}
		p = null;
		return 0;
	}


}

