package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int k;
		int m;
		int x;
		int p;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int[] a = new int[n];
		k = 0;
		for (i = 1;i <= n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				m = Integer.parseInt(tempVar2);
			}
			if (m % 2 == 1)
			{
				k++;
				a[k] = m;
			}
		}
	  for (p = 0;p < k;p++)
	  {
		  for (i = 1;i <= k - p;i++)
		  {
			  if (a[i] < a[i + 1])
			  {
				  x = a[i + 1];
				  a[i + 1] = a[i];
				  a[i] = x;
			  }
		  }
	  }
	  for (i = 1;i < k;i++)
	  {
		  System.out.printf("%d,",a[k - i + 1]);
	  }
	  System.out.printf("%d",a[1]);
	  return 0;



	}


}

