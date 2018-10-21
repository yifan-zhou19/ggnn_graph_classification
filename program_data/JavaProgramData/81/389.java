package <missing>;

public class GlobalMembers
{
	public static int change(int[] a, int m, int n)
	{
		int b;
		int i;
		int temp;
		if (n < 0 || n>4 || m < 0 || m>4)
		{
			b = 0;
		}
		else
		{
			for (i = 0;i < 5;i++)
			{
			 temp = (a[n] + i);
			 *(a[n] + i) = *(a[m] + i);
			 *(a[m] + i) = temp;
			}
			b = 1;
		}
		return b;
	}
	public static int Main()
	{
		int[][] a = new int[5][5];
		int i;
		int j;
		(int)(*p)[5];
		int m;
		int n;
		int b;
		p = a;
		for (i = 0;i < 5;i++)
		{
			for (j = 0;j < 5;j++)
			{
				String tempVar = ConsoleInput.scanfRead();
				if (tempVar != null)
				{
					a[i] + j = Integer.parseInt(tempVar);
				}
			}
		}
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
		b = change(p, m, n);
		if (b != 0)
		{
			for (i = 0;i < 5;i++)
			{
			System.out.print("\n");
					 System.out.printf("%d",a[i][0]);
			for (j = 1;j < 5;j++)
			{
				System.out.printf(" %d",a[i][j]);
			}


			}
		}
			else
			{
				System.out.print("\nerror\n");
			}
			return 0;
	}



}

