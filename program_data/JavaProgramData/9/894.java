package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct point
	//	{
	//		char id[10];
	//		int age;
	//	}
	//	points[100],news[100],tmp;
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				points[i].id = tempVar2;
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				points[i].age = tempVar3;
			}
		}
		for (i = n - 1;i >= 0;i--)
		{
			for (j = 0;j < i;j++)
			{
				if (points[j + 1].age >= 60 && points[j + 1].age > points[j].age)
				{
					tmp = points[j + 1];
					points[j + 1] = points[j];
					points[j] = tmp;
				}
			}
		}

		for (i = 0;i < n;i++)
		{
			System.out.printf("%s\n",points[i].id);
		}
		return 0;
	}
}

