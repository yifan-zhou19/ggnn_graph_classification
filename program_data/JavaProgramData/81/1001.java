package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int[][] a = new int[5][5];
		int j;
		int i;
		int m;
		int n;
		int t;
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *p;
		int p;
				 for (i = 0;i < 5;i++)
				 {
			for (j = 0;j < 5;j++)
			{
				String tempVar = ConsoleInput.scanfRead();
				if (tempVar != null)
				{
					a[i][j] = Integer.parseInt(tempVar);
				}
			}
				 }
			  p = a[0][0];
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			m = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead(" ");
		if (tempVar3 != null)
		{
			n = Integer.parseInt(tempVar3);
		}
		if ((m >= 0) && (m <= 4) && (n >= 0) && (n <= 4))
		{
		   for (i = 0;i < 5;i++)
		   {
			t = (p + 5 * m + i);
			*(p + 5 * m + i) = *(p + 5 * n + i);
			*(p + 5 * n + i) = t;
		   }
		   for (i = 0;i < 5;i++)
		   {
			System.out.printf("%d %d %d %d %d\n",*(a[i] + 0),*(a[i] + 1),*(a[i] + 2),*(a[i] + 3),*(a[i] + 4));
		   }
		}
		else
		{
			System.out.print("error");
		}
	}

}

