package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct student
	//	{
	//		char name[20];
	//		int a;
	//		int b;
	//		char c;
	//		char d;
	//		int e;
	//		struct student *next;
	//	}
	//	student[100];
		int N;
		int i;
		int[] money = new int[100];
		int max;
		int sum;
		int flag;
		max = sum = 0;
		for (i = 0;i < 100;i++)
		{
			money[i] = 0;
		}
		student p;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			N = Integer.parseInt(tempVar);
		}
		for (i = 0;i < N;i++)
		{
			student[i].next = &student[i + 1];
		}
		student[N - 1].next = null;
		p = student[0];
		i = 0;
		while (p != null)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				p.name = tempVar2;
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				p.a = tempVar3;
			}
			String tempVar4 = ConsoleInput.scanfRead(" ");
			if (tempVar4 != null)
			{
				p.b = tempVar4;
			}
			String tempVar5 = ConsoleInput.scanfRead(" ", 1);
			if (tempVar5 != null)
			{
				p.c = tempVar5;
			}
			String tempVar6 = ConsoleInput.scanfRead(" ", 1);
			if (tempVar6 != null)
			{
				p.d = tempVar6;
			}
			String tempVar7 = ConsoleInput.scanfRead(" ");
			if (tempVar7 != null)
			{
				p.e = tempVar7;
			}
			if ((p.a) > 80 && (p.e) > 0)
			{
				money[i] += 8000;
			}
			if ((p.a) > 85 && (p.b) > 80)
			{
				money[i] += 4000;
			}
			if ((p.a) > 90)
			{
				money[i] += 2000;
			}
			if ((p.a) > 85 && (p.d) == 'Y')
			{
				money[i] += 1000;
			}
			if ((p.b) > 80 && (p.c) == 'Y')
			{
				money[i] += 850;
			}
			i++;
			p = p.next;
		}
		for (i = 0;i < N;i++)
		{
			if (money[i] > max)
			{
				max = money[i];
				flag = i;
			}
		}
		System.out.printf("%s\n",student[flag].name);
		System.out.printf("%d\n",max);
		for (i = 0;i < N;i++)
		{
			sum += money[i];
		}
		System.out.printf("%d",sum);
		return 0;
	}
}

