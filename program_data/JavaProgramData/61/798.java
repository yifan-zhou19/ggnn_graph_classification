package <missing>;

public class GlobalMembers
{
	public static int f(int n)
	{
	  if (n == 1 || n == 2)
	  {
	  return 1;
	  }
	  else
	  {
	  return f(n - 1) + f(n - 2);
	  }
	}
	public static int Main()
	{
	 int m;
	 int i = 1;
	 String tempVar = ConsoleInput.scanfRead();
	 if (tempVar != null)
	 {
		 m = Integer.parseInt(tempVar);
	 }
	 int[] a = new int[10000];
	 for (i = 1;i <= m;i++)
	 {
	 String tempVar2 = ConsoleInput.scanfRead();
	 if (tempVar2 != null)
	 {
		 a[i] = Integer.parseInt(tempVar2);
	 }
	 }
	 for (i = 1;i <= m;i++)
	 {
	  System.out.printf("%ld\n",f(a[i]));
	 }
	  System.in.read();
	  System.in.read();
	}

}

