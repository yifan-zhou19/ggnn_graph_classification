public class Student
{
	  public int Num;
	  public int Chinese;
	  public int Math;
	  public int Sum;
}

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		 int n;
		 int i;
		 int s;
		 String tempVar = ConsoleInput.scanfRead();
		 if (tempVar != null)
		 {
			 n = Integer.parseInt(tempVar);
		 }
		 Student[] stu = tangible.Arrays.initializeWithDefaultStudentInstances(n);
		 Student temp = new Student();
//C++ TO JAVA CONVERTER TODO TASK: The following line was determined to contain a copy constructor call - this should be verified and a copy constructor should be created:
//ORIGINAL LINE: Student *p=stu;
		 Student[] p = new Student(stu);
		 for (i = 0;i < n;i++)
		 {
		 String tempVar2 = ConsoleInput.scanfRead();
		 if (tempVar2 != null)
		 {
			 stu[i].Num = Integer.parseInt(tempVar2);
		 }
		 String tempVar3 = ConsoleInput.scanfRead();
		 if (tempVar3 != null)
		 {
			 stu[i].Chinese = Integer.parseInt(tempVar3);
		 }
		 String tempVar4 = ConsoleInput.scanfRead();
		 if (tempVar4 != null)
		 {
			 stu[i].Math = Integer.parseInt(tempVar4);
		 }
		 stu[i].Sum = stu[i].Chinese + stu[i].Math;
		 }
		 if (n == 2)
		 {
				 if (stu[0].Sum > stu[1].Sum)
				 {
//C++ TO JAVA CONVERTER TODO TASK: The following line was determined to be a copy assignment (rather than a reference assignment) - this should be verified and a 'copyFrom' method should be created:
//ORIGINAL LINE: temp=stu[0];
				 temp.copyFrom(stu[0]);
				 }
				 stu[0] = stu[1];
				 stu[1] = temp;
				 System.out.printf("%d %d %d\n",stu[0].Num,stu[0].Chinese,stu[0].Math);
				 System.out.printf("%d %d %d\n",stu[1].Num,stu[1].Chinese,stu[1].Math);
		 }
		 else
		 {
			 for (i = 0,s = 0;i < n;i++)
			 {
			 if (stu[i].Sum > s)
			 {
			 s = stu[i].Sum;
			 }
			 }
			 for (i = 0;i < n;i++)
			 {
			 if (stu[i].Sum == s)
			 {
			 System.out.printf("%d %d\n",stu[i].Num,stu[i].Sum);
			 stu[i].Sum = 0;
			 break;
			 }
			 }
			 for (i = 0,s = 0;i < n;i++)
			 {
			 if (stu[i].Sum > s)
			 {
			 s = stu[i].Sum;
			 }
			 }
			 for (i = 0;i < n;i++)
			 {
			 if (stu[i].Sum == s)
			 {
			 System.out.printf("%d %d\n",stu[i].Num,stu[i].Sum);
			 stu[i].Sum = 0;
			 break;
			 }
			 }
			 for (i = 0,s = 0;i < n;i++)
			 {
			 if (stu[i].Sum > s)
			 {
			 s = stu[i].Sum;
			 }
			 }
			 for (i = 0;i < n;i++)
			 {
			 if (stu[i].Sum == s)
			 {
			 System.out.printf("%d %d\n",stu[i].Num,stu[i].Sum);
			 stu[i].Sum = 0;
			 break;
			 }
			 }
		 }
			 System.in.read();
			 System.in.read();
			 System.in.read();
	}
}

