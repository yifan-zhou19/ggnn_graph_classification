public class score
{
 public int num;
 public int yu;
 public int shu;
 public int sum;
}

package <missing>;

public class GlobalMembers
{
	 public static score[] stu = tangible.Arrays.initializeWithDefaultscoreInstances(100000);
	public static void Main()
	{
	  int i;
	  int n;
	  int j;
	  int k;
	   int t;
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
		   stu[i].yu = Integer.parseInt(tempVar3);
	   }
	   String tempVar4 = ConsoleInput.scanfRead();
	   if (tempVar4 != null)
	   {
		   stu[i].shu = Integer.parseInt(tempVar4);
	   }
	   stu[i].sum = stu[i].yu + stu[i].shu;
	 }
	 for (i = 0;i < 3;i++)
	 {
	  for (j = 0;j < n - i - 1;j++)
	  {
		if (stu[j].sum > stu[j + 1].sum)
		{
			 t = stu[j].sum;
			 stu[j].sum = stu[j + 1].sum;
			 stu[j + 1].sum = t;
		}
	  }
	 }
	for (k = n - 1;k > n - 4;k--)
	{
	  if (k != n - 1 && stu[k].sum == stu[k + 1].sum)
	  {
		  continue;
	  }
		for (i = 0;i < n;i++)
		{
		   if (stu[k].sum == (stu[i].yu + stu[i].shu))
		   {
				System.out.printf("%ld %ld\n",stu[i].num,stu[k].sum);
		   if (k == n - 3)
		   {
			   break;
		   }
		   }
		}
	}
	}


}

