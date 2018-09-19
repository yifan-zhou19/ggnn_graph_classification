public class marks
{
	public int ID;
	public int Chinese;
	public int Maths;
	public int total;
}

package <missing>;

public class GlobalMembers
{
	public static marks[] student = tangible.Arrays.initializeWithDefaultmarksInstances(100000);
	public static marks first = new marks();
	public static marks second = new marks();
	public static marks third = new marks();

	public static void Main()
	{
	   first.total = 0;
	   second.total = 0;
	   third.total = 0;
	   int student_num;
	   int i;
	   int count = 0;
	   String tempVar = ConsoleInput.scanfRead();
	   if (tempVar != null)
	   {
		   student_num = Integer.parseInt(tempVar);
	   }
	   for (i = 0;i < student_num;i++)
	   {
		   String tempVar2 = ConsoleInput.scanfRead();
		   if (tempVar2 != null)
		   {
			   student[i].ID = Integer.parseInt(tempVar2);
		   }
		   String tempVar3 = ConsoleInput.scanfRead();
		   if (tempVar3 != null)
		   {
			   student[i].Chinese = Integer.parseInt(tempVar3);
		   }
		   String tempVar4 = ConsoleInput.scanfRead();
		   if (tempVar4 != null)
		   {
			   student[i].Maths = Integer.parseInt(tempVar4);
		   }
	   }
	   for (i = 0;i < student_num;i++)
	   {
		  student[i].total = (student[i].Chinese + student[i].Maths);
	   }
		for (i = 0;i < student_num;i++)
		{
		   if (student[i].total > first.total)
		   {
//C++ TO JAVA CONVERTER TODO TASK: The following line was determined to be a copy assignment (rather than a reference assignment) - this should be verified and a 'copyFrom' method should be created:
//ORIGINAL LINE: first=student[i];
				 first.copyFrom(student[i]);
		   }
		}
	  for (i = 0;i < student_num;i++)
	  {
			 if (student[i].total == first.total)
			 {
				 count++;
				 System.out.printf("%ld %d\n",student[i].ID,student[i].total);
			 }
			 if (count > 3)
			 {
				 break;
			 }
	  }
	   for (i = 0;i < student_num;i++)
	   {
		 if (student[i].total > second.total && student[i].total < first.total)
		 {
//C++ TO JAVA CONVERTER TODO TASK: The following line was determined to be a copy assignment (rather than a reference assignment) - this should be verified and a 'copyFrom' method should be created:
//ORIGINAL LINE: second=student[i];
					 second.copyFrom(student[i]);
		 }
	   }
	  for (i = 0;i < student_num;i++)
	  {
			 if (count >= 3)
			 {
				 break;
			 }
			 if (student[i].total == second.total)
			 {
				 count++;
				 System.out.printf("%ld %d\n",student[i].ID,student[i].total);
			 }
	  }
	   for (i = 0;i < student_num;i++)
	   {
		 if (student[i].total > third.total && student[i].total < second.total)
		 {
//C++ TO JAVA CONVERTER TODO TASK: The following line was determined to be a copy assignment (rather than a reference assignment) - this should be verified and a 'copyFrom' method should be created:
//ORIGINAL LINE: third=student[i];
					 third.copyFrom(student[i]);
		 }
	   }
	   for (i = 0;i < student_num;i++)
	   {
			 if (count >= 3)
			 {
				 break;
			 }
			 if (student[i].total == third.total)
			 {
				 count++;
				 System.out.printf("%ld %d\n",student[i].ID,student[i].total);
			 }
	   }
	}
}

