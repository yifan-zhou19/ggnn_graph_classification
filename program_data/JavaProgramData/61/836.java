package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int[] a = new int[1000];
		int[] b = new int[100];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		a[1] = 1;
		a[2] = 1;
		for (i = 1;i <= n;i++)
		{
						 String tempVar2 = ConsoleInput.scanfRead();
						 if (tempVar2 != null)
						 {
							 b[i] = Integer.parseInt(tempVar2);
						 }
		}
		for (i = 3;i <= 1000;i++)
		{
												 a[i] = a[i - 1] + a[i - 2];
		}
		for (i = 1;i <= n;i++)
		{
			 System.out.printf("%d\n",a[b[i]]);
		}
			 System.in.read();
			 System.in.read();
			 System.in.read();
	}

}

