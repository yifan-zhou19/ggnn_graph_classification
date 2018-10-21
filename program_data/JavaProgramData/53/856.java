package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int sum;
		int sz = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int[] a = new int[300];
		int[] b = new int[300];
		int i;
		int j = 0;
		for (i = 0;i < n;i++)
		{
						 String tempVar2 = ConsoleInput.scanfRead();
						 if (tempVar2 != null)
						 {
							 a[i] = Integer.parseInt(tempVar2);
						 }
		}
		System.out.printf("%d",a[0]);
		for (i = 0;i < n;i++)
		{
						 for (j = 0;j < i;j++)
						 {
										  sum = 0;
										  if (a[i] == a[j])
										  {
														 sum = sum + 1;
														 break;
										  }
						 }
								   if (sum == 0)
								   {
												 System.out.printf(",%d",a[i]);
								   }
		}
		return 0;

	}
}

