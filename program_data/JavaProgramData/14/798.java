public class student
{
public int num;
public int chn;
public int math;
public int sum;
}

package <missing>;

public class GlobalMembers
{
	public static student[] stu = tangible.Arrays.initializeWithDefaultstudentInstances(100000);
	public static int Main()
	{
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
								 stu[i].num = Integer.parseInt(tempVar2);
							 }
							 String tempVar3 = ConsoleInput.scanfRead();
							 if (tempVar3 != null)
							 {
								 stu[i].math = Integer.parseInt(tempVar3);
							 }
							 String tempVar4 = ConsoleInput.scanfRead();
							 if (tempVar4 != null)
							 {
								 stu[i].chn = Integer.parseInt(tempVar4);
							 }
						 stu[i].sum = stu[i].math + stu[i].chn;
						 }
		int j;
		int[] sum = new int[100000];
		int[] order = {n - 1, 0, 0, 0};
		int t;
		int m;
		student temp = new student();
		for (j = n - 1;j >= n - 3;j--)
		{
			   for (i = 0;i < j;i++)
			   {
				  if (stu[i].sum >= stu[i + 1].sum)
				  {
//C++ TO JAVA CONVERTER TODO TASK: The following line was determined to be a copy assignment (rather than a reference assignment) - this should be verified and a 'copyFrom' method should be created:
//ORIGINAL LINE: temp=stu[i+1];
					temp.copyFrom(stu[i + 1]);
					stu[i + 1] = stu[i];
					stu[i] = temp;
				  }
			   }
		}
	   System.out.printf("%d %d\n",stu[n - 1].num,stu[n - 1].sum);
	   System.out.printf("%d %d\n",stu[n - 2].num,stu[n - 2].sum);
	   System.out.printf("%d %d\n",stu[n - 3].num,stu[n - 3].sum);
	   System.in.read();
	   System.in.read();
	}

}

