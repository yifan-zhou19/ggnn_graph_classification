public class student
{
	public String name = new String(new char[20]);
	public int score;
	public int pingyi;
	public char ganbu;
	public char west;
	public int paper;
}

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int t;
		int x;
		int y = 0;
		int[] a = new int[100];
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
				stu[i].name = tempVar2.charAt(0);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				stu[i].score = Integer.parseInt(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead(" ");
			if (tempVar4 != null)
			{
				stu[i].pingyi = Integer.parseInt(tempVar4);
			}
			String tempVar5 = ConsoleInput.scanfRead(" ", 1);
			if (tempVar5 != null)
			{
				stu[i].ganbu = tempVar5.charAt(0);
			}
			String tempVar6 = ConsoleInput.scanfRead(" ", 1);
			if (tempVar6 != null)
			{
				stu[i].west = tempVar6.charAt(0);
			}
			String tempVar7 = ConsoleInput.scanfRead(" ");
			if (tempVar7 != null)
			{
				stu[i].paper = Integer.parseInt(tempVar7);
			}
		}
		for (i = 0;i < n;i++)
		{
			if (stu[i].score > 80 && stu[i].paper > 0)
			{
				a[i] = a[i] + 8000;
			}
		if (stu[i].score > 85 && stu[i].pingyi > 80)
		{
			a[i] = a[i] + 4000;
		}
		if (stu[i].score > 90)
		{
			a[i] = a[i] + 2000;
		}
		if (stu[i].score > 85 && stu[i].west == 'Y')
		{
			a[i] = a[i] + 1000;
		}
		if (stu[i].pingyi > 80 && stu[i].ganbu == 'Y')
		{
			a[i] = a[i] + 850;
		}
		}
		t = a[0];
		x = 0;
		for (i = 0;i < n;i++)
		{
			if (a[i] > t)
			{
				t = a[i];
				x = i;
			}
		y = y + a[i];
		}
		System.out.printf("%s\n%d\n%d\n",stu[x].name,a[x],y);
	}
}

