package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n = 1;
		int m;
		int[] a = new int[300];
		int[] b = new int[300];
		int i;
		int k;
		int j;
		for (;;)
		{
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
			if (n == 0)
			{
				break;
			}
			for (i = 0;i < n;i++)
			{
				a[i] = i + 1;
			}
			while (n > 1)
			{
				  if (m % n == 0)
				  {
					  k = n;
				  }
				  else
				  {
					  k = m % n;
				  }
				  for (i = k,j = 0;i < n;i++,j++)
				  {
					  b[j] = a[i];
				  }
				  for (i = 0;i < k - 1;i++,j++)
				  {
					  b[j] = a[i];
				  }
				  n -= 1;
				  for (i = 0;i < n;i++)
				  {
					  a[i] = b[i];
				  }
			}
			System.out.printf("%d\n",a[0]);
		}
	}






}

