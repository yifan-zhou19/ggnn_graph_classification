package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	 int m;
	 int i;
	 int[] a = new int[5];
	 int s;
	 String tempVar = ConsoleInput.scanfRead();
	 if (tempVar != null)
	 {
		 m = Integer.parseInt(tempVar);
	 }
	 for (i = 4,s = 0;i >= 0;i--)
	 {
	  if (m / (int)Math.pow(10,i) != 0)
	  {
		a[s] = m / (int)Math.pow(10,i);
		m = m - a[s] * (int)Math.pow(10,i);
		s++;
	  }
	 }
	 for (;s - 1 >= 0;s--)
	 {
	  System.out.printf("%d",a[s - 1]);
	 }
	 return 0;
	}
}

