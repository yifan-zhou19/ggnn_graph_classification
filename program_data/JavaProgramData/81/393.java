package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *p,a[5][5],m,n,i,q;
		int p;
		int[][] a = new int[5][5];
		int m;
		int n;
		int i;
		int q;
		p = a[0];
		for (i = 0;i <= 24;i++)
		{
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			p + i = Integer.parseInt(tempVar);
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
		if (m <= 4 && m >= 0 && n >= 0 && n <= 4 && m> n)
		{
			for (i = 0;i < n;i++)
			{
		for (q = 0;q <= 4;q++)
		{
			System.out.printf("%d",*(a[i] + q));
		if (q == 4)
		{
			System.out.print("\n");
		}
		else
		{
			System.out.print(" ");
		}
		}
			}
		for (q = 0;q <= 4;q++)
		{
			System.out.printf("%d",*(a[m] + q));
		if (q == 4)
		{
			System.out.print("\n");
		}
		else
		{
			System.out.print(" ");
		}
		}
		for (i = n + 1;i < m;i++)
		{
		for (q = 0;q <= 4;q++)
		{
			System.out.printf("%d",*(a[i] + q));
		if (q == 4)
		{
			System.out.print("\n");
		}
		else
		{
			System.out.print(" ");
		}
		}
		}
		for (q = 0;q <= 4;q++)
		{
			System.out.printf("%d",*(a[n] + q));
		if (q == 4)
		{
			System.out.print("\n");
		}
		else
		{
			System.out.print(" ");
		}
		}
		for (i = m + 1;i <= 4;i++)
		{
		for (q = 0;q <= 4;q++)
		{
			System.out.printf("%d",*(a[i] + q));
		if (q == 4)
		{
			System.out.print("\n");
		}
		else
		{
			System.out.print(" ");
		}
		}
		}
		}
		if (m <= 4 && m >= 0 && n >= 0 && n <= 4 && n> m)
		{
			for (i = 0;i < m;i++)
			{
		for (q = 0;q <= 4;q++)
		{
			System.out.printf("%d",*(a[i] + q));
		if (q == 4)
		{
			System.out.print("\n");
		}
		else
		{
			System.out.print(" ");
		}
		}
			}
		for (q = 0;q <= 4;q++)
		{
			System.out.printf("%d",*(a[n] + q));
		if (q == 4)
		{
			System.out.print("\n");
		}
		else
		{
			System.out.print(" ");
		}
		}
		for (i = m + 1;i < n;i++)
		{
		for (q = 0;q <= 4;q++)
		{
			System.out.printf("%d",*(a[i] + q));
		if (q == 4)
		{
			System.out.print("\n");
		}
		else
		{
			System.out.print(" ");
		}
		}
		}
		for (q = 0;q <= 4;q++)
		{
			System.out.printf("%d",*(a[m] + q));
		if (q == 4)
		{
			System.out.print("\n");
		}
		else
		{
			System.out.print(" ");
		}
		}
		for (i = n + 1;i <= 4;i++)
		{
		for (q = 0;q <= 4;q++)
		{
			System.out.printf("%d",*(a[i] + q));
		if (q == 4)
		{
			System.out.print("\n");
		}
		else
		{
			System.out.print(" ");
		}
		}
		}
		}
		else
		{
			System.out.print("error");
		}
	}
}

