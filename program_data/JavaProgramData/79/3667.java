package <missing>;

public class GlobalMembers
{
	public static void Left(int[] ptr, int hd, int tl)
	{
	   int i;
	   for (i = hd;i < tl;i++)
	   {
		  ptr[i] = ptr[i + 1];
	   }
	   ptr[tl] = 0;
	}

	public static int Main()
	{
		int n;
		int m;
		int m1;
		int[] a = new int[301];
		int[] result = new int[100];
		int i;
		int j = 0;
		int k;
		while (true)
		{
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
		   if (n == 0 && m == 0)
		   {
			   break;
		   }

		   for (i = 1;i <= n;i++)
		   {
			   a[i] = i;
		   }

		   k = 1;
		   for (i = n;i > 1;i--)
		   {
			  if (m % n != 0)
			  {
				  m1 = m % n;
			  }
			  else
			  {
				  m1 = n;
			  }
			  if (k - 1 + m1 <= n)
			  {
				  k += m1 - 1;
			  }
			  else
			  {
				  k = k - 1 + m1 - n;
			  }
			  Left(a, k, n);
			  n--;
		   }
		   j++;
		   result[j] = a[1];
		}

		for (i = 1;i <= j;i++)
		{
			System.out.printf("%d\n",result[i]);
		}

	  return 0;
	}


}

