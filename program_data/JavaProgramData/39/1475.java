public class student
{
 public String name = new String(new char[20]);
 public int score;
 public int clas;
 public char g;
 public char x;
 public int paper;
 public int total;
}

package <missing>;

public class GlobalMembers
{
	public static student[] stu = tangible.Arrays.initializeWithDefaultstudentInstances(100);
	public static void Main()
	{
	 int i;
	 int k;
	 int max;
	 int n;
	 int zong;
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
			  stu[i].clas = Integer.parseInt(tempVar4);
		  }
		  String tempVar5 = ConsoleInput.scanfRead(" ", 1);
		  if (tempVar5 != null)
		  {
			  stu[i].g = tempVar5.charAt(0);
		  }
		  String tempVar6 = ConsoleInput.scanfRead(" ", 1);
		  if (tempVar6 != null)
		  {
			  stu[i].x = tempVar6.charAt(0);
		  }
		  String tempVar7 = ConsoleInput.scanfRead(" ");
		  if (tempVar7 != null)
		  {
			  stu[i].paper = Integer.parseInt(tempVar7);
		  }
		  stu[i].total = 0;
		  if (stu[i].score > 80 && stu[i].paper >= 1)
		  {
			stu[i].total = stu[i].total + 8000;
		  }
		  if (stu[i].score > 85 && stu[i].clas > 80)
		  {
			stu[i].total = stu[i].total + 4000;
		  }
		  if (stu[i].score > 90)
		  {
			stu[i].total = stu[i].total + 2000;
		  }
		  if (stu[i].score > 85 && stu[i].x == 'Y')
		  {
			stu[i].total = stu[i].total + 1000;
		  }
		  if (stu[i].clas > 80 && stu[i].g == 'Y')
		  {
			stu[i].total = stu[i].total + 850;
		  }
	 }
	 zong = 0;
	 max = 0;
	 for (i = 0;i < n;i++)
	 {
		  zong = zong + stu[i].total;
		  if (stu[i].total > max)
		  {
			  max = stu[i].total;
			  k = i;
		  }
	 }
	 System.out.printf("%s\n%d\n%d",stu[k].name,max,zong);
	}
}

