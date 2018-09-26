package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
	int i;
	int n;
	int k;
	int[] a = new int[100];
	int ss;
	int m;
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//struct student
	//{
	//char name[20];
	//int score1,score2;
	//char leader;
	//char western;
	//int essay;
	//}
	//st[100];
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
			st[i].name = tempVar2;
		}
		String tempVar3 = ConsoleInput.scanfRead(" ");
		if (tempVar3 != null)
		{
			st[i].score1 = tempVar3;
		}
		String tempVar4 = ConsoleInput.scanfRead(" ");
		if (tempVar4 != null)
		{
			st[i].score2 = tempVar4;
		}
		String tempVar5 = ConsoleInput.scanfRead(" ", 1);
		if (tempVar5 != null)
		{
			st[i].leader = tempVar5;
		}
		String tempVar6 = ConsoleInput.scanfRead(" ", 1);
		if (tempVar6 != null)
		{
			st[i].western = tempVar6;
		}
		String tempVar7 = ConsoleInput.scanfRead(" ");
		if (tempVar7 != null)
		{
			st[i].essay = tempVar7;
		}
	}
	 for (i = 0;i < n;i++)
	 {
		if (st[i].score1 > 80 && st[i].essay != 0)
		{
			a[i] = a[i] + 8000;
		}
		if (st[i].score1 > 85 && st[i].score2 > 80)
		{
			a[i] = a[i] + 4000;
		}
		if (st[i].score1 > 90)
		{
			a[i] = a[i] + 2000;
		}
		if (st[i].score1 > 85 && st[i].western == 'Y')
		{
			a[i] = a[i] + 1000;
		}
		if (st[i].score2 > 80 && st[i].leader == 'Y')
		{
			a[i] = a[i] + 850;
		}
	 }
	m = a[0];
	k = 0;
	ss = a[0];
	for (i = 1;i < n;i++)
	{
		if (m < a[i])
		{
			m = a[i];
			k = i;
		}
		ss = ss + a[i];
	}
	System.out.printf("%s\n%ld\n%ld\n",st[k].name,a[k],ss);
	}

}

