package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct patient
	//	{
	//		char num[11];
	//		int age;
	//	}
	//	pat[101],t;
		int n;
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
				pat[i].num = tempVar2;
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				pat[i].age = tempVar3;
			}
		}
		for (i = 0;i < n - 1;i++)
		{
			for (j = 0;j < n - 1 - i;j++)
			{
				if ((pat[j].age < 60 && pat[j + 1].age >= 60) || (pat[j].age >= 60 && pat[j + 1].age > pat[j].age))
				{
					t = pat[j];
					pat[j] = pat[j + 1];
					pat[j + 1] = t;
				}
			}
		}
		for (i = 0;i < n;i++)
		{
			System.out.printf("%s\n",pat[i].num);
		}
		return 0;
	}
}

