package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct student
	//	{
	//		   int id;
	//		   int yu,shu;
	//		   }
	//		   stu[100000];
		int i;
		int s1 = 0;
		int s2 = 0;
		int s3 = 0;
		int x1 = 0;
		int x2 = 0;
		int x3 = 0;
		for (i = 0;i < n;i++)
		{
		 String tempVar2 = ConsoleInput.scanfRead();
		 if (tempVar2 != null)
		 {
			 stu[i].id = tempVar2;
		 }
		 String tempVar3 = ConsoleInput.scanfRead(" ");
		 if (tempVar3 != null)
		 {
			 stu[i].yu = tempVar3;
		 }
		 String tempVar4 = ConsoleInput.scanfRead(" ");
		 if (tempVar4 != null)
		 {
			 stu[i].shu = tempVar4;
		 }
		}
		int s;
		int x;
		 for (i = 0;i < n;i++)
		 {
		  s = stu[i].yu + stu[i].shu;
		  x = stu[i].id;
		  if (s > s1)
		  {
			  s3 = s2;
			  x3 = x2;
			  s2 = s1;
			  x2 = x1;
			  s1 = s;
			  x1 = x;
		  }
		  else if (s == s1)
		  {
			  s3 = s2;
			  x3 = x2;
			  s2 = s;
			  x2 = x;
		  }
		  else if (s < s1 && s> s2)
		  {
			  s3 = s2;
			  x3 = x2;
			  s2 = s;
			  x2 = x;
		  }
		  else if (s == s2)
		  {
			  s3 = s;
			  x3 = x;
		  }
		  else if (s < s2 && s> s3)
		  {
			  s3 = s;
			  x3 = x;
		  }
		 }
		  System.out.printf("%d %d\n",x1,s1);
		  System.out.printf("%d %d\n",x2,s2);
		  System.out.printf("%d %d\n",x3,s3);
	return 0;
	}
}

