package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int x;
		int y;
		int t;
		int flag = 0;
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
		int[] a = new int[10000];
		int[] b = new int[10000];
		int i = 0;
		int k = 0;
		int m;
		int q;
		int j;
		if (x == y)
		{
						System.out.printf("%d", x);
		}
		else
		{
		if (x < y)
		{
			   q = x;
			   x = y;
			   y = q;
		}
		while (x > 0)
		{
				  a[i] = x;
				   x = x / 2;

				   i++;
		}
		while (y > 0)
		{
				   b[k] = y;
				   y = y / 2;

				   k++;
		}

		int flg = 0;
		for (t = 0;t < i;t++)
		{
						 for (j = 0;j < k;j++)
						 {
										  if (a[t] == b[j])
										  {
										  System.out.printf("%d", a[t]);
										  flg = 1;
										  break;
										  }
						 }
						 if (flg == 1)
						 {
						 break;
						 }
		}

		if (flg == 0)
		{
		System.out.print("1");
		}
		}

		return 0;
	}

}

