public class Student
{
	public int num;
	public int Chi;
	public int Math;
	public int sum;
}

package <missing>;

public class GlobalMembers
{
	public static Student[] stud = tangible.Arrays.initializeWithDefaultStudentInstances(100000);
	public static Student temp = new Student();
	public static int Main()
	{
	   int n;
	   int i;
	   int j;
	   n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	   for (i = 0;i < n;i++)
	   {
		   stud[i].num = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		   stud[i].Chi = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		   stud[i].Math = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		   stud[i].sum = stud[i].Chi + stud[i].Math;
	   }
	   if (n == 2)
	   {
		   if (stud[0].sum < stud[1].sum)
		   {
//C++ TO JAVA CONVERTER TODO TASK: The following line was determined to be a copy assignment (rather than a reference assignment) - this should be verified and a 'copyFrom' method should be created:
//ORIGINAL LINE: temp=stud[0];
				   temp.copyFrom(stud[0]);
				   stud[0] = stud[1];
				   stud[1] = temp;
		   }
	   }
	   else
	   {
		   for (i = 0;i < 3;i++)
		   {
		   for (j = n - 1;j > i;j--)
		   {
			   if (stud[j].sum > stud[j - 1].sum)
			   {
//C++ TO JAVA CONVERTER TODO TASK: The following line was determined to be a copy assignment (rather than a reference assignment) - this should be verified and a 'copyFrom' method should be created:
//ORIGINAL LINE: temp=stud[j];
				   temp.copyFrom(stud[j]);
				   stud[j] = stud[j - 1];
				   stud[j - 1] = temp;
			   }
		   }
		   }
	   }

	   if (n == 2)
	   {


		   System.out.print(stud[0].num);
		   System.out.print(' ');
		   System.out.print(stud[0].sum);
		   System.out.print("\n");

		   System.out.print(stud[1].num);
		   System.out.print(' ');
		   System.out.print(stud[1].sum);
	   }
	   for (i = 0;i < 2;i++)
	   {
		   System.out.print(stud[i].num);
		   System.out.print(' ');
		   System.out.print(stud[i].sum);
		   System.out.print("\n");
	   }
	   System.out.print(stud[2].num);
	   System.out.print(' ');
	   System.out.print(stud[2].sum);
		return 0;
	}

}

