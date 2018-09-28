package <missing>;

public class GlobalMembers
{
	public static int[] a = new int[1005];
	public static int Main()
	{
	 a[0] = 1;
	 int l = 1;
	 int n;
	 int t = 0;
	 int i;
	 String tempVar = ConsoleInput.scanfRead();
	 if (tempVar != null)
	 {
		 n = Integer.parseInt(tempVar);
	 }
	 while (n-- != 0)
	 {
	  for (i = 0;i < l; i++)
	  {
		 a[i] *= 2;
	  }
	   for (i = 0;i < l; i++)
	   {
		 if (a[i] >= 10)
		 {
		  a[i + 1] += a[i] / 10;
		  a[i] %= 10;
		 }
	   }

	   while (a[l] != 0)
	   {
		 if (a[l] >= 10)
		 {
		  a[l + 1] += a[l] / 10;
		  a[l] %= 10;
		 }
		 l++;
	   }
	 }
	 for (i = l - 1;i >= 0; i--)
	 {
	 System.out.printf("%d",a[i]);
	 }

	 return 0;
	}

}

