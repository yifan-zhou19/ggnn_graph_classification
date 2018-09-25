package <missing>;

public class GlobalMembers
{
	public static void o(int n)
	{
	 int[] a = new int[n];
	 int i = 0;
	 int j = 0;
	 int x;
	 while (i < n)
	 {
	  String tempVar = ConsoleInput.scanfRead();
	  if (tempVar != null)
	  {
		  a[i] = Integer.parseInt(tempVar);
	  }
	  i++;
	 }
	 i = 0;
	 while (i < n)
	 {
	  while (j < n - 1)
	  {
	   if (a[j] > a[j + 1])
	   {
		x = a[j],a[j] = a[j + 1],a[j + 1] = x;
	   }
	   j++;
	  }
	  j = 0;
	  i++;
	 }
	 j = 0;
	 while (j < n)
	 {
	  System.out.printf("%d",a[j]);
	  if (j < n - 1)
	  {
	   System.out.print(" ");
	  }
	  j++;
	 }
	}
	public static void Main()
	{
	 int m;
	 int n;
	 String tempVar = ConsoleInput.scanfRead();
	 if (tempVar != null)
	 {
		 m = Integer.parseInt(tempVar);
	 }
	 String tempVar2 = ConsoleInput.scanfRead(" ");
	 if (tempVar2 != null)
	 {
		 n = Integer.parseInt(tempVar2);
	 }
	 o(m);
	 System.out.print(" ");
	 o(n);
	}

}

