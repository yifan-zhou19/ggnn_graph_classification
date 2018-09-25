package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int i;
		int j;
		int k;
		int m = 0;
	 int[] a = new int[20001];
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
		 a[i] = Integer.parseInt(tempVar2);
	 }
	 }
	 for (i = 0;i < n - 1 - m;i++)
	 {
	  for (j = i + 1;j < n - m;)
	  {
	   if (a[j] == a[i])
	   {
		   for (k = j;k < n - m;k++)
		   {
		a[k] = a[k + 1];
		   }
		m++;
	   }
	   else
	   {
		   j++;
	   }
	  }
	 }
	  for (i = 0;i < n - 1 - m;i++)
	  {
	  System.out.printf("%d ",a[i]);
	  }
	  System.out.printf("%d",a[n - m - 1]);
	}

}

