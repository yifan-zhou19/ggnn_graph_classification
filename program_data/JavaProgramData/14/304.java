package <missing>;

public class GlobalMembers
{
	 public static int Main()
	 {
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//   struct gpa
	//	{
	//	 int num;
	//	 int math;
	//	 int chin;
	//	 int total;
	//	}
	//	STUDENT_NUM[100000], first,second,third;

	  int num;
	  int math;
	  int chin;
	  int n;
	  int i;
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
			num = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			math = Integer.parseInt(tempVar3);
		}
		String tempVar4 = ConsoleInput.scanfRead();
		if (tempVar4 != null)
		{
			chin = Integer.parseInt(tempVar4);
		}
		STUDENT_NUM[i].num = num;
		STUDENT_NUM[i].math = math;
		STUDENT_NUM[i].chin = chin;
		STUDENT_NUM[i].total = math + chin;
	  }

		first.num = 0;
		first.total = 0;
		second.num = 0;
		second.total = 0;
		third.num = 0;
		third.total = 0;


		for (i = 1;i <= n;i++)
		{
			   if (STUDENT_NUM[i].total > first.total)
			   {
			   first.num = STUDENT_NUM[i].num;
			   first.total = STUDENT_NUM[i].total;
			   }
		}

			  for (i = 1;i <= n;i++)
			  {
				   if (STUDENT_NUM[i].num == first.num)
				   {
					   STUDENT_NUM[i].total = 0;
				   }
			  }
		for (i = 1;i <= n;i++)
		{
			if (STUDENT_NUM[i].total > second.total)
			{
			   second.num = STUDENT_NUM[i].num;
			   second.total = STUDENT_NUM[i].total;
			}
		}

				for (i = 1;i <= n;i++)
				{
					if (STUDENT_NUM[i].num == second.num)
					{
						STUDENT_NUM[i].total = 0;
					}
				}
		for (i = 1;i <= n;i++)
		{
		   if (STUDENT_NUM[i].total > third.total)
		   {
			   third.num = STUDENT_NUM[i].num;
			   third.total = STUDENT_NUM[i].total;
		   }
		}


	   System.out.printf("%d %d\n",first.num,first.total);
	   System.out.printf("%d %d\n",second.num,second.total);
	   System.out.printf("%d %d\n",third.num,third.total);
		System.in.read();
		System.in.read();
		System.in.read();
		System.in.read();
	 }

}

