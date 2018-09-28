package <missing>;

public class GlobalMembers
{
	   public static int tran(int x)
	   {
	   int t = 0;
	   int y = x;
	   while (y > 0)
	   {
		  t = 10 * t + y % 10;
		  y /= 10;
		  tran(y);
	   }
	   if (x == t)
	   {
		 return (1);
	   }
	   }
	public static void Main()
	{
		int tran = int x;
		int m;
		int n;
		int i;
		int j;
		int s;
		int t;
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
		t = 0;
		for (i = m;i <= n;i++)
		{
			s = 0;
			for (j = 2;j < i;j++)
			{
				if (i % j == 0)
				{
					s++;
				}
			}
			if ((s == 0) && (tran(i) == 1))
			{
				if (t >= 1)
				{
					System.out.print(",");
				}
				System.out.printf("%ld",i);
				t++;
			}
		}
		if (t == 0)
		{
			System.out.print("no\n");
		}
	}





}

