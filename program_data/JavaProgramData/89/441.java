package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int k;
		int m;
		int x;
		int y;
		int[][] a = new int[100000][2];
		int b;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < 100000;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[i][0] = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				a[i][1] = Integer.parseInt(tempVar3);
			}
			if (a[i][0] == a[i][1] && a[i][0] == 0)
			{
			break;
			}
		}
		m = 0;
		for (j = 0;j < n;j++)
		{
		  for (k = 0;k < i;k++)
		  {
		  if (j == a[k][0])
		  {
		  break;
		  }
		  }
		  if (k == i)
		  {
				  b = j;
				  m++;
		  }
		}
		if (m != 1)
		{
		System.out.print("NOT FOUND");
		}
		else
		{
		x = 0;
		y = 0;
			for (k = 0;k < i;k++)
			{
			  if (a[k][1] == b)
			  {
			  x++;
			  }
			}
			if (x >= n - 1)
			{
			System.out.printf("%d\n",b);
			y++;
			}

		if (y == 0)
		{
		System.out.print("NOT FOUND");
		}
		}
		System.in.read();
		System.in.read();
		System.in.read();
		System.in.read();
	}


}

