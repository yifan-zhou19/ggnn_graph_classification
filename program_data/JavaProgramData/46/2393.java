package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int[][] a = new int[100][100];
	int i;
	int j;
	int m;
	int n;
	int k;
	int s = 0;
	int x;
	int y;
	double l = 0;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		m = Integer.parseInt(tempVar);
	}
	String tempVar2 = ConsoleInput.scanfRead(" ");
	if (tempVar2 != null)
	{
		n = Integer.parseInt(tempVar2);
	}
	for (i = 0;i < m;i++)
	{
		   for (j = 0;j < n;j++)
		   {
		   String tempVar3 = ConsoleInput.scanfRead();
		   if (tempVar3 != null)
		   {
			   a[i][j] = Integer.parseInt(tempVar3);
		   }
		   }
	}
	i = 0;
	for (j = 0;j < n;j++)
	{
		   System.out.printf("%d\n",a[i][j]);
		   s++;
		   if (s == m * n)
		   {
		   return 0;
		   }
	}
	i = 0;
	j = n - 1;
	for (k = 1;k > 0;k++)
	{
		   for (x = m - k;x > 0;x--)
		   {
				   i += (int)Math.pow(-1,l);
				   System.out.printf("%d\n",a[i][j]);
				   s++;
				   if (s == m * n)
				   {
				   return 0;
				   }
		   }
		   for (x = n - k;x > 0;x--)
		   {
				   j += (int)Math.pow(-1,l + 1);
				   System.out.printf("%d\n",a[i][j]);
				   s++;
				   if (s == m * n)
				   {
				   return 0;
				   }
		   }
		   l++;
	}
	}

}

