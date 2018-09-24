package <missing>;

public class GlobalMembers
{
	public static int yan(int n)
	{
		if (n == 2)
		{
		return 1;
		}
		else if (n != 2)
		{
			int i;
			int c;
			double s;
			s = Math.sqrt(n);
			c = (int)s + 1;
			for (i = 2;i <= c;i++)
			{
				if (i == 2 || (i + 1) % 2 == 0)
				{
				if (n % i == 0)
				{
					return 0;
				}
				}
				if (i == c)
				{
				return 1;
				}
			}
		}
	}
	public static int Main()
	{
		 int n;
		 int i;
		 int j;
		 String tempVar = ConsoleInput.scanfRead();
		 if (tempVar != null)
		 {
			 n = Integer.parseInt(tempVar);
		 }
		 for (i = 6;i <= n;i++)
		 {
			 if (i % 2 == 0)
			 {
				 double s;
				 s = i / 2;
				 int c;
				 c = (int)s + 1;
				if (yan(i - 2) == 1)
				{
					System.out.printf("%d=2+%d\n",i,i - 2);
				}
				else if (yan(i - 2) == 0)
				{
				for (j = 3;j <= c;j++)
				{
					if ((j + 1) % 2 == 0)
					{
						int xx;
						int yy;
						xx = j;
						yy = i - j;
						if (yan(xx) == 1 && yan(yy) == 1)
						{
						System.out.printf("%d=%d+%d\n",i,j,i - j);
						break;
						}
					}
				}
				}
			 }
		 }
	}
}

