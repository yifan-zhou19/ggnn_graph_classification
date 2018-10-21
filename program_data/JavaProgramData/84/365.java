package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[100];
		int i;
		int j;
		int n;
		int t;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
						 System.out.print("\n");
						 String tempVar2 = ConsoleInput.scanfRead();
						 if (tempVar2 != null)
						 {
							 a[i] = Integer.parseInt(tempVar2);
						 }
		}
		for (j = 0;j < 2;j++)
		{
						  for (i = 0;i < n - 1 - j;i++)
						  {
											  if (a[i] > a[i + 1])
											  {
															 t = a[i];
															 a[i] = a[i + 1];
															 a[i + 1] = t;
											  }
						  }
		}
							System.out.printf("%d\n%d",a[n - 1],a[n - 2]);
		System.in.read();
		System.in.read();
	}

}

