package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int[] a = new int[16];
	int sum = 0;
	int j;
	int i;
	int k;
	int n = 0;
	while (true)
	{
		for (i = 0;i < 16;i++)
		{
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a[i] = Integer.parseInt(tempVar);
		}
		n = n + 1;
		if (a[i] == 0)
		{
		   n = n - 1;
		   for (k = 0;k < (n - 1);k++)
		   {
			   for (j = k + 1;j < n;j++)
			   {
				  if ((a[j] == a[k] * 2) || (a[k] == a[j] * 2))
				  {
					sum = sum + 1;
				  }
			   }
		   }
			  System.out.printf("%d\n",sum);
			  i = 0;
			  sum = 0;
			  n = 0;
			  break;
		}
			 else
			 {
			 if (a[i] == -1)
			 {
				return 0;
			 }
			 }
		}
	}
	return 0;
	}

}

