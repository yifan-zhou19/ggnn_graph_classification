public class student
{
	public String num = new String(new char[6]);
	public int[] score = new int[2];
	public int sum;
}

package <missing>;

public class GlobalMembers
{
	public static student[] stu = tangible.Arrays.initializeWithDefaultstudentInstances(100000);

	public static void Main()
	{
		int n;
		int i;
		int j;
		int maxi1;
		int maxi2;
		int maxi3;
			 int max1 = 0;
			 int max2 = 0;
			 int max3 = 0;
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
				stu[i].num = tempVar2.charAt(0);
			}
			for (j = 0;j < 2;j++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					stu[i].score[j] = Integer.parseInt(tempVar3);
				}
			}
		}
		  for (i = 0;i < n;i++)
		  {
		  stu[i].sum = stu[i].score[0] + stu[i].score[1];
		  }

		  for (i = 0;i < n;i++)
		  {
			if (stu[i].sum > max1)
			{
				  max1 = stu[i].sum;
			   maxi1 = i;
			}
		  }
		  stu[maxi1].sum = 0;
		  for (i = 0;i < n;i++)
		  {
			 if (stu[i].sum > max2)
			 {
				   max2 = stu[i].sum;
				maxi2 = i;
			 }
		  }
		  stu[maxi2].sum = 0;
		  for (i = 0;i < n;i++)
		  {
			 if (stu[i].sum > max3)
			 {
				   max3 = stu[i].sum;
				maxi3 = i;
			 }
		  }
		 System.out.printf("%s %d\n%s %d\n%s %d",stu[maxi1].num,max1,stu[maxi2].num,max2,stu[maxi3].num,max3);
	}

}

