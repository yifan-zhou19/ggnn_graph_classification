package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int huiwen = int a;
		int sushu = int t;
		int m;
		int n;
		int i;
		int l = 0;
		int t;
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

		for (i = m;i <= n;i++)
		{
			if ((huiwen(i)) == 1)
			{
				if ((sushu(i)) == 1)
				{
					  System.out.printf("%d",i);
				   l++;
					break;
				}
			}
		}

		if (l == 0)
		{
			System.out.print("no");
		}


		for (t = i + 1;t <= n;t++)
		{
			if ((huiwen(t)) == 1)
			{
				if ((sushu(t)) == 1)
				{
				  System.out.printf(",%d",t);
				}
			}

		}
	}

		public static int huiwen(int a)
		{
			int c = 0;
			int temp = a;
			while (temp > 0)
			{
				c = c * 10 + temp % 10;
			  temp = temp / 10;
			}
				if (a == c)
				{
				return (1);
				}
			else
			{
				return (0);
			}
		}
		public static int sushu(int t)
		{
			int i;
		   for (i = 2;i <= Math.sqrt(t);i++)
		   {
			   if (t % i == 0)
			   {
				   break;
			   }
		   }
			   if (i > Math.sqrt(t))
			   {
				   return (1);
			   }
			   else
			   {
				   return (0);
			   }
		}

}

