public class student
{
		   public int num;
		   public int chi;
		   public int mat;
		   public int tot;
}

package <missing>;

public class GlobalMembers
{
		public static student[] stu = tangible.Arrays.initializeWithDefaultstudentInstances(100000);

	public static int Main()
	{
		void max(struct student [],int n);
		int n;
		int i;
		int k;



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
			 stu[i].chi = Integer.parseInt(tempVar3);
		 }
		 String tempVar4 = ConsoleInput.scanfRead();
		 if (tempVar4 != null)
		 {
			 stu[i].mat = Integer.parseInt(tempVar4);
		 }
		 stu[i].tot = stu[i].chi + stu[i].mat;
		}




		for (k = 0;k < 3;k++)
		{
						max(stu, n);
						if (k < 2)
						{
						System.out.print("\n");
						}

		}
	}

	public static void max(student[] stu, int n)
	{
		 int i;
		 int j;
		 int max;
		 max = stu[0].tot;
		 for (i = 0;i < n;i++)
		 {
		  if (stu[i].tot > max)
		  {
			max = stu[i].tot;
			j = i;
		  }
		 }

		 System.out.printf("%d %d",stu[j].num,max);
		 stu[j].tot = -1;
	}

}

