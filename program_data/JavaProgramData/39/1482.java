public class student
{
	public String name = new String(new char[100]);
	public int n1;
	public int n2;
	public char a;
	public char b;
	public int n3;
}

package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int N;
		int i;
		int j;
		int[][] s = new int[101][6];
		int max;
		int k = 0;
		int sum = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			N = Integer.parseInt(tempVar);
		}
		student[] stu = tangible.Arrays.initializeWithDefaultstudentInstances(101);
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		student * p = new student();
		for (p = stu;p < stu + N;p++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				p.name = tempVar2.charAt(0);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				p.n1 = Integer.parseInt(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead(" ");
			if (tempVar4 != null)
			{
				p.n2 = Integer.parseInt(tempVar4);
			}
			String tempVar5 = ConsoleInput.scanfRead(" ", 1);
			if (tempVar5 != null)
			{
				p.a = tempVar5.charAt(0);
			}
			String tempVar6 = ConsoleInput.scanfRead(" ", 1);
			if (tempVar6 != null)
			{
				p.b = tempVar6.charAt(0);
			}
			String tempVar7 = ConsoleInput.scanfRead(" ");
			if (tempVar7 != null)
			{
				p.n3 = Integer.parseInt(tempVar7);
			}
		}
		for (i = 0;i < N;i++)
		{
			for (j = 0;j < 6;j++)
			{
				s[i][j] = 0;
			}
		}
		for (i = 0;i < N;i++)
		{
			if (stu[i].n1 > 80 && stu[i].n3 >= 1)
			{
				s[i][0] = 8000;
			}
			if (stu[i].n1 > 85 && stu[i].n2 > 80)
			{
				s[i][1] = 4000;
			}
			if (stu[i].n1 > 90)
			{
				s[i][2] = 2000;
			}
			if (stu[i].n1 > 85 && stu[i].b == 'Y')
			{
				s[i][3] = 1000;
			}
			if (stu[i].n2 > 80 && stu[i].a == 'Y')
			{
				s[i][4] = 850;
			}
		}
		for (i = 0;i < N;i++)
		{
			for (j = 4;j >= 0;j--)
			{
				s[i][5] = s[i][5] + s[i][j];
			}
		}
		max = s[0][5];
		for (i = 0;i < N;i++)
		{
			if (s[i][5] > max)
			{
				max = s[i][5];
				k = i;
			}
		}
		System.out.printf("%s\n%d\n",stu[k].name,s[k][5]);
		for (i = 0;i < N;i++)
		{
			sum = sum + s[i][5];
		}
		System.out.printf("%ld\n",sum);
	}

}

