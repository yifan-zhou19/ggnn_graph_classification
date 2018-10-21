package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int x;
		int[] a = new int[20000];
		int[] b = new int[20000];
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
		b[0] = a[0];
		for (j = 1;j <= n;j++)
		{
						 x = 0;
						 for (i = 0;i < j;i++)
						 {
										 if (a[j] == a[i])
										 {
										 x++;
										 }
						 }
						 if (x == 0)
						 {
						 b[j] = a[j];
						 }
						 else
						 {
							 b[j] = 0;
						 }
		}
		System.out.printf("%d",b[0]);
		for (i = 1;i < n;i++)
		{
						 if (b[i] != 0)
						 {
						 System.out.printf(" %d",b[i]);
						 }
		}
		System.in.read();
		System.in.read();
	}

}

