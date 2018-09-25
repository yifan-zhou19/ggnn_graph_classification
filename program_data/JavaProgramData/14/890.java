public class student
{
	public int num;
	public int a;
	public int b;
	public int c;
}

package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		  int n;
		  int i;
		  int j;
		  int m;
		  int t;
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
				  stu[i].a = Integer.parseInt(tempVar3);
			  }
			  String tempVar4 = ConsoleInput.scanfRead(" ");
			  if (tempVar4 != null)
			  {
				  stu[i].b = Integer.parseInt(tempVar4);
			  }
		  stu[i].c = stu[i].a + stu[i].b;
		  }
		  for (i = 0;i < 3;i++)
		  {
			  for (j = i + 1;j < n;j++)
			  {
				  if (stu[i].c < stu[j].c)
				  {
					  t = stu[i].c;
					  stu[i].c = stu[j].c;
					  stu[j].c = t;
					  m = stu[i].num;
					  stu[i].num = stu[j].num;
					  stu[j].num = m;
				  }
			  }
		  }
			  for (i = 0;i < 3;i++)
			  {
				  System.out.printf("%d %d\n",stu[i].num,stu[i].c);
			  }
	}
}

