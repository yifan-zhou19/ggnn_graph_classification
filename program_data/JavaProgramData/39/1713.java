public class student
{
	public String name = new String(new char[20]);
	public int gra1;
	public int gra2;
	public char ganbu;
	public char west;
	public int paper;
	public int award;
}

package <missing>;

public class GlobalMembers
{
	public static student[] stu = tangible.Arrays.initializeWithDefaultstudentInstances(100);
	public static void Main()
	{
	 int n;
	 int i;
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
	  String tempVar3 = ConsoleInput.scanfRead();
	  if (tempVar3 != null)
	  {
		  stu[i].gra1 = Integer.parseInt(tempVar3);
	  }
	  String tempVar4 = ConsoleInput.scanfRead();
	  if (tempVar4 != null)
	  {
		  stu[i].gra2 = Integer.parseInt(tempVar4);
	  }
	  String tempVar5 = ConsoleInput.scanfRead();
	  if (tempVar5 != null)
	  {
		  stu[i].ganbu = tempVar5.charAt(0);
	  }
	  String tempVar6 = ConsoleInput.scanfRead();
	  if (tempVar6 != null)
	  {
		  stu[i].west = tempVar6.charAt(0);
	  }
	  String tempVar7 = ConsoleInput.scanfRead();
	  if (tempVar7 != null)
	  {
		  stu[i].paper = Integer.parseInt(tempVar7);
	  }
	 }
	 for (i = 0;i < n;i++)
	 {
	  if (stu[i].gra1 > 80 && stu[i].paper >= 1)
	  {
		  stu[i].award += 8000;
	  }
	  if (stu[i].gra1 > 85 && stu[i].gra2 > 80)
	  {
		  stu[i].award += 4000;
	  }
	  if (stu[i].gra1 > 90)
	  {
		  stu[i].award += 2000;
	  }
	  if (stu[i].gra1 > 85 && stu[i].west == 'Y')
	  {
		  stu[i].award += 1000;
	  }
	  if (stu[i].ganbu == 'Y' && stu[i].gra2 > 80)
	  {
		  stu[i].award += 850;
	  }
	  sum += stu[i].award;
	 }


	  int max = stu[0].award;
	  String best = new String(new char[20]);
	  for (i = 0;i < n;i++)
	  {
		  if (stu[i].award > max)
		  {
			  max = stu[i].award;
			  best = stu[i].name;
		  }
	  }
	  System.out.printf("%s\n%d\n%d",best,max,sum);
	}


}

