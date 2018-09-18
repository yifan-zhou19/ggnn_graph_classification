public class student
{
	   public int ID;
	   public int math;
	   public int chinese;
	   public int add;
}

package <missing>;

public class GlobalMembers
{
	public static student[] stu = tangible.Arrays.initializeWithDefaultstudentInstances(100000);
	public static int Main()
	{
		  int n;
		  int i;
		  int j;
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
				stu[i].ID = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				stu[i].math = Integer.parseInt(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead(" ");
			if (tempVar4 != null)
			{
				stu[i].chinese = Integer.parseInt(tempVar4);
			}
			stu[i].add = stu[i].math + stu[i].chinese;
		  }
		  for (i = 0;i < 3;i++)
		  {
			 for (j = i + 1;j < n;j++)
			 {
				 if (stu[i].add < stu[j].add)
				 {
					 int t = stu[i].add;
					 stu[i].add = stu[j].add;
					 stu[j].add = t;
					 int m = stu[i].ID;
					 stu[i].ID = stu[j].ID;
					 stu[j].ID = m;
				 }
			 }
			 System.out.printf("%d %d\n",stu[i].ID,stu[i].add);
		  }
		  System.in.read();
		  System.in.read();
	}
}

