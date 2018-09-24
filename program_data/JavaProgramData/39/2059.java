package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int N;
		int i;
		int g = 0;
		int[] n = new int[100];
		int h;
		int sum = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			N = Integer.parseInt(tempVar);
		}
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct student
	//	{
	//		char name[20];
	//		int x,y;
	//		char p,q;
	//		int z;
	//	}
	//	s[100];
		for (i = 0;i < N;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				s[i].name = tempVar2;
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				s[i].x = tempVar3;
			}
			String tempVar4 = ConsoleInput.scanfRead(" ");
			if (tempVar4 != null)
			{
				s[i].y = tempVar4;
			}
			String tempVar5 = ConsoleInput.scanfRead(" ", 1);
			if (tempVar5 != null)
			{
				s[i].p = tempVar5;
			}
			String tempVar6 = ConsoleInput.scanfRead(" ", 1);
			if (tempVar6 != null)
			{
				s[i].q = tempVar6;
			}
			String tempVar7 = ConsoleInput.scanfRead(" ");
			if (tempVar7 != null)
			{
				s[i].z = tempVar7;
			}
			if ((s[i].x > 80) && (s[i].z > 0))
			{
				n[i] += 8000;
			}
			if ((s[i].x > 85) && (s[i].y > 80))
			{
				n[i] += 4000;
			}
			if (s[i].x > 90)
			{
				n[i] += 2000;
			}
			if ((s[i].x > 85) && (s[i].q == 'Y'))
			{
				n[i] += 1000;
			}
			if ((s[i].y > 80) && (s[i].p == 'Y'))
			{
				n[i] += 850;
			}
		}
		for (i = 0;i < N;i++)
		{
			if (n[i] > g)
			{
				g = n[i];
				h = i;
			}
			sum += n[i];
		}
		System.out.printf("%s\n",s[h].name);
		System.out.printf("%d\n",g);
		System.out.printf("%d",sum);
	}
}

