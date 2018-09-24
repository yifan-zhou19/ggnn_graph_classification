public class student
{
	public int math;
 public int chi;
 public int num;
 public int sum;
}

package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
	  int i;
	  int j;
	  int k;
	  int n;
	  int t;
	  int m;
	  student[] stu = tangible.Arrays.initializeWithDefaultstudentInstances(100000);
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
		   stu[i].num = Integer.parseInt(tempVar2);
	   }
	   String tempVar3 = ConsoleInput.scanfRead(" ");
	   if (tempVar3 != null)
	   {
		   stu[i].math = Integer.parseInt(tempVar3);
	   }
	   String tempVar4 = ConsoleInput.scanfRead(" ");
	   if (tempVar4 != null)
	   {
		   stu[i].chi = Integer.parseInt(tempVar4);
	   }
	  }
	  for (i = 0;i < n;i++)
	  {
	   stu[i].sum = stu[i].math + stu[i].chi;
	  }
	  for (i = 0;i < 3;i++)
	  {
			for (j = i + 1,k = i;j < n;j++)
			{
		  if (stu[j].sum > stu[k].sum)
		  {
		   k = j;
		  }
			}
		 t = stu[i].sum;
		 stu[i].sum = stu[k].sum;
		 stu[k].sum = t;
		 m = stu[i].num;
		 stu[i].num = stu[k].num;
		 stu[k].num = m;
	  }
	   for (i = 0;i < 3;i++)
	   {
		 System.out.printf("%d %d\n",stu[i].num,stu[i].sum);
	   }
	}
}

