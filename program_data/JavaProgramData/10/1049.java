package <missing>;

public class GlobalMembers
{
	public static int max(int x,int y)
	{
		if (x >= y)
		{
			return x;
		}
		else
		{
			return y;
		}
	}
	public static int haha(int[] a, int[] b, int k)
	{
		int i;
		int j;
		int c = 0;
		b[k - 1] = 1;
		for (i = k - 2;i >= 0;i--)
		{
			 for (j = i + 1;j < k;j++)
			 {
				  if (a[i] >= a[j])
				  {
					  c = max(c, b[j]);
				  }
			 }
			 b[i] = c + 1;
			 c = 0;
		}
		for (i = k - 1;i > -1;i--)
		{
			c = max(c, b[i]);
		}
		return c;
	}
	public static int Main()
	{
		int[] a = new int[25];
		int[] b = new int[25];
		int k;
		int i;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			k = Integer.parseInt(tempVar);
		}
		for (i = 0;i < k;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[i] = Integer.parseInt(tempVar2);
			}
		}
		System.out.printf("%d",haha(a, b, k));

	}

}

