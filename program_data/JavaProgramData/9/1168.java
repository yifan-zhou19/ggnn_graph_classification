package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int t;
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct ill
	//	{
	//		char num[10];
	//		int age,id;
	//	}
	//	man[N],ex;
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
				man[i].num = tempVar2;
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				man[i].age = tempVar3;
			}
			man[i].id = i;
		}
		for (i = 0;i < n;i++)
		{
			for (j = i + 1;j < n;j++)
			{
				if (man[i].age < man[j].age)
				{
					ex = man[i];
					man[i] = man[j];
					man[j] = ex;
				}
			}
		}
		for (i = 0;i < n;i++)
		{
			if (man[i].age < 60)
			{
				t = i;
				break;
			}
		}
		for (i = 0;i < t;i++)
		{
			for (j = i + 1;j < t;j++)
			{
				if (man[i].age == man[j].age && man[i].id > man[j].id)
				{
					ex = man[i];
					man[i] = man[j];
					man[j] = ex;
				}
			}
		}
		for (i = t;i < n;i++)
		{
			for (j = i + 1;j < n;j++)
			{
				if (man[i].id > man[j].id)
				{
					ex = man[i];
					man[i] = man[j];
					man[j] = ex;
				}
			}
		}
		  for (i = 0;i < n;i++)
		  {
			System.out.printf("%s\n",man[i].num);
		  }
		for (i = 0;i < n;i++)
		{
			;
		}
		return 0;
	}
}

