package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int[] a = new int[50000];
		int[] b = new int[50000];
		int i;
		int r;
		int y;
		y = 0;
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
						 String tempVar3 = ConsoleInput.scanfRead(" ");
						 if (tempVar3 != null)
						 {
							 b[i] = Integer.parseInt(tempVar3);
						 }
		}
		for (i = 1;i < n;i++)
		{
						 for (r = 0;r < n - i;r++)
						 {
											if (a[r] > a[r + 1])
											{
															int x;
															x = a[r + 1];
															a[r + 1] = a[r];
															a[r] = x;
															x = b[r + 1];
															b[r + 1] = b[r];
															b[r] = x;
											}
						 }
		}
		for (i = 0;i < n;i++)
		{
						 if (b[i] < a[i + 1])
						 {
										 y = 1;
										 break;
						 }
						 else
						 {
							  a[i + 1] = a[i];
							  if (b[i] > b[i + 1])
							  {
											  b[i + 1] = b[i];
							  }
						 }
		}
		if (y == 1)
		{
				 System.out.print("no");
		}
		if (y == 0)
		{
				 System.out.printf("%d %d",a[n],b[n]);
		}
		return 0;
	}

}

