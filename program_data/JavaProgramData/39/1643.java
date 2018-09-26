package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int i;
		int[] qians = new int[100];
		int sum;
		int t;
		int d;
		int jiangj = new int(int a,int b,char d,char e,int c);
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct student
	//	{
	//		char name[20];
	//		int qimo;
	//		int py;
	//		char a;
	//		char b;
	//		int paper;
	//	};
		student[] stu = tangible.Arrays.initializeWithDefaultstudentInstances(100);
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
				stu[i].qimo = tempVar3;
			}
			String tempVar4 = ConsoleInput.scanfRead(" ");
			if (tempVar4 != null)
			{
				stu[i].py = tempVar4;
			}
			String tempVar5 = ConsoleInput.scanfRead(" ", 1);
			if (tempVar5 != null)
			{
				stu[i].a = tempVar5;
			}
			String tempVar6 = ConsoleInput.scanfRead(" ", 1);
			if (tempVar6 != null)
			{
				stu[i].b = tempVar6;
			}
			String tempVar7 = ConsoleInput.scanfRead(" ");
			if (tempVar7 != null)
			{
				stu[i].paper = tempVar7;
			}
			qians[i] = jiangj(stu[i].qimo, stu[i].py, stu[i].a, stu[i].b, stu[i].paper);
		}
		for (i = 0,t = 0,sum = 0;i < n;i++)
		{
			sum = sum + qians[i];
			if (t < qians[i])
			{
				d = i;
				t = qians[i];
			}
		}
		System.out.printf("%s\n%d\n%d",stu[d].name,qians[d],sum);
	}
	public static int jiangj(int a,int b,char d,char e,int c)
	{
		int z;
		z = 0;
		if (a > 80 && c > 0)
		{
			z = z + 8000;
		}
		if (a > 85 && b > 80)
		{
			z = z + 4000;
		}
		if (a > 90)
		{
			z = z + 2000;
		}
		if (a > 85 && e == 'Y')
		{
			z = z + 1000;
		}
		if (b > 80 && d == 'Y')
		{
			z = z + 850;
		}
		return (z);
	}
}

