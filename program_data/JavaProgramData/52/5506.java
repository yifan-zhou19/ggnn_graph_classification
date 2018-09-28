package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int m;
		int i;
		int[] a = new int[100];
		int x = 0;
		int k;
		int c = 0;
		int temp;
		int count = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			m = Integer.parseInt(tempVar2);
		}
		for (i = 0;i < n;i++)
		{
			 String tempVar3 = ConsoleInput.scanfRead();
			 if (tempVar3 != null)
			 {
				 a[i] = Integer.parseInt(tempVar3);
			 }
		}
		if (n % m == 0)
		{
			  k = n / m;
			  for (i = 0;i < m;i++)
			  {
						  x = i;
						  while (c != i || count == 0)
						  {
							 count = 1;
							 if (x + m < n)
							 {
							c = x + m;
							 }
							else
							{
								c = x + m - n;
							}
							// printf("c=%d",c);                              
							 temp = a[c];
							 a[c] = a[i];
							 a[i] = temp;
							 x = c;
						  }
							  //printf("break"); 
							  count = 0;
							  x = 0;
							  c = 0;

			  }
		}

		else
		{
			 count = 0;
			 x = 0;
			 while (count != n)
			 {
							if (x + m < n)
							{
							c = x + m;
							}
							else
							{
								c = x + m - n;
							}
							 temp = a[c];
							 a[c] = a[0];
							 a[0] = temp;
							 x = c;
							 count++;
			 }
		}
		System.out.printf("%d",a[0]);
		for (i = 1;i < n;i++)
		{
		System.out.printf(" %d",a[i]);
		}
			  return 0;
	}

}

