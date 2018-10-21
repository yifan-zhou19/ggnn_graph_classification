package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
	   int m;
	   int n;
	   int[] a = new int[300];
	   int i;
	   int j;
	   int k;
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
		if (n == 0 && m == 0)
		{
			break;
		}
		else
		{
			 for (i = 1;i <= n;i++)
			 {
			a[i] = i;
			 }
		   for (i = 1,j = 1,k = 0;i < n;)
		   {
		   if (a[j] != 0)
		   {
			   k++;
		   }
		   if (k == m)
		   {
			   a[j] = 0;
			   k = 0;
			   i++;
		   }
		   if (j == n)
		   {
			   j = 1;
		   }
			  else
			  {
				  j++;
			  }
		   }
		  for (i = 1;i <= n;i++)
		  {
			if (a[i] != 0)
			{
				System.out.printf("%d\n",a[i]);
			}
		  }
		}
	   }
	}
}

