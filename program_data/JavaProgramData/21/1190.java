package <missing>;

public class GlobalMembers
{
	public static int a(int k)
	{
		if (k > 0)
		{
		return k;
		}
		return -k;
	}
	public static int Main()
	{
		int[] num = new int[300];
		int n;
		int i;
		int flag = 1;
		int sum = 0;
		int max = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 1;i <= n;i++)
		{
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			num[i] = Integer.parseInt(tempVar2);
		}
		sum += num[i];
		}
		for (i = 1;i <= n;i++)
		{
						if (max < a(num[i] * n - sum))
						{
						max = a(num[i] * n - sum);
						}
		}
		for (i = 1;i <= n;i++)
		{
						 if (max == sum - num[i] * n)
						 {
											  if (flag == 0)
											  {
											  System.out.print(",");
											  }
											  flag = 0;
						 System.out.printf("%d",num[i]);
						 }
		}
		for (i = 1;i <= n;i++)
		{
						 if (max == -sum + num[i] * n)
						 {
							 if (flag == 0)
							 {
											  System.out.print(",");
							 }
											  flag = 0;
						 System.out.printf("%d",num[i]);
						 }
		}
		return 0;
	}

}

