public class student
{
	   public String name = new String(new char[40]);
	   public int end;
	   public int cls;
	   public int lead;
	   public int west;
	   public int paper;
	   public int money;
}

package <missing>;

public class GlobalMembers
{
	public static student[] stu = tangible.Arrays.initializeWithDefaultstudentInstances(100);

	public static int Main()
	{
		int i;
		int n;
		int t = 1;
		int sum = 0;
		int max = 0;
		int print;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 1;i <= n;i++)
		{
						 String tempVar2 = ConsoleInput.scanfRead();
						 if (tempVar2 != null)
						 {
							 stu[i].name = tempVar2.charAt(0);
						 }
						 String tempVar3 = ConsoleInput.scanfRead(" ");
						 if (tempVar3 != null)
						 {
							 stu[i].end = Integer.parseInt(tempVar3);
						 }
						 String tempVar4 = ConsoleInput.scanfRead(" ");
						 if (tempVar4 != null)
						 {
							 stu[i].cls = Integer.parseInt(tempVar4);
						 }
						 String tempVar5 = ConsoleInput.scanfRead(" ", 1);
						 if (tempVar5 != null)
						 {
							 stu[i].lead = Integer.parseInt(tempVar5);
						 }
						 String tempVar6 = ConsoleInput.scanfRead(" ", 1);
						 if (tempVar6 != null)
						 {
							 stu[i].west = Integer.parseInt(tempVar6);
						 }
						 String tempVar7 = ConsoleInput.scanfRead(" ");
						 if (tempVar7 != null)
						 {
							 stu[i].paper = Integer.parseInt(tempVar7);
						 }
		}

		for (i = 1;i <= n;i++)
		{
						 if (stu[i].end > 80 && stu[i].paper >= 1)
						 {
							 stu[i].money += 8000;
						 }
						 if (stu[i].end > 85 && stu[i].cls > 80)
						 {
							 stu[i].money += 4000;
						 }
						 if (stu[i].end > 90)
						 {
							 stu[i].money += 2000;
						 }
						 if (stu[i].end > 85 && stu[i].west == 89)
						 {
							 stu[i].money += 1000;
						 }
						 if (stu[i].cls > 80 && stu[i].lead == 89)
						 {
							 stu[i].money += 850;
						 }
						 sum += stu[i].money;
		}
		for (i = 1;i <= n;i++)
		{
						if (stu[i].money > max)
						{
											 max = stu[i].money;
											 print = i;
						}
		}

	System.out.printf("%s\n%d\n%d",stu[print].name,stu[print].money,sum);

		return 0;
	}
}

