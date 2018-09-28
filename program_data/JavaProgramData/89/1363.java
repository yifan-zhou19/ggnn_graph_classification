package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int[] a = new int[100000];
		int[] b = new int[100000];
		int i;
		int j;
		int k;
		int n;
		int m = 0;
		int r;
		int t;
		int p = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			a[m] = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead(" ");
		if (tempVar3 != null)
		{
			b[m] = Integer.parseInt(tempVar3);
		}
		while (a[m] != 0 || b[m] != 0)
		{
			m++;
		   String tempVar4 = ConsoleInput.scanfRead();
		   if (tempVar4 != null)
		   {
			   a[m] = Integer.parseInt(tempVar4);
		   }
		   String tempVar5 = ConsoleInput.scanfRead(" ");
		   if (tempVar5 != null)
		   {
			   b[m] = Integer.parseInt(tempVar5);
		   }
		}
		for (k = 0;k < n;k++)
		{
		   r = 0;
		   t = 0;
		   for (j = 0;j < m;j++)
		   {
			  if (a[j] == k)
			  {
			  r = 1;
			  break;
			  }
		   }
		   if (r == 1)
		   {
			   continue;
		   }
		   for (j = 0;j < m;j++)
		   {
			  if (b[j] == k)
			  {
				  t++;
			  }
		   }
		   if (t == n - 1)
		   {
			   System.out.printf("%d\n",k);
			   p = 1;
		   }
		}
		if (p == 0)
		{
			System.out.print("NOT FOUND\n");
		}
	}



}

