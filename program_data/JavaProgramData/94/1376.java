package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] num = new int[500];
		int n;
		int i;
		int j = 0;
		int k = 0;
		int l = 0;
		int a;
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
		for (j = 0;j < n;j++)
		{
			for (i = 0;i < n - 1;i++)
			{
				if (num[i] > num[i + 1])
				{
					a = num[i + 1];
					num[i + 1] = num[i];
					num[i] = a;
				}
			}
		}
		for (i = 0;i < n;i++)
		{
			if (num[i] % 2 != 0)
			{
			   k++;
			}
		}
			  for (i = 0;i < n;i++)
			  {
				 if (num[i] % 2 != 0)
				 {
					 l++;
						 if (l < k)
						 {
							 System.out.printf("%d,",num[i]);
						 }
						 else
						 {
							 System.out.printf("%d",num[i]);
						 }
				 }
			  }
	   return 0;
	}
}

