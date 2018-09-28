public class student
{
	public String name = new String(new char[20]);
	public int s1;
	public int s2;
	public char x;
	public char y;
	public int l;
}

package <missing>;

public class GlobalMembers
{
	public static student[] stu = tangible.Arrays.initializeWithDefaultstudentInstances(100);
	public static int jiangjin(int i)
	{
		int jiang = 0;
		if (stu[i].s1 > 80 && stu[i].l >= 1)
		{
			jiang += 8000;
		}
		if (stu[i].s1 > 85 && stu[i].s2 > 80)
		{
			jiang += 4000;
		}
		if (stu[i].s1 > 90)
		{
			jiang += 2000;
		}
		if (stu[i].s2 > 80 && stu[i].x == 'Y')
		{
			jiang += 850;
		}
		if (stu[i].s1 > 85 && stu[i].y == 'Y')
		{
			jiang += 1000;
		}
		return (jiang);
	}

	public static void Main()
	{
		int n;
		int i;
		int[] a = new int[100];
		int h;
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
				stu[i].name = tempVar2.charAt(0);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				stu[i].s1 = Integer.parseInt(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead(" ");
			if (tempVar4 != null)
			{
				stu[i].s2 = Integer.parseInt(tempVar4);
			}
			String tempVar5 = ConsoleInput.scanfRead(" ", 1);
			if (tempVar5 != null)
			{
				stu[i].x = tempVar5.charAt(0);
			}
			String tempVar6 = ConsoleInput.scanfRead(" ", 1);
			if (tempVar6 != null)
			{
				stu[i].y = tempVar6.charAt(0);
			}
			String tempVar7 = ConsoleInput.scanfRead(" ");
			if (tempVar7 != null)
			{
				stu[i].l = Integer.parseInt(tempVar7);
			}
		a[i] = jiangjin(i);
		}
		h = 0;
		for (i = 0;i < n;i++)
		{
			sum += a[i];
			if (a[i] > a[h])
			{
				h = i;
			}
		}
		System.out.printf("%s\n%d\n%d",stu[h].name,a[h],sum);
	}
}

