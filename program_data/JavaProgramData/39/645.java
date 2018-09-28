public class student
{
	public String name = new String(new char[20]);
	public int grade1;
	public int grade2;
	public char ganbu;
	public char west;
	public int num;
	public int prize;
}

package <missing>;

public class GlobalMembers
{
	public static student[] stu = tangible.Arrays.initializeWithDefaultstudentInstances(100);
	public static int Main()
	{
		int n;
		int i;
		int max = 0;
		int j;
		int total = 0;
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
				stu[i].grade1 = Integer.parseInt(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead(" ");
			if (tempVar4 != null)
			{
				stu[i].grade2 = Integer.parseInt(tempVar4);
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
				stu[i].num = Integer.parseInt(tempVar7);
			}
		}
		for (i = 0;i < n;i++)
		{
			stu[i].prize = 0;
			if (stu[i].grade1 > 80 && stu[i].num > 0)
			{
				stu[i].prize = stu[i].prize+8000;
			}
			if (stu[i].grade1 > 85 && stu[i].grade2 > 80)
			{
				stu[i].prize = stu[i].prize+4000;
			}
			if (stu[i].grade1 > 90)
			{
				stu[i].prize = stu[i].prize+2000;
			}
			if (stu[i].grade1 > 85 && stu[i].west == 89)
			{
				stu[i].prize = stu[i].prize+1000;
			}
			if (stu[i].grade2 > 80 && stu[i].ganbu == 89)
			{
				stu[i].prize = stu[i].prize+850;
			}

		}
		for (i = 0;i < n;i++)
		{
			total = total + stu[i].prize;
		}
		for (i = 0;i < n;i++)
		{
			if (stu[i].prize > max)
			{
				j = i;
				max = stu[i].prize;
			}
		}
		System.out.printf("%s\n%d\n%d",stu[j].name,stu[j].prize,total);
	}

}

