public class student
{
	public String name = new String(new char[20]);
	public int score;
	public int value;
	public char cadre;
	public char west;
	public int paper;
	public int sum;
}

package <missing>;

public class GlobalMembers
{
	public static int deal(student stu)
	{
		stu.sum = 0;
		if (stu.score > 80 && stu.paper > 0)
		{
			stu.sum += 8000;
		}
		if (stu.score > 85 && stu.value > 80)
		{
			stu.sum += 4000;
		}
		if (stu.score > 90)
		{
			stu.sum += 2000;
		}
		if (stu.score > 85 && stu.west == 'Y')
		{
			stu.sum += 1000;
		}
		if (stu.value > 80 && stu.cadre == 'Y')
		{
			stu.sum += 850;
		}
		return (stu.sum);
	}
	public static void Main()
	{
		int n;
		int i;
		int total = 0;
		int top = 0;
		int t = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		student[] stu = tangible.Arrays.initializeWithDefaultstudentInstances(100);
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
				stu[i].value = Integer.parseInt(tempVar4);
			}
			String tempVar5 = ConsoleInput.scanfRead(" ", 1);
			if (tempVar5 != null)
			{
				stu[i].cadre = tempVar5.charAt(0);
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
		stu[i].sum = deal(stu[i]);
		total += stu[i].sum;
		if (stu[i].sum > top)
		{
			top = stu[i].sum;
			t = i;
		}
		}
		System.out.printf("%s\n%d\n%d",stu[t].name,top,total);
	}

}

