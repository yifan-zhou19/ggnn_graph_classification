package <missing>;

public class GlobalMembers
{
	public static int shulie(int[] a)
	{
		int i;
		int x1 = 0;
		for (i = 9;i >= 0;i--)
		{
			a[i] = a[i + 1] / 2;
			if (a[i] != 0)
			{
				x1 = i;
			}
		}
		return x1;
	}

	public static void Main()
	{
		int[] x = new int[11];
		int[] y = new int[11];
		int i = 0;
		int x1;
		int y1;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			x[10] = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			y[10] = Integer.parseInt(tempVar2);
		}
		if (x[10] == 1 || y[10] == 1)
		{
			System.out.print("1");
		}
		else
		{
			{
				x1 = shulie(x);
			 y1 = shulie(y);
			 for (i = 0;i < 11;i++)
			 {
				  if (x[x1] != y[y1])
				  {
					  System.out.printf("%d",x[x1 - 1]);
					  break;
				  }
				  else
				  {
					  x1++;
						y1++;
						continue;
				  }
			 }
	}
		}
	}
}

