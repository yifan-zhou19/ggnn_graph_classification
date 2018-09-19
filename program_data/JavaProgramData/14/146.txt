package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//  struct student
	//  {
	//	int num,sum;
	//  }
	//  stu[100000];
	  int n;
	  int i;
	  int j;
	  int k;
	  int a;
	  int b;
	  int t;
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
			a = Integer.parseInt(tempVar3);
		}
		String tempVar4 = ConsoleInput.scanfRead(" ");
		if (tempVar4 != null)
		{
			b = Integer.parseInt(tempVar4);
		}
		stu[i].sum = a + b;
	  }
	  for (i = 0;i < 3;i++)
	  {
	  for (j = n - i - 1;j > 0;j--)
	  {
		if (stu[j].sum > stu[j - 1].sum)
		{
		  t = stu[j].sum;
		  stu[j].sum = stu[j - 1].sum;
		  stu[j - 1].sum = t;
		  t = stu[j].num;
		  stu[j].num = stu[j - 1].num;
		  stu[j - 1].num = t;
		}
	  }
	  }
	  for (i = 0;i < 3;i++)
	  {
		  System.out.printf("%d %d\n",stu[i].num,stu[i].sum);
	  }
	}
}

