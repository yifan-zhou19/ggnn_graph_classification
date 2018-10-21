package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int k;
		int i;
		int j;
		int a = 0;
		int b;
		int s1;
		int s2;
		int x;
		int y;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			k = Integer.parseInt(tempVar2);
		}
		for (i = 1;a == 0;i++)
		{
		   x = n * i + k;

		   for (j = 1;j <= n - 1;j++)
		   {
			   b = x;
			   y = (n * x) / (n - 1) + k;
			   x = y;
			   s1 = (y - k) * (n - 1);
			   s2 = n * b;
			   if (s1 != s2)
			   {
				   break;
			   }
		   }
			if (s1 != s2)
			{
				continue;
			}
			a = 1;



		}

		System.out.printf("%d\n",y);
	}
}

