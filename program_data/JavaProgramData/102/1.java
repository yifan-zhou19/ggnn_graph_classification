package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct student
	//	{
	//		char gender[7];
	//		float height;
	//	}
	//	students[40], ts;
		int n;
		int i;
		int j;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0; i < n; i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				students[i].gender = tempVar2;
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				students[i].height = tempVar3;
			}
		}
		for (i = 0; i < n; i++)
		{
			for (j = i + 1; j < n; j++)
			{
				int ex = 0;
				if (students[i].gender[0] == 'f' && students[j].gender[0] == 'm')
				{
					ex = 1;
				}
				else if (students[i].gender[0] == 'm' && students[j].gender[0] == 'm')
				{
					ex = (students[i].height > students[j].height);
				}
				else if (students[i].gender[0] == 'f' && students[j].gender[0] == 'f')
				{
					ex = (students[i].height < students[j].height);
				}
				if (ex != 0)
				{
					ts = students[i];
					students[i] = students[j];
					students[j] = ts;
				}
			}
		}
		for (i = 0; i < n; i++)
		{
			if (i == 0)
			{
				System.out.printf("%.2f", students[i].height);
			}
			else
			{
				System.out.printf(" %.2f", students[i].height);
			}
		}
		return 0;
	}
}

