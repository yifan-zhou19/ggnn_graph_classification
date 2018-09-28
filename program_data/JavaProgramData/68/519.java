package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int i;
		int j;
		int k;
		int s;
		int x;
		int y;
		int t;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 6;i <= n;i += 2)
		{
			for (j = 3;j <= i / 2;j += 2)
			{
				s = 0;
			   for (k = 1;k <= Math.sqrt(j);k += 2)
			   {
				if (j % k == 0 && k != 1)
				{
					s = s + 1;
				}
			   }
				if (s == 0)
				{
				   y = i - j;
				   x = 0;
				   for (t = 1;t <= Math.sqrt(y);t += 2)
				   {
				   if (y % t == 0 && t != 1)
				   {
					   x = x + 1;
				   }
				   }
				   if (x == 0)
				   {
					   System.out.printf("%d=%d+%d\n",i,j,y);
					   break;
				   }
				   else
				   {
					   continue;
				   }
				}

			}
		}
	}
}

