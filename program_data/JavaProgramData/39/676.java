public class Student
{
	public String name = new String(new char[20]);
 public int a;
 public int b;
 public char c;
 public char d;
 public int e;
 public int f;
}

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int k;
		int m;
		int t;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		Student[] stu = tangible.Arrays.initializeWithDefaultStudentInstances(200);
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				stu[i].name = tempVar2.charAt(0);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				stu[i].a = Integer.parseInt(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead(" ");
			if (tempVar4 != null)
			{
				stu[i].b = Integer.parseInt(tempVar4);
			}
			String tempVar5 = ConsoleInput.scanfRead(" ", 1);
			if (tempVar5 != null)
			{
				stu[i].c = tempVar5.charAt(0);
			}
			String tempVar6 = ConsoleInput.scanfRead(" ", 1);
			if (tempVar6 != null)
			{
				stu[i].d = tempVar6.charAt(0);
			}
			String tempVar7 = ConsoleInput.scanfRead(" ");
			if (tempVar7 != null)
			{
				stu[i].e = Integer.parseInt(tempVar7);
			}
			stu[i].f = 0;
		}
		for (i = 0,m = 0;i < n;i++)
		{
			if (stu[i].a > 80 && stu[i].e > 0)
			{
				stu[i].f = stu[i].f + 8000;
			}
			if (stu[i].a > 85 && stu[i].b > 80)
			{
				stu[i].f = stu[i].f + 4000;
			}
			if (stu[i].a > 90)
			{
				stu[i].f = stu[i].f + 2000;
			}
			if (stu[i].a > 85 && stu[i].d == 'Y')
			{
				stu[i].f = stu[i].f + 1000;
			}
			if (stu[i].b > 80 && stu[i].c == 'Y')
			{
				stu[i].f = stu[i].f + 850;
			}
			if (stu[i].f > m)
			{
				m = stu[i].f;
				t = i;
			}
		}
		for (i = 0,k = 0;i < n;i++)
		{
			k = k + stu[i].f;
		}
		System.out.printf("%s\n%d\n%d\n",stu[t].name,m,k);
		return 0;
	}

}

