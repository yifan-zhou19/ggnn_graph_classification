package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int f = int n;
		int n;
		int[] a = new int[10];
		int i;
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
		for (i = 0;i < n;i++)
		{
		System.out.printf("%d\n",f(a[i]));
		}
		 return 0;
	}
		public static int f(int n)
		{
		int b;
	   if (n == 1 || n == 2)
	   {
	   b = 1;
	   }
	   else
	   {
	   b = f(n - 1) + f(n - 2);
	   }
	   return (b);
		}

}

