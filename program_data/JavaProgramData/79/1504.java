package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int m;
		int n;
		int i = 0;
		int j = 0;
		int k;
		int l;
		int x;
		int y;
	int[] a = new int[301];
	int[] b = new int[301];
	int[] c = new int[301];
	int[] d = new int[301];
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		a[0] = Integer.parseInt(tempVar);
	}
	String tempVar2 = ConsoleInput.scanfRead(" ");
	if (tempVar2 != null)
	{
		b[0] = Integer.parseInt(tempVar2);
	}
	for (i = 0;a[i] != 0 && b[i] != 0;i++)
	{
		   String tempVar3 = ConsoleInput.scanfRead();
		   if (tempVar3 != null)
		   {
			   a[i + 1] = Integer.parseInt(tempVar3);
		   }
		   String tempVar4 = ConsoleInput.scanfRead(" ");
		   if (tempVar4 != null)
		   {
			   b[i + 1] = Integer.parseInt(tempVar4);
		   }
	}
	y = i - 1;
	for (i = 0;i <= y;i++)
	{
			   n = a[i];
			   m = b[i];
			   x = n;
			   for (j = 1;j <= n;j++)
			   {
					  c[j - 1] = j;
			   }
			 for (k = 1;k < x;k++)
			 {
				   for (j = (m % n) + 1;j <= n;j++)
				   {
					   d[j - (m % n) - 1] = c[j - 1];
				   }
				 for (j = 0;j < (m % n);j++)
				 {
					 d[j + n - (m % n)] = c[j];
				 }
				 n--;
				for (l = 0;l <= n;l++)
				{
					c[l] = d[l];
				}
			 }
			  System.out.printf("%d\n",c[0]);
	}
	}

}

