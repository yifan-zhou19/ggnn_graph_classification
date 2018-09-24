package <missing>;

public class GlobalMembers
{
	public static int F(int n)
	{
	 if (n == 0)
	 {
		return 0;
	 }
		if (n == 1)
		{
		return 1;
		}
		return F(n - 1) + F(n - 2);

	}
	public static int Main()
	{
		int[] a = new int[100];
	 int n;
	 int result;
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
	for (i = 0;i < n - 1;i++)
	{
		System.out.printf("%d\n",F(a[i]));
	}
	System.out.printf("%d",F(a[n - 1]));


	 return 0;
	}



}

