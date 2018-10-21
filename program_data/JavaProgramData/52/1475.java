package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[101];
		int n;
		int m;
		int i;
		int p;

		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			m = Integer.parseInt(tempVar2);
		}
		for (i = 1;i <= n;i++)
		{
						 String tempVar3 = ConsoleInput.scanfRead();
						 if (tempVar3 != null)
						 {
							 a[i] = Integer.parseInt(tempVar3);
						 }
		}

		a[0] = a[n];
		for (i = 1;i <= n; i++)
		{
		 p = (n - m + i) % n;
		 System.out.printf("%d", a[p]);
		 //printf("|%d|", n - m + i);
		 if (i != n)
		 {
			 System.out.print(" ");
		 }
		}
	}

}

