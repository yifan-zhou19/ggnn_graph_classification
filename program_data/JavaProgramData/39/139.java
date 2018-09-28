public class student
{
	public String name = new String(new char[20]);
public int score1;
public int score2;
public char ganbu;
public char west;
public int paper;
public int scolarship;
}

package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
	  int n;
	  int i;
	  int total = 0;
	  int max = 0;
	  String name2 = new String(new char[20]);
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
			  stu[i].score1 = Integer.parseInt(tempVar3);
		  }
		  String tempVar4 = ConsoleInput.scanfRead(" ");
		  if (tempVar4 != null)
		  {
			  stu[i].score2 = Integer.parseInt(tempVar4);
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
	  stu[i].scolarship = 0;
	  if (stu[i].score1 > 80 && stu[i].paper >= 1)
	  {
		  stu[i].scolarship = 8000;
	  }
	  if (stu[i].score1 > 85 && stu[i].score2 > 80)
	  {
		  stu[i].scolarship = stu[i].scolarship + 4000;
	  }
	  if (stu[i].score1 > 90)
	  {
		  stu[i].scolarship = stu[i].scolarship + 2000;
	  }
	  if (stu[i].score1 > 85 && stu[i].west == 'Y')
	  {
		  stu[i].scolarship = stu[i].scolarship + 1000;
	  }
	  if (stu[i].score2 > 80 && stu[i].ganbu == 'Y')
	  {
		  stu[i].scolarship = stu[i].scolarship + 850;
	  }
	  total = total + stu[i].scolarship;
	  if (stu[i].scolarship > max)
	  {
		  max = stu[i].scolarship;
	  name2 = stu[i].name;
	  }
	  }

	  System.out.printf("%s\n%d\n%d",name2,max,total);
	}


}

