package <missing>;

public class GlobalMembers
{
	public static int m;
	public static int n;
	public static int num(int a,int b,int c)
	{
		int i;
		int j;
		if ((a == 0) || (a == 10) || (b == 0) || (b == 10))
		{
		return 0;
		}
		else if (c == 0)
		{
		   if (a == 5 && b == 5)
		   {
		   return m;
		   }
		   else
		   {
			   return 0;
		   }
		}
		else
		{
		   int d = num(a, b, c - 1);
		   for (i = a - 1;i <= a + 1;i++)
		   {
			  for (j = b - 1;j <= b + 1;j++)
			  {
			  d = d + num(i, j, c - 1);
			  }
		   }
		   return d;
		}
	}
	public static int Main()
	{
		int i;
		int j;
		int s;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			n = Integer.parseInt(tempVar2);
		}
		for (i = 1;i <= 9;i++)
		{
			for (j = 1;j <= 9;j++)
			{
				s = num(i, j, n);
				if (j == 9)
				{
				System.out.printf("%d\n",s);
				}
				else
				{
					System.out.printf("%d ",s);
				}
			}
		}
		return 0;

	}


}

