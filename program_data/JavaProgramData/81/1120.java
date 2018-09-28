package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		void trans(int p[5],int n,int m);
		int f = new int(int n,int m);
		int[][] arr = new int[5][5];
		int i;
		int j;
		int p;
		int m;
		int n;
		for (i = 1;i <= 5;i++)
		{
			for (j = 1;j <= 5;j++)
			{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				arr[i - 1][j - 1] = Integer.parseInt(tempVar);
			}
			}
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			n = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			m = Integer.parseInt(tempVar3);
		}
		p = f(n, m);
		if (p == 0)
		{
			System.out.print("error");
		}
		if (p == 1)
		{
		 trans(arr, n, m);
		   for (i = 0;i <= 4;i++)
		   {
			  for (j = 0;j <= 3;j++)
			  {
			  System.out.printf("%d ",arr[i][j]);
			  }

			  System.out.printf("%d\n",arr[i][4]);
		   }
		   System.out.print("\b");
		}



	  return 0;
	}
	public static int f(int n,int m)
	{
		if (m <= 4)
		{
			if (n <= 4)
			{
				return 1;
			}
		}
		if (m >= 5)
		{
			return 0;
		}
		if (n >= 5)
		{
			return 0;
		}
	}
	public static void trans(int[] p, int n, int m)
	{
		 int i;
		 int temp;
		 int p1;
		 int p2;
		 for (i = 1;i <= 5;i++)
		 {
			 temp = (p[n] + i - 1);
			 *(p[n] + i - 1) = *(p[m] + i - 1);
			 *(p[m] + i - 1) = temp;
		 }
	}

}

