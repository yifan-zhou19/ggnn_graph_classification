public class student
{
	   public int id;
	   public int math;
	   public int chinese;
	   public int zongfen;
}

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		  int n;
		  int i = 1;
		  int j;
		  int[] a = new int[100001];
		  student[] stu = tangible.Arrays.initializeWithDefaultstudentInstances(100001);
		  String tempVar = ConsoleInput.scanfRead();
		  if (tempVar != null)
		  {
			  n = Integer.parseInt(tempVar);
		  }
		  for (i = 1;i <= n;i++)
		  {
			  String tempVar2 = ConsoleInput.scanfRead();
			  if (tempVar2 != null)
			  {
				  stu[i].id = Integer.parseInt(tempVar2);
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
			  stu[i].zongfen = stu[i].math + stu[i].chinese;
			  if (i < 4)
			  {
			  j = i;
			  }
			  else
			  {
			  j = 4;
			  }
			  {
					for (;j > 1 && stu[i].zongfen > stu[a[j - 1]].zongfen;j--)
					{
					a[j] = a[j - 1];
					}
		  }
			  a[j] = i;
		  }
		  for (i = 1;i <= 3;i++)
		  {
		  System.out.printf("%d %d\n",stu[a[i]].id,stu[a[i]].zongfen);
		  }
		  System.in.read();
		  System.in.read();
		  String tempVar5 = ConsoleInput.scanfRead();
		  if (tempVar5 != null)
		  {
			  n = Integer.parseInt(tempVar5);
		  }
		  return 0;
	}



}

