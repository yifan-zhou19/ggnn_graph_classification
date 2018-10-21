package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//   struct stu
	//   {
	//	   int num;
	//	   int chi;
	//	   int mat;
	//   }
	//   stu[100000];
	   int n;
	   int i;
	   int max1;
	   int max2;
	   int max3;
	   int maxn1;
	   int maxn2;
	   int maxn3;
	   int[] sum = new int[100000];
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
			   stu[i].num = tempVar2;
		   }
		   String tempVar3 = ConsoleInput.scanfRead();
		   if (tempVar3 != null)
		   {
			   stu[i].chi = tempVar3;
		   }
		   String tempVar4 = ConsoleInput.scanfRead();
		   if (tempVar4 != null)
		   {
			   stu[i].mat = tempVar4;
		   }
		   sum[i] = stu[i].chi + stu[i].mat;
	   }
		max1 = sum[0];
		maxn1 = stu[0].num;
		for (i = 1;i < n;i++)
		{
			if (sum[i] > max1)
			{
				max1 = sum[i];
				maxn1 = stu[i].num;
			}
		}
		   System.out.printf("%d %d\n",maxn1,max1);
		max2 = sum[0];
		maxn2 = stu[0].num;
			for (i = 1;i < n;i++)
			{
			if (sum[i] > max2 && i != maxn1 - 1)
			{
				max2 = sum[i];
				maxn2 = stu[i].num;
			}
			}
		   System.out.printf("%d %d\n",maxn2,max2);
		max3 = sum[0];
		maxn3 = stu[0].num;
			for (i = 1;i < n;i++)
			{
			if (sum[i] > max3 && i != maxn1 - 1 && i != maxn2 - 1)
			{
				max3 = sum[i];
				maxn3 = stu[i].num;
			}
			}
		   System.out.printf("%d %d\n",maxn3,max3);
	}
}

