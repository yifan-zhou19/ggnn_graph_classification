public class student
{
	public int id;
 public int chin;
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
		int j;
		int tem;
		int temp;
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
							 stu[i].id = Integer.parseInt(tempVar2);
						 }
						 String tempVar3 = ConsoleInput.scanfRead();
						 if (tempVar3 != null)
						 {
							 stu[i].chin = Integer.parseInt(tempVar3);
						 }
						 String tempVar4 = ConsoleInput.scanfRead();
						 if (tempVar4 != null)
						 {
							 stu[i].math = Integer.parseInt(tempVar4);
						 }
						 stu[i].sum = stu[i].chin + stu[i].math;
		}
		int[] max = new int[3];
		for (i = 1;i < n;i++)
		{
						 if (stu[i].sum > stu[max[0]].sum)
						 {
													   tem = max[0];
													   temp = max[1];
													   max[0] = i;
													   max[1] = tem;
													   max[2] = temp;
						 }
						 else
						 {
							   if (stu[i].sum > stu[max[1]].sum)
							   {
													   tem = max[1];
													   max[1] = i;
													   max[2] = tem;
							   }
						 else
						 {
							   if (stu[i].sum > stu[max[2]].sum)
							   {
													   max[2] = i;
							   }
						 }
						 }
		}




		for (i = 0;i < 3;i++)
		{
						System.out.printf("%d %d\n",stu[max[i]].id,stu[max[i]].sum);
		}


		return 0;
	}
}

