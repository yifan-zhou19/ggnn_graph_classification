public class student
{
	public String name = new String(new char[20]);
	public int ave;
	public int cla;
	public char mon;
	public char pro;
	public int essay;
	public int scholar;
}

package <missing>;

public class GlobalMembers
{
	public static student[] st = tangible.Arrays.initializeWithDefaultstudentInstances(100);
	public static student temp = new student();
	public static int Main()
	{
		int i;
		int N;
		int j;
		int sum = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			N = Integer.parseInt(tempVar);
		}
		for (i = 0;i < N;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				st[i].name = tempVar2.charAt(0);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				st[i].ave = Integer.parseInt(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead(" ");
			if (tempVar4 != null)
			{
				st[i].cla = Integer.parseInt(tempVar4);
			}
			String tempVar5 = ConsoleInput.scanfRead(" ", 1);
			if (tempVar5 != null)
			{
				st[i].mon = tempVar5.charAt(0);
			}
			String tempVar6 = ConsoleInput.scanfRead(" ", 1);
			if (tempVar6 != null)
			{
				st[i].pro = tempVar6.charAt(0);
			}
			String tempVar7 = ConsoleInput.scanfRead(" ");
			if (tempVar7 != null)
			{
				st[i].essay = Integer.parseInt(tempVar7);
			}
			st[i].scholar = 0;
			if (st[i].ave > 80 && st[i].essay != 0)
			{
				st[i].scholar = st[i].scholar + 8000;
			}
			if (st[i].ave > 85 && st[i].cla > 80)
			{
				st[i].scholar = st[i].scholar + 4000;
			}
			if (st[i].ave > 90)
			{
				st[i].scholar = st[i].scholar + 2000;
			}
			if (st[i].ave > 85 && st[i].pro == 'Y')
			{
				st[i].scholar = st[i].scholar + 1000;
			}
			if (st[i].cla > 80 && st[i].mon == 'Y')
			{
				st[i].scholar = st[i].scholar + 850;
			}
			sum = sum + st[i].scholar;
		}
		for (j = 0;j < N - 1;j++)
		{
			if (st[j].scholar >= st[j + 1].scholar)
			{
//C++ TO JAVA CONVERTER TODO TASK: The following line was determined to be a copy assignment (rather than a reference assignment) - this should be verified and a 'copyFrom' method should be created:
//ORIGINAL LINE: temp=st[j];
				temp.copyFrom(st[j]);
				st[j] = st[j + 1];
				st[j + 1] = temp;
			}
		}
		System.out.printf("%s\n%d\n%d\n",st[N - 1].name,st[N - 1].scholar,sum);
	}
}

