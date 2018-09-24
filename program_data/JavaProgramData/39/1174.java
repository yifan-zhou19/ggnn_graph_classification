package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct student
	//	{
	//		char name[20];
	//		int scores1,scores2,paper;
	//		char a,b;
	//	}
	//	s[100];
		int[] p = new int[100];
		int i;
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				s[i].name = tempVar2;
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				s[i].scores1 = tempVar3;
			}
			String tempVar4 = ConsoleInput.scanfRead(" ");
			if (tempVar4 != null)
			{
				s[i].scores2 = tempVar4;
			}
			String tempVar5 = ConsoleInput.scanfRead(" ", 1);
			if (tempVar5 != null)
			{
				s[i].a = tempVar5;
			}
			String tempVar6 = ConsoleInput.scanfRead(" ", 1);
			if (tempVar6 != null)
			{
				s[i].b = tempVar6;
			}
			String tempVar7 = ConsoleInput.scanfRead(" ");
			if (tempVar7 != null)
			{
				s[i].paper = tempVar7;
			}
		}
		int sum;
		for (i = 0;i < n;i++)
		{
			sum = 0;
			if (s[i].scores1 > 80 && s[i].paper >= 1)
			{
				sum += 8000;
			}
			if (s[i].scores1 > 85 && s[i].scores2 > 80)
			{
				sum += 4000;
			}
			if (s[i].scores1 > 90)
			{
				sum += 2000;
			}
			if (s[i].scores1 > 85 && s[i].b == 'Y')
			{
				sum += 1000;
			}
			if (s[i].scores2 > 80 && s[i].a == 'Y')
			{
				sum += 850;
			}

			p[i] = sum;
		}
		int max = 0;
		int c = 0;
		for (i = 0;i < n;i++)
		{
			if (p[i] >= max)
			{
				max = p[i];
			}
			c += p[i];
		}
		for (i = 0;i < n;i++)
		{
			if (p[i] == max)
			{
				System.out.printf("%s\n%d\n%d\n",s[i].name,p[i],c);
				break;
			}
		}
		return 0;
	}



}

