package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int t;
		int s = 0;
		int[] a = new int[1000];
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
							 t = Integer.parseInt(tempVar2);
						 }
						 if (t % 2 == 1)
						 {
									a[s] = t;
									s++;
						 }
		}
		for (i = 1;i < s;i++)
		{
						   for (j = 0;j < s - i;j++)
						   {
											  if (a[j] > a[j + 1])
											  {
															int t = a[j];
															a[j] = a[j + 1];
															a[j + 1] = t;
											  }
						   }
		}
		for (i = 0;i < s - 1;i++)
		{
		System.out.printf("%d,",a[i]);
		}
		System.out.printf("%d",a[s - 1]);
		return 0;
	}

}

