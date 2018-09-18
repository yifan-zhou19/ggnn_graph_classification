package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
	 int i;
	 int j;
	 int n;
	 int k;
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	// struct student
	// {
	//  int num;
	//  int score1;
	//  int score2;
	//  int t;
	// }
	// stu[100000],m1,m2,m3;
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
			  stu[i].num = tempVar2;
		  }
		  String tempVar3 = ConsoleInput.scanfRead(" ");
		  if (tempVar3 != null)
		  {
			  stu[i].score1 = tempVar3;
		  }
		  String tempVar4 = ConsoleInput.scanfRead(" ");
		  if (tempVar4 != null)
		  {
			  stu[i].score2 = tempVar4;
		  }
		  stu[i].t = stu[i].score1 + stu[i].score2;
	 }
	 m1 = stu[0];
	 m2 = stu[0];
	 m3 = stu[0];
	 for (i = 0;i < n;i++)
	 {
			 if (stu[i].t > m1.t)
			 {
				 m3 = m2;
				 m2 = m1;
				 m1 = stu[i];
			 }
			else if (stu[i].t > m2.t && stu[i].t <= m1.t)
			{
				 m3 = m2;
				 m2 = stu[i];
			}
			else if (stu[i].t > m3.t && stu[i].t <= m2.t)
			{
				 m3 = stu[i];
			}
	 }
	   System.out.printf("%d %d\n%d %d\n%d %d",m1.num,m1.t,m2.num,m2.t,m3.num,m3.t);

	}



}

