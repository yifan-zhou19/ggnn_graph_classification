package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int[] n = new int[10000];
		int[] m = new int[10000];
		int sum;
		int k;
		int q;
		int f;
		int p = 0;
	  for (i = 1;i < 10000;i++)
	  {
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				n[i] = Integer.parseInt(tempVar);
			}
			String tempVar2 = ConsoleInput.scanfRead(" ");
			if (tempVar2 != null)
			{
				m[i] = Integer.parseInt(tempVar2);
			}
			if (n[i] == 0)
			{
				break;
			}
			p++;
	  }
		i = 1;
		int y;
		int[] a = new int[10000];
		while (i <= p)
		{
			 if (n[i] == 1 || m[i] == 1)
			 {
			 System.out.printf("%d\n",n[i]);
			 }
			 else
			 {
				 for (y = 0;y < 10000;y++)
				 {
				   a[y] = 1;
				 }
			 sum = 0;
			 k = 0;
			 q = 0;
			 while (q != n[i] - 1)
			 {
			  sum = sum + a[k];
			  if (sum == m[i])
			  {
					 a[k] = 0;
				  q++;
				  sum = 0;
			  }
			  if (a[k] != 0)
			  {
					  f = k + 1;
			  }
				  k++;
			  if (k >= n[i])
			  {
					 k = 0;
			  }
			 }
			 System.out.printf("%d\n",f);
			 }
			 i++;
		}
	}

}

