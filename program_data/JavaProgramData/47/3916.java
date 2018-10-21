package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int[] num = new int[100];
		int i;
		int a;
		int j;
		int b;
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
							 num[i] = Integer.parseInt(tempVar2);
						 }
		}
						 if (n % 2 != 0)
						 {
								   b = (n - 1) / 2;
						 }
						 else
						 {
							  b = n / 2;
						 }
						for (i = 0;i < b;i++)
						{
															  a = num[i];
															  num[i] = num[n - i - 1];
															  num[n - i - 1] = a;
						}

															  for (i = 0;i < n - 1;i++)
															  {
															  System.out.printf("%d ",num[i]);
															  }
															  System.out.printf("%d",num[n - 1]);

															  return 0;
	}

}

