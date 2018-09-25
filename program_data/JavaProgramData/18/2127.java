package <missing>;

public class GlobalMembers
{
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on the parameter 'p', so pointers on this parameter are left unchanged:
	public static int min(int * p, int n)
	{
		int k;
		int i;
		k = p;
		p++;
		for (i = 1;i < n;i++,p++)
		{
		 if (*p < k)
		 {
		 k = p;
		 }
		}
		return (k);
	}
	public static int Main()
	{
		int i;
		int j;
		int n;
		int m;
		int p;
		int q;
		int w;
		int xiao;
		int s;
		int[][] a = new int[101][101];
		int[] b = new int[101];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
	 for (w = 0;w < n;w++) //???w???
	 {

	   for (i = 0;i < n;i++) //input
	   {
		   b[i] = 0;
		for (j = 0;j < n;j++)
		{
		 String tempVar2 = ConsoleInput.scanfRead();
		 if (tempVar2 != null)
		 {
			 a[i][j] = Integer.parseInt(tempVar2);
		 }
		}
	   }

	   s = 0;
	   for (m = n;m > 1;m--) //?????
	   {
		for (i = 0;i < m;i++)
		{
		b[i] = 0;
		}
		for (i = 0;i < m;i++) //?????
		{
			xiao = min(a[i], m);
			if (xiao == 0)
			{
				for (j = 0;j < m;j++)
				{
					if (a[i][j] == 0)
					{
					b[j]++;
					}
				}
				continue;

			}
			else
			{
				for (j = 0;j < m;j++)
				{
					a[i][j] -= xiao;
					if (a[i][j] == 0)
					{
					b[j]++;
					}
				}
			}
		}
		for (i = 0;i < m;i++) //?i?????
		{
			if (b[i] != 0)
			{
			continue;
			}
			else
			{
				xiao = a[0][i];
				for (j = 1;j < m;j++)
				{
				if (a[j][i] < xiao)
				{
				xiao = a[j][i];
				}
				}
				for (j = 0;j < m;j++)
				{
					a[j][i] -= xiao;
				}
			}
		}
		s += a[1][1];
		for (i = 0;i < m;i++) //???2?
		{
			if (i == 1)
			{
				continue;
			}
			else
			{
				for (j = 1;j < m - 1;j++)
				{
				a[i][j] = a[i][j + 1];
				}
			}
		}
		for (i = 0;i < m - 1;i++) //???2?
		{
		for (j = 1;j < m - 1;j++)
		{
		a[j][i] = a[j + 1][i];
		}
		}


	   }
	   System.out.printf("%d\n",s);

	 }


	}
}

