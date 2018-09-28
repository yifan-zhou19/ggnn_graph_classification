package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct stu
	//	{
	//		char name[20];
	//		int q;
	//		int p;
	//		char g;
	//		char x;
	//		int l;
	//	}
	//	stu[100];
		int n;
		int i;
		int j;
		char[][] m = new char[100][20];
		int s;
		int t = 0;
		int sum = 0;
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
				stu[i].name = tempVar2;
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				stu[i].q = tempVar3;
			}
			String tempVar4 = ConsoleInput.scanfRead(" ");
			if (tempVar4 != null)
			{
				stu[i].p = tempVar4;
			}
			String tempVar5 = ConsoleInput.scanfRead(" ", 1);
			if (tempVar5 != null)
			{
				stu[i].g = tempVar5;
			}
			String tempVar6 = ConsoleInput.scanfRead(" ", 1);
			if (tempVar6 != null)
			{
				stu[i].x = tempVar6;
			}
			String tempVar7 = ConsoleInput.scanfRead(" ");
			if (tempVar7 != null)
			{
				stu[i].l = tempVar7;
			}
			s = 0;
			if (stu[i].q > 80 && stu[i].l >= 1)
			{
				s = s + 8000;
			}
			if (stu[i].q > 85 && stu[i].p > 80)
			{
				s = s + 4000;
			}
			if (stu[i].q > 90)
			{
				s = s + 2000;
			}
			if (stu[i].q > 85 && stu[i].x == 'Y')
			{
				s = s + 1000;
			}
			if (stu[i].p > 80 && stu[i].g == 'Y')
			{
				s = s + 850;
			}
			sum = sum + s;
			if (s > t)
			{
				j = 0;
				m[j] = stu[i].name;
				t = s;
				j++;
			}
			else if (s == t)
			{
				m[j] = stu[i].name;
				j++;
			}
		}
		System.out.printf("%s\n",m[0]);
		System.out.printf("%d\n",t);
		System.out.printf("%d\n",sum);
	}

}

