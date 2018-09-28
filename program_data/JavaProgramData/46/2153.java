package <missing>;

public class GlobalMembers
{
	public static void f(int[][] a, int m, int p, int q)
	{
	   int n = 0;
	   int i;
	   int j;
	   int w;
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
	   int * pt;
	   w = (p + 1) * (q + 1);
	   for (j = 1;;j++)
	   {
		   for (pt = a[m][m];pt <= a[m][p];pt++)
		   {
			   System.out.printf("%d\n",*pt);
			   n++;
		   }
		   if (n == w)
		   {
			   break;
		   }
		   for (i = m + 1;i <= q;i++)
		   {
			   System.out.printf("%d\n",a[i][p]);
			   n++;
		   }
		   if (n == w)
		   {
			   break;
		   }
		   for (pt = a[q][p - 1];pt >= a[q][m];pt--)
		   {
			   System.out.printf("%d\n",*pt);
			   n++;
		   }
		   if (n == w)
		   {
			   break;
		   }
		   for (i = q - 1;i >= m + 1;i--)
		   {
			   System.out.printf("%d\n",a[i][m]);
			   n++;
		   }
		   if (n == w)
		   {
			   break;
		   }
		   m++;
		   p--;
		   q--;
	   }

	}
	public static void Main()
	{
		int row;
		int col;
		int i;
		int j;
		int[][] a = new int[100][100];
		int m = 0;
		int p;
		int q;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			row = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			col = Integer.parseInt(tempVar2);
		}
		for (i = 0;i < row;i++)
		{
			for (j = 0;j < col;j++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					a[i][j] = Integer.parseInt(tempVar3);
				}
			}
		}
		p = col - 1;
		q = row - 1;
		f(a, m, p, q);
	}

}

