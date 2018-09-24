package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
	   int n;
	   int i;
	   int j;
	   int[] a = new int[301];
	   int sum;
	   int t;
	   float average;
	   String tempVar = ConsoleInput.scanfRead();
	   if (tempVar != null)
	   {
		   n = Integer.parseInt(tempVar);
	   }
	   for (i = 1;i <= n;i++)
	   {
	   String tempVar2 = ConsoleInput.scanfRead();
	   if (tempVar2 != null)
	   {
		   a[i] = Integer.parseInt(tempVar2);
	   }
	   }
	   for (sum = 0,i = 1;i <= n;i++)
	   {
	   sum = sum + a[i];
	   }
	   average = (float)sum / n;
	   for (i = 1;i < n;i++)
	   {
	   for (j = i;j < n;j++)
	   {
	   if (a[j] > a[j + 1])
	   {
		t = a[j];
		a[j] = a[j + 1];
		a[j + 1] = t;
	   }
	   }
	   }
	   if (average - a[1] > a[n] - average)
	   {
		   System.out.printf("%d",a[1]);
	   }
	   else if (average - a[1] < a[n] - average)
	   {
		   System.out.printf("%d",a[n]);
	   }
	   else
	   {
		   System.out.printf("%d,%d",a[1],a[n]);
	   }
	}

}

