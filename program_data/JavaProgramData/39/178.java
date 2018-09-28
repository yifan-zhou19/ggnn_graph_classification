public class student
 {
   public String name = new String(new char[20]);
   public int[] mark = new int[2];
   public char leader;
   public char west;
   public int paper;
   public int money;
 }

package <missing>;

public class GlobalMembers
{
	  public static student[] stu = tangible.Arrays.initializeWithDefaultstudentInstances(100);
	public static void Main()
	{
	  int n;
	  int i;
	  int j;
	  int max;
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
				 stu[i].mark[0] = Integer.parseInt(tempVar3);
			 }
			 String tempVar4 = ConsoleInput.scanfRead(" ");
			 if (tempVar4 != null)
			 {
				 stu[i].mark[1] = Integer.parseInt(tempVar4);
			 }
			 String tempVar5 = ConsoleInput.scanfRead(" ", 1);
			 if (tempVar5 != null)
			 {
				 stu[i].leader = tempVar5.charAt(0);
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
		  stu[i].money = 0;
		  if (stu[i].mark[0] > 80 && stu[i].paper >= 1)
		  {
			  stu[i].money += 8000;
		  }
		  if (stu[i].mark[0] > 85 && stu[i].mark[1] > 80)
		  {
			  stu[i].money += 4000;
		  }
		  if (stu[i].mark[0] > 90)
		  {
			  stu[i].money += 2000;
		  }
		  if (stu[i].mark[0] > 85 && stu[i].west == 'Y')
		  {
			  stu[i].money += 1000;
		  }
		  if (stu[i].mark[1] > 80 && stu[i].leader == 'Y')
		  {
			  stu[i].money += 850;
		  }
		  sum += stu[i].money;
	  }
		max = stu[0].money;
	  for (i = 1;i < n;i++)
	  {
		   if (stu[i].money > max)
		   {
			   max = stu[i].money;
			   j = i;
		   }
	  }
	  System.out.printf("%s\n%d\n",stu[j].name,stu[j].money);
	  System.out.printf("%d",sum);
	}
}

