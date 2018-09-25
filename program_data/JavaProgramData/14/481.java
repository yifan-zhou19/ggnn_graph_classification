public class student
{
	public int num;
	public int chinese;
	public int maths;
	public int sum;
}

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		student[] stu =
		{
			new student(0, 0, 0, 0),
			null,
			null,
			null
		};
	  student[] temp =
	  {
		  new student(0, 0, 0, 0),
		  null,
		  null,
		  null
	  };
	  int n;
	  int i;
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
			  stu[3].num = Integer.parseInt(tempVar2);
		  }
		  String tempVar3 = ConsoleInput.scanfRead();
		  if (tempVar3 != null)
		  {
			  stu[3].chinese = Integer.parseInt(tempVar3);
		  }
		  String tempVar4 = ConsoleInput.scanfRead();
		  if (tempVar4 != null)
		  {
			  stu[3].maths = Integer.parseInt(tempVar4);
		  }
		  stu[3].sum = stu[3].chinese + stu[3].maths;
		  //printf("%d",stu[3].chinese);
		  if (stu[3].sum > stu[0].sum)
		  {
			  stu[2] = stu[1];
			  stu[1] = stu[0];
			  stu[0] = stu[3];
		  }
		  else if (stu[3].sum > stu[1].sum)
		  {
			  stu[2] = stu[1];
			  stu[1] = stu[3];
		  }
		  else if (stu[3].sum > stu[2].sum)
		  {
			  stu[2] = stu[3];
		  }
	  }
	  for (i = 0;i < 3;i++)
	  {
		  System.out.printf("%d %d\n",stu[i].num,stu[i].sum);
	  }
	  return 0;
	}
}

