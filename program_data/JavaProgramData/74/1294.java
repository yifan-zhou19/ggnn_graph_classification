package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m;
		int n;
		int i;
		int j;
		int k = 1;
		int s = 0;
		int t = 1;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			n = Integer.parseInt(tempVar2);
		}
		for (i = m;i <= n;i++)
		{
			for (j = i;j != 0;j = j / 10)
			{
				   s = 10 * s + j % 10;
			}
			if (s == i)
			{
			   for (j = 2;j * j <= i;j++)
			   {
				   if (i % j == 0)
				   {
					   k = 0;
					   break;
				   }
			   }
			   if (k == 1 && t == 1)
			   {
				   System.out.printf("%d",i);
				   t = 2;
			   }
			   else if (k == 1 && t != 1)
			   {
				   System.out.printf(",%d",i);
			   }
			}
			k = 1;
			s = 0;
		}
		if (t == 1)
		{
			System.out.print("no");
		}
		return 0;
	}
}

