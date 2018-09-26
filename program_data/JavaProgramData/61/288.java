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
		   return f(n - 2) + f(n - 1);
	   }
	}
	public static int Main()
	{
		int n;
		int i;
		int[] a = new int[100];
		int m;
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
	 System.out.printf("%d\n",f(a[i]));
	}
	System.in.read();
	System.in.read();
	System.in.read();
	}
}

