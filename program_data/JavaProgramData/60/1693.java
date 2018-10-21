package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	 int[] a = new int[2000];
	 int i;
	 int j;
	 int k;
	 int n = 0;
	 a[0] = 2;
	 for (i = 3;i < 10000;i++)
	 {
		 k = 0;
	  for (j = 0;a[j] * a[j] <= i;j++)
	  {
	   if (i % a[j] == 0)
	   {
		k++;
	   }
	  }
	  if (k == 0)
	  {
		  n++;
	   a[n] = i;
	  }
	 }
	 String tempVar = ConsoleInput.scanfRead();
	 if (tempVar != null)
	 {
		 k = Integer.parseInt(tempVar);
	 }
	 j = 0;
	 for (i = 0;a[i] <= k - 2;i++)
	 {
	  if (a[i + 1] == a[i] + 2)
	  {
		  System.out.printf("%d %d\n",a[i],a[i + 1]);
		  j++;
	  }
	 }
	 if (j == 0)
	 {
		 System.out.print("empty");
	 }
	}

}

