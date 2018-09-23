public class Student
{
	public int ID;
public int chi;
public int math;
public int total;
}

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	Student[] stu = tangible.Arrays.initializeWithDefaultStudentInstances(100000);
	Student temp = new Student();
	int i;
	int n;
	int j;
	int m;
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
		stu[i].ID = Integer.parseInt(tempVar2);
	}
	String tempVar3 = ConsoleInput.scanfRead(" ");
	if (tempVar3 != null)
	{
		stu[i].chi = Integer.parseInt(tempVar3);
	}
	String tempVar4 = ConsoleInput.scanfRead(" ");
	if (tempVar4 != null)
	{
		stu[i].math = Integer.parseInt(tempVar4);
	}
	stu[i].total = stu[i].chi + stu[i].math;
	}
	for (j = 1;j < 4;j++)
	{
	 for (m = 0;m < n - j;m++)
	 {
	  if (stu[m].total >= stu[m + 1].total)
	  {
//C++ TO JAVA CONVERTER TODO TASK: The following line was determined to be a copy assignment (rather than a reference assignment) - this should be verified and a 'copyFrom' method should be created:
//ORIGINAL LINE: temp=stu[m];
	  temp.copyFrom(stu[m]);
	  stu[m] = stu[m + 1];
	  stu[m + 1] = temp;
	  }
	 }
	}
	for (i = n - 1;i > n - 4;i--)
	{
	System.out.printf("%d %d\n",stu[i].ID,stu[i].total);
	}
	return 0;
	}


}

