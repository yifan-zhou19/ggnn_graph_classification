package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[300];
		int[] b = new int[300];
		int m;
		int n;
		int c = 0;
		int d = 1;
		int i;
		int k;
		int j = 0;
		int l;
		int p;

	   for (j = 0;;j++)
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
		   if ((m == 0) && (n == 0))
		   {
			   break;
		   }
		   for (i = 1;i <= n;)
		   {
			a[i] = i;
			i++;
		   }
		i = n;
		a[n + 1] = 0;
			for (d = 1;i > 1;)
			{
				l = d + m - 1;
				c = l / i;
				d = -i * c + l;
			while (d <= 0)
			{
				d = d + i;
			}
				for (k = d;k < i;)
				{
					a[k] = a[k + 1];
					k++;
				}
				a[i] = 0;
				i--;
			}
			b[j] = a[1];
	   }
	   for (p = 0;p < j;p++)
	   {
		   System.out.printf("%d\n",b[p]);
	   }
		return 0;
	}
}

