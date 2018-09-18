public class student
{
		public int num;
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
	   int t;
	   int a;
	   int b;
	   int m;
	   int tempSum;
	   int tempMax;
	   int[] rank = new int[3];
	   String tempVar = ConsoleInput.scanfRead();
	   if (tempVar != null)
	   {
		   n = Integer.parseInt(tempVar);
	   }
	   //struct student * stu;
	   //stu = (struct student *)malloc(sizeof(struct student) * n);
	   for (i = 0;i < n;i++)
	   {
			tempSum = 0;
			   String tempVar2 = ConsoleInput.scanfRead();
			   if (tempVar2 != null)
			   {
				   stu[i].num = Integer.parseInt(tempVar2);
			   }
			   stu[i].sum = 0;
			   for (j = 0;j < 2;j++)
			   {
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					tempSum = Integer.parseInt(tempVar3);
				}
				stu[i].sum += tempSum;
			   }
	   }
	   for (b = 0;b < 3;b++)
	   {
		   tempMax = 0;
		   for (a = b;a < n;a++)
		   {
			   if (stu[a].sum > tempMax)
			   {
				tempMax = stu[a].sum;
				rank[b] = a;
			   }
		   }
		   t = stu[b].num;
		   stu[b].num = stu[rank[b]].num;
		   stu[rank[b]].num = t;
		   t = stu[b].sum;
		   stu[b].sum = stu[rank[b]].sum;
		   stu[rank[b]].sum = t;
	   }
	   for (a = 0;a < 3;a++)
	   {
	   System.out.printf("%d %d\n",stu[a].num,stu[a].sum);
	   }

	  return 0;
	}

}

