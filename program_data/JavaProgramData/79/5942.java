package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int[] a = new int[301];
		int[] c = new int[21];
		int k;
		int n;
		int m;
		int i;
		int x;
		int j;
		for (k = 1;;k++)
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
			for (i = 1;i <= n;i++)
			{
				a[i] = 1;
			}
			x = 0;
			for (i = 1;i <= n - 1;i++)
			{
			   for (j = 0;j < m;)
			   {
				   if (x == n)
				   {
					   x = 1;
				   }
				   else
				   {
					   x++;
				   }
				   if (a[x] == 1)
				   {
					   j++;
				   }
				   else
				   {
					   continue;
				   }
			   }
			   a[x] = 0;
			}
			for (i = 1;i <= n;i++)
			{
				if (a[i] == 1)
				{
					c[k] = i;
				}
			}
			if ((n == 0) || (m == 0))
			{
				break;
			}
		}
		for (m = 1;m < k;m++)
		{
			System.out.printf("%d\n",c[m]);
		}
	}


}

