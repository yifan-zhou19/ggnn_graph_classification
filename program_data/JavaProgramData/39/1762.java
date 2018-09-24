public class student
{
		public String name = new String(new char[20]);
	 public int score1;
	 public int score2;
	 public char a;
	 public char b;
	 public int num;
}

package <missing>;

public class GlobalMembers
{
		public static student[] stu = tangible.Arrays.initializeWithDefaultstudentInstances(100);
	public static int Main()
	{
		int N;
		int i;
		int num;
		int[] a = new int[100];
		int sumall = 0;
		int summax = 0;
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
			stu[i].name = tempVar2.charAt(0);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			stu[i].score1 = Integer.parseInt(tempVar3);
		}
		String tempVar4 = ConsoleInput.scanfRead();
		if (tempVar4 != null)
		{
			stu[i].score2 = Integer.parseInt(tempVar4);
		}
		String tempVar5 = ConsoleInput.scanfRead(" ", 1);
		if (tempVar5 != null)
		{
			stu[i].a = tempVar5.charAt(0);
		}
		String tempVar6 = ConsoleInput.scanfRead(" ", 1);
		if (tempVar6 != null)
		{
			stu[i].b = tempVar6.charAt(0);
		}
		String tempVar7 = ConsoleInput.scanfRead(" ");
		if (tempVar7 != null)
		{
			stu[i].num = Integer.parseInt(tempVar7);
		}
		}


		for (i = 0;i < N;i++)
		{
			if (stu[i].score1 > 80 && stu[i].num >= 1)
			{
				a[i] += 8000;
			}
		if (stu[i].score1 > 85 && stu[i].score2 > 80)
		{
			a[i] += 4000;
		}
		if (stu[i].score1 > 90)
		{
			a[i] += 2000;
		}
		if (stu[i].score1 > 85 && stu[i].b == 'Y')
		{
			a[i] += 1000;
		}
		if (stu[i].score2 > 80 && stu[i].a == 'Y')
		{
			a[i] += 850;
		}
		if (summax < a[i])
		{
			summax = a[i];
		}
		sumall += a[i];
		}
		for (i = 0;i < N;i++)
		{
			if (a[i] == summax)
			{
					num = i;
		break;
			}
		}

		System.out.printf("%s\n%d\n%d\n",stu[num].name,a[num],sumall);
	}
}

