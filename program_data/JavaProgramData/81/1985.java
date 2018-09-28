package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int f = new int(int n,int m,int a[5]);
		int n;
		int m;
		int[][] a = new int[5][5];
		int i;
		int j;
		int c;
		int d = 0;

		for (i = 0;i < 5;i++)
		{
			for (j = 0;j < 5;j++)
			{
				String tempVar = ConsoleInput.scanfRead();
				if (tempVar != null)
				{
					*(a + i) + j = tempVar;
				}
			}
		}
			System.out.print("\n");
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
			c = f(n, m, a);
			if (c == 0)
			{
				System.out.print("error");
			}
			else
			{
				for (i = 0;i < 5;i++)
				{
				for (j = 0;j < 4;j++)
				{

				 System.out.printf("%d ",a[i][j]);
				}
				 System.out.printf("%d\n",a[i][4]);
				}
			}

	}
		 public static int f(int n, int m, int[] a)
		 {
			 int p;
			 int b;
			 int i;
			 if ((n >= 0 && n < 5) && (m >= 0 && m < 5))
			 {
				 for (i = 0;i < 5;i++)
				 {
				 p = (a[n] + i);
				 *(a[n] + i) = *(a[m] + i);
				 *(a[m] + i) = p;
				 b = 1;
				 }
			 }
			 else
			 {
				 b = 0;
			 }
			 return b;
		 }

}

