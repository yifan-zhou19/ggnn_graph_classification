package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int m;
		int n;
		int i;
		int a;
		int b;
		int r = 0;
		int k;
		int l;
		int d;
		int t;
		int j;
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
			t = 1;
			for (j = 2;j <= i / 2;j++)
			{
				if (i % j == 0)
				{
				t = 0;
				break;
				}
			}
			if (t == 1)
			{
			d = (int)Math.log10(i) + 1;
			}
			for (k = 1;k <= d / 2 + 1;k++)
			{
				   a = i;
				   b = i;
				for (l = 1;l <= k - 1;l++)
				{
					a = a / 10;
				}
				for (l = 1;l <= d - k;l++)
				{
					b = b / 10;
				}
				a = a % 10;
				b = b % 10;
				if (a != b)
				{
					t = 0;
					break;
				}
			}
			if (t == 1)
			{
				if (r == 0)
				{
				System.out.printf("%d",i);
				r = 1;
				}
					 else
					 {
						 System.out.printf(",%d",i);
					 }
			}
		}
	   if (r == 0)
	   {
		   System.out.print("no");
	   }
	   System.out.print("\n");
	}
}

