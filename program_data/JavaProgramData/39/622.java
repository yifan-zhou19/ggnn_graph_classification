package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		  int n;
		  int max = 0;
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	  struct xinxi
	//	  {
	//			char name[21];
	//			int average;
	//			int evaluate;
	//			char ganbu;
	//			char xibu;
	//			int amount;
	//	  };
		  int sum = 0;
		  xinxi[] stu = tangible.Arrays.initializeWithDefaultxinxiInstances(100);
		  String most = new String(new char[21]);
		  int scholarship;
		  int i;
		  int j;
		  int k;
		  int s;
		  int p;
		  int q;
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
				  stu[i].name = tempVar2;
			  }
			  String tempVar3 = ConsoleInput.scanfRead(" ");
			  if (tempVar3 != null)
			  {
				  stu[i].average = tempVar3;
			  }
			  String tempVar4 = ConsoleInput.scanfRead(" ");
			  if (tempVar4 != null)
			  {
				  stu[i].evaluate = tempVar4;
			  }
			  String tempVar5 = ConsoleInput.scanfRead(" ", 1);
			  if (tempVar5 != null)
			  {
				  stu[i].ganbu = tempVar5;
			  }
			  String tempVar6 = ConsoleInput.scanfRead(" ", 1);
			  if (tempVar6 != null)
			  {
				  stu[i].xibu = tempVar6;
			  }
			  String tempVar7 = ConsoleInput.scanfRead(" ");
			  if (tempVar7 != null)
			  {
				  stu[i].amount = tempVar7;
			  }
			  scholarship = 0;
			  if ((stu[i].average > 80) && (stu[i].amount > 0))
			  {
				  scholarship += 8000;
			  }
			  if ((stu[i].average > 85) && (stu[i].evaluate > 80))
			  {
				  scholarship += 4000;
			  }
			  if (stu[i].average > 90)
			  {
				  scholarship += 2000;
			  }
			  if ((stu[i].average > 85) && (stu[i].xibu == 'Y'))
			  {
				  scholarship += 1000;
			  }
			  if ((stu[i].evaluate > 80) && (stu[i].ganbu == 'Y'))
			  {
				  scholarship += 850;
			  }
			  sum += scholarship;
			  if (scholarship > max)
			  {
				  most = stu[i].name;
				  max = scholarship;
			  }
		  }
		  System.out.printf("%s\n%d\n%ld",most,max,sum);
		  System.in.read();
		  System.in.read();
	}


}

