public class num1
{
	public int a;
	public int b;
	public int c;
}
public class num
{
	public int x1;
	public int x2;
	public int x3;
	public int x11;
	public int x12;
	public int x13;
	public int l1;
	public int l2;
	public float sum;
}

package <missing>;

public class GlobalMembers
{
	public static num1[] num1 = tangible.Arrays.initializeWithDefaultnum1Instances(100);
	public static num[] num = tangible.Arrays.initializeWithDefaultnumInstances(5010);
	public static num k = new num();
	public static int Main()
	{
		int t = 0;
		int n;
		int i;
		int j;
		int sum;
	   String tempVar = ConsoleInput.scanfRead();
	   if (tempVar != null)
	   {
		   n = Integer.parseInt(tempVar);
	   }
	   for (i = 1; i <= n ;i++)
	   {
	   String tempVar2 = ConsoleInput.scanfRead();
	   if (tempVar2 != null)
	   {
		   num1[i].a = Integer.parseInt(tempVar2);
	   }
	   String tempVar3 = ConsoleInput.scanfRead(" ");
	   if (tempVar3 != null)
	   {
		   num1[i].b = Integer.parseInt(tempVar3);
	   }
	   String tempVar4 = ConsoleInput.scanfRead(" ");
	   if (tempVar4 != null)
	   {
		   num1[i].c = Integer.parseInt(tempVar4);
	   }
	   }
	   for (i = 1; i <= n;i++)
	   {
		  for (j = i + 1; j <= n ;j++)
		  {
		  num[t].x1 = num1[i].a;
		  num[t].x2 = num1[i].b;
		  num[t].x3 = num1[i].c;
		  num[t].x11 = num1[j].a;
		  num[t].x12 = num1[j].b;
		  num[t].x13 = num1[j].c;
		  num[t].sum = (num[t].x1 - num[t].x11) * (num[t].x1 - num[t].x11) + (num[t].x2 - num[t].x12) * (num[t].x2 - num[t].x12) + (num[t].x3 - num[t].x13) * (num[t].x3 - num[t].x13);
		  num[t].l1 = i;
		  num[t].l2 = j;
		  t++;
		  }
	   }
		for (i = 0;i < t ;i++)
		{
			 for (j = i ;j < t;j++)
			 {
				 if (num[i].sum < num[j].sum)
				 {
//C++ TO JAVA CONVERTER TODO TASK: The following line was determined to be a copy assignment (rather than a reference assignment) - this should be verified and a 'copyFrom' method should be created:
//ORIGINAL LINE: k = num[i];
				   k.copyFrom(num[i]);
				 num[i] = num[j];
				 num[j] = k;
				 }
			 }
		}
		 for (i = 0;i < t ;i++)
		 {
			 for (j = i ;j < t;j++)
			 {
				 if ((num[i].sum == num[j].sum) && ((num[i].l1 > num[j].l1) || ((num[i].l1 == num[j].l1) && (num[i].l2 > num[j].l2))))
				 {
//C++ TO JAVA CONVERTER TODO TASK: The following line was determined to be a copy assignment (rather than a reference assignment) - this should be verified and a 'copyFrom' method should be created:
//ORIGINAL LINE: k = num[i];
				   k.copyFrom(num[i]);
				 num[i] = num[j];
				 num[j] = k;
				 }
			 }
		 }
		  for (i = 0 ;i < t ;i++)
		  {
			 System.out.printf("(%d,%d,%d)-(%d,%d,%d)=%.2f\n",num[i].x1,num[i].x2,num[i].x3,num[i].x11,num[i].x12,num[i].x13,Math.sqrt(num[i].sum));
		  }

	}

}

