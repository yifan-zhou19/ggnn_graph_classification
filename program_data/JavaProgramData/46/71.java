package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int i;
	int j;
	int k = 0;
	int b = 1;
	int h = 1;
	int l = 1;
	int x;
	int y;
	int[][] a = new int[100][100];
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		x = Integer.parseInt(tempVar);
	}
	String tempVar2 = ConsoleInput.scanfRead();
	if (tempVar2 != null)
	{
		y = Integer.parseInt(tempVar2);
	}
	for (i = 1;i <= x;i++)
	{
		for (j = 1;j <= y;j++)
		{
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			a[i][j] = Integer.parseInt(tempVar3);
		}
		}
	}
	while (k < x * y - 1)
	{
		switch (b)
		{
		 case 1:
		 {
		  for (i = h;i <= y - h;i++)
		  {
		   System.out.printf("%d\n",a[h][i]);
		  }
	   b = 2;
	   k += y - 2 * h + 1;
	   break;
		 }
	  case 2:
	  {
		  for (i = l;i <= x - l;i++)
		  {
		   System.out.printf("%d\n",a[i][y - l + 1]);
		  }
	   b = 3;
	   k += x - 2 * l + 1;
	   break;
	  }
	  case 3:
	  {
		  for (i = y - h + 1;i >= h + 1;i--)
		  {
		   System.out.printf("%d\n",a[x - h + 1][i]);
		  }
	   b = 4;
	   k += y - 2 * h + 1;
	   h++;
	   break;
	  }
	  case 4:
	  {
		  for (i = x - l + 1;i >= l + 1;i--)
		  {
		   System.out.printf("%d\n",a[i][l]);
		  }
	   b = 1;
	   k += x - 2 * l + 1;
	   l++;
	   break;
	  }
		}
	}
	if (x == y)
	{
		System.out.printf("%d",a[h][l]);
	}
	else if (b == 2)
	{
		System.out.printf("%d",a[h][y - h + 1]);
	}
	else if (b == 3)
	{
		System.out.printf("%d",a[x - l + 1][y - l + 1]);
	}
	else if (b == 4)
	{
		System.out.printf("%d",a[x - h + 1][h]);
	}
	else if (b == 1)
	{
		System.out.printf("%d",a[l][l]);
	}
	return 0;
	}

}

