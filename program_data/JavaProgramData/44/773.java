package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	 int reverse = int;
	 int i;
	 int n;
	 for (i = 0;i < 6;i++)
	 {
		 String tempVar = ConsoleInput.scanfRead();
		 if (tempVar != null)
		 {
			 n = Integer.parseInt(tempVar);
		 }
	  System.out.printf("%d\n",reverse(n));
	 }
	}
	public static int reverse(int n)
	{
	 int i;
	 int j;
	 int[] a = new int[20];
	 a[0] = n;
	 for (i = 0;i < 19;i++)
	 {
		 a[i + 1] = a[i] / 10;
	  a[i] = a[i] - 10 * a[i + 1];
	 }
	 for (i = 0;i < 20;i++)
	 {
	  if (a[i] != 0)
	  {
	   j = i;
	  }
	 }
	 n = a[0];
	 for (i = 0;i < j;i++)
	 {
	  n = n * 10 + a[i + 1];
	 }
	 return n;
	}
}

