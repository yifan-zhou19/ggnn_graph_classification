package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		  int n;
		  int i;
		  int j;
		  int k;
		  int s;
		  int p;
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	  struct student
	//	  {
	//		  int id;
	//	  int yuwen;
	//	  int shuxue;
	//	  int zongfen;
	//	  };
		  student[] stu = tangible.Arrays.initializeWithDefaultstudentInstances(100000);
		  student temp = new student();
		  String tempVar = ConsoleInput.scanfRead();
		  if (tempVar != null)
		  {
			  n = Integer.parseInt(tempVar);
		  }
		  for (p = 0;p < n;p++)
		  {
			  String tempVar2 = ConsoleInput.scanfRead();
			  if (tempVar2 != null)
			  {
				  stu[p].id = tempVar2;
			  }
			  String tempVar3 = ConsoleInput.scanfRead(" ");
			  if (tempVar3 != null)
			  {
				  stu[p].yuwen = tempVar3;
			  }
			  String tempVar4 = ConsoleInput.scanfRead(" ");
			  if (tempVar4 != null)
			  {
				  stu[p].shuxue = tempVar4;
			  }
			  stu[p].zongfen = stu[p].yuwen + stu[p].shuxue;
		  }
		  for (j = 0;j < 3;j++)
		  {
			  for (i = 0;i < n - 1 - j;i++)
			  {
				  if (stu[i].zongfen >= stu[i + 1].zongfen)
				  {
					  temp.id = stu[i].id;
					  temp.yuwen = stu[i].yuwen;
					  temp.shuxue = stu[i].shuxue;
					  temp.zongfen = stu[i].zongfen;
					  stu[i].id = stu[i + 1].id;
					  stu[i].yuwen = stu[i + 1].yuwen;
					  stu[i].shuxue = stu[i + 1].shuxue;
					  stu[i].zongfen = stu[i + 1].zongfen;
					  stu[i + 1].id = temp.id;
					  stu[i + 1].yuwen = temp.yuwen;
					  stu[i + 1].shuxue = temp.shuxue;
					  stu[i + 1].zongfen = temp.zongfen;
				  }
			  }
		  }
		  for (k = n - 1;k > n - 4;k--)
		  {
			  System.out.printf("%d %d\n",stu[k].id,stu[k].zongfen);
		  }
	}
}

