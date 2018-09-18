public class student
{
	public int id;
	public int math_grade;
	public int chi_grade;
	public int sum;
}

package <missing>;

public class GlobalMembers
{
	public static student[] stu = tangible.Arrays.initializeWithDefaultstudentInstances(100000);
	public static void Main()
	{
		int i;
		int j;
		int n;
		int max;
		int temp1;
		int temp2;
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
				stu[i].math_grade = Integer.parseInt(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				stu[i].chi_grade = Integer.parseInt(tempVar4);
			}
		}
		for (i = 0;i < n;i++)
		{
		stu[i].sum = stu[i].math_grade + stu[i].chi_grade;
		}
		for (i = 0;i < 3;i++)
		{
			max = stu[i].sum;
			for (j = i + 1;j < n;j++)
			{
			   if (stu[j].sum > max)
			   {
				   temp1 = stu[i].id;
				   stu[i].id = stu[j].id;
				   stu[j].id = temp1;
				   temp2 = stu[i].sum;
				   stu[i].sum = stu[j].sum;
				   stu[j].sum = temp2;
				   max = stu[i].sum;
			   }
			}
		}
		for (i = 0;i < 2;i++)
		{
			System.out.printf("%d %d\n",stu[i].id,stu[i].sum);
		}
		System.out.printf("%d %d",stu[2].id,stu[2].sum);
	}
}

