package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct student
	//	{
	//		char name[20];
	//		int qimo;
	//		int banji;
	//		char ganbu;
	//		char xibu;
	//		int lunwen;
	//	};
		int i;
		int n;
		int[] count = new int[100];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}

		student pp;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
//C++ TO JAVA CONVERTER TODO TASK: There is no Java equivalent to 'sizeof':
		pp = (student)malloc(sizeof(student) * n);
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				(pp + i).name = tempVar2;
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				((pp + i).qimo) = tempVar3;
			}
			String tempVar4 = ConsoleInput.scanfRead(" ");
			if (tempVar4 != null)
			{
				((pp + i).banji) = tempVar4;
			}
			String tempVar5 = ConsoleInput.scanfRead(" ", 1);
			if (tempVar5 != null)
			{
				((pp + i).ganbu) = tempVar5;
			}
			String tempVar6 = ConsoleInput.scanfRead(" ", 1);
			if (tempVar6 != null)
			{
				((pp + i).xibu) = tempVar6;
			}
			String tempVar7 = ConsoleInput.scanfRead(" ");
			if (tempVar7 != null)
			{
				((pp + i).lunwen) = tempVar7;
			}
		}
		for (i = 0;i < n;i++)
		{
			if ((pp[i].qimo > 80) && (pp[i].lunwen >= 1))
			{
				count[i] += 8000;
			}
			if ((pp[i].qimo > 85) && (pp[i].banji > 80))
			{
				count[i] += 4000;
			}
			if (pp[i].qimo > 90)
			{
				count[i] += 2000;
			}
			if ((pp[i].qimo > 85) && (pp[i].xibu == 'Y'))
			{
				count[i] += 1000;
			}
			if ((pp[i].banji > 80) && (pp[i].ganbu == 'Y'))
			{
				count[i] += 850;
			}
		}
		int max = count[0];
		int p = 0;
		int sum = 0;
		for (i = 0;i < n;i++)
		{
			sum += count[i];
			if (max < count[i])
			{
				max = count[i];
				p = i;
			}
		}
		System.out.printf("%s\n%d\n%d\n",(pp + p).name,max,sum);
		return 0;
	}

}

