public class student
{
	public String name = new String(new char[20]);
	public int t1;
	public int t2;
	public char gan;
	public char west;
	public int wen;
	public int sum;
}

package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		 int n;
		 int i;
		 int j;
		 int whole = 0;
		 student[] stu = tangible.Arrays.initializeWithDefaultstudentInstances(100);
		 student temp = new student();
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
				 stu[i].name = tempVar2.charAt(0);
			 }
			 String tempVar3 = ConsoleInput.scanfRead();
			 if (tempVar3 != null)
			 {
				 stu[i].t1 = Integer.parseInt(tempVar3);
			 }
			 String tempVar4 = ConsoleInput.scanfRead();
			 if (tempVar4 != null)
			 {
				 stu[i].t2 = Integer.parseInt(tempVar4);
			 }
			 String tempVar5 = ConsoleInput.scanfRead(" ", 1);
			 if (tempVar5 != null)
			 {
				 stu[i].gan = tempVar5.charAt(0);
			 }
			 String tempVar6 = ConsoleInput.scanfRead(" ", 1);
			 if (tempVar6 != null)
			 {
				 stu[i].west = tempVar6.charAt(0);
			 }
			 String tempVar7 = ConsoleInput.scanfRead(" ");
			 if (tempVar7 != null)
			 {
				 stu[i].wen = Integer.parseInt(tempVar7);
			 }
			 stu[i].sum = 0;
			 if (stu[i].t1 > 80 && stu[i].wen >= 1)
			 {
				 stu[i].sum = stu[i].sum + 8000;
			 }
			 if (stu[i].t1 > 85 && stu[i].t2 > 80)
			 {
				 stu[i].sum = stu[i].sum + 4000;
			 }
			 if (stu[i].t1 > 90)
			 {
				 stu[i].sum = stu[i].sum + 2000;
			 }
			 if (stu[i].t1 > 85 && stu[i].west == 'Y')
			 {
				 stu[i].sum = stu[i].sum + 1000;
			 }
			 if (stu[i].t2 > 80 && stu[i].gan == 'Y')
			 {
				 stu[i].sum = stu[i].sum + 850;
			 }
		 }
		 for (j = 1;j < n;j++)
		 {
			  for (i = 0;i < n - j;i++)
			  {
			if (stu[i].sum < stu[i + 1].sum)
			{
//C++ TO JAVA CONVERTER TODO TASK: The following line was determined to be a copy assignment (rather than a reference assignment) - this should be verified and a 'copyFrom' method should be created:
//ORIGINAL LINE: temp=stu[i];
				temp.copyFrom(stu[i]);
				stu[i] = stu[i + 1];
				stu[i + 1] = temp;

			}
			  }
		 }
		 for (i = 0;i < n;i++)
		 {
			 whole = whole + stu[i].sum;
		 }
		 System.out.printf("%s\n%d\n%d",stu[0].name,stu[0].sum,whole);
	}
}

