package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] f = new int[20];
		int[] a = new int[20];
		int i;
		int j;
		int n;
	 String tempVar = ConsoleInput.scanfRead();
	 if (tempVar != null)
	 {
		 n = Integer.parseInt(tempVar);
	 }

	 f[1] = 1;
	 f[2] = 1;
	for (i = 2;i <= 20;i++)
	{
		f[i + 1] = f[i] + f[i - 1];
	}

	for (i = 1;i <= n;i++)
	{
		   String tempVar2 = ConsoleInput.scanfRead();
		   if (tempVar2 != null)
		   {
			   a[i] = Integer.parseInt(tempVar2);
		   }
	System.out.print("\n");
	}
	for (j = 1;j <= n;j++)
	{
		 System.out.printf("%d",f[a[j]]);
	System.out.print("\n");
	}

	}

}

