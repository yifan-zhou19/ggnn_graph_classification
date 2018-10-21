package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int m = 0;
		int t;
		int s = 0;
		int[][] a = new int[100][5];
		int[] b = new int[100];
		int[] c = new int[100];
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct student
	//	{
	//		char name[20];
	//		int qimo;
	//		int pingyi;
	//		char ganbu;
	//		char xibu;
	//		int lunwen;
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
				stu[i].pingyi = tempVar4;
			}
			String tempVar5 = ConsoleInput.scanfRead(" ", 1);
			if (tempVar5 != null)
			{
				stu[i].ganbu = tempVar5;
			}
			String tempVar6 = ConsoleInput.scanfRead(" ", 1);
			if (tempVar6 != null)
			{
				stu[i].xibu = tempVar6;
			}
			String tempVar7 = ConsoleInput.scanfRead(" ");
			if (tempVar7 != null)
			{
				stu[i].lunwen = tempVar7;
			}
		}
		for (i = 0;i < n;i++)
		{
			if (stu[i].qimo > 80 && stu[i].lunwen >= 1)
			{
				a[i][0] = 8000;
			}
			if (stu[i].qimo > 85 && stu[i].pingyi > 80)
			{
				a[i][1] = 4000;
			}
			if (stu[i].qimo > 90)
			{
				a[i][2] = 2000;
			}
			if (stu[i].qimo > 85 && stu[i].xibu == 'Y')
			{
				a[i][3] = 1000;
			}
			if (stu[i].pingyi > 80 && stu[i].ganbu == 'Y')
			{
				a[i][4] = 850;
			}
			b[i] = a[i][0] + a[i][1] + a[i][2] + a[i][3] + a[i][4];
		}
		for (i = 0;i < n;i++)
		{
			c[i] = b[i];
		}
		for (i = 0;i < n - 1;i++)
		{
			for (j = 0;j < n - 1 - i;j++)
			{
				if (c[j] > c[j + 1])
				{
					t = c[j];
					c[j] = c[j + 1];
					c[j + 1] = t;
				}
			}
		}
		for (i = 0;i < n;i++)
		{
			if (b[i] == c[n - 1])
			{
				m = i;
				break;
			}
		}
		for (i = 0;i < n;i++)
		{
			s = s + b[i];
		}
		System.out.printf("%s\n",stu[m].name);
		System.out.printf("%d\n",c[n - 1]);
		System.out.printf("%d\n",s);
		return 0;
	}

}

