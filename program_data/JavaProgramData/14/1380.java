package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		  int i;
		  int n;
		  int[] t = new int[3];
		  int[] u = new int[3];
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	  struct student
	//	  {
	//		int ID;
	//		int math;
	//		int chinese;
	//		int a;
	//	  }
	//	  stu[100000];
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
				   stu[i].ID = tempVar2;
			   }
			   String tempVar3 = ConsoleInput.scanfRead(" ");
			   if (tempVar3 != null)
			   {
				   stu[i].math = tempVar3;
			   }
			   String tempVar4 = ConsoleInput.scanfRead(" ");
			   if (tempVar4 != null)
			   {
				   stu[i].chinese = tempVar4;
			   }
			   stu[i].a = stu[i].math + stu[i].chinese;
		  }
		  for (i = 0;i < n;i++)
		  {
			 if (stu[i].a > t[0])
			 {
				 t[0] = stu[i].a;
				 u[0] = i;
			 }
		  }
		  for (i = 0;i < n;i++)
		  {
			 if (i == u[0])
			 {
				 continue;
			 }
			 if (stu[i].a > t[1])
			 {
				 t[1] = stu[i].a;
				 u[1] = i;
			 }
		  }
		  for (i = 0;i < n;i++)
		  {
			 if (i == u[0] || i == u[1])
			 {
				 continue;
			 }
			 if (stu[i].a > t[2])
			 {
				 t[2] = stu[i].a;
				 u[2] = i;
			 }
		  }
		  System.out.printf("%d %d\n%d %d\n%d %d\n",stu[u[0]].ID,t[0],stu[u[1]].ID,t[1],stu[u[2]].ID,t[2]);
	}
}

