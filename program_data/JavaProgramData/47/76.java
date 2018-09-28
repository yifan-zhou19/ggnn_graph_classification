package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
	 int n;
	 int i;
	 int m;
	 int t;
	 int[] a = new int[100];
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
			m = Integer.parseInt(tempVar2);
		}
		a[i] = m;
	 }
	for (i = 0;i <= (int)(n - 1) / 2;i++)
	{
	  t = a[i];
	  a[i] = a[n - i - 1];
	  a[n - i - 1] = t;
	}
	  for (i = 0;i < n;i++)
	  {
	 System.out.printf("%d",a[i]);
	   if (i < n - 1)
	   {
	 System.out.print(" ");
	   }
	  }
	}
}

