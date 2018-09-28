package <missing>;

public class GlobalMembers
{
	public static int yes(int m)
	{
		int j;
		int k;
		int flag = 0;
		k = Math.sqrt(m);
		for (j = 2;j <= k;j++)
		{
			if (m % j == 0)
			{
				break;
			}
		}
		if (j > k)
		{
			flag = 1;
		}
		return (flag);
	}
	public static void Main()
	{
		int n;
		int i;
		int j;
		int flag1 = 0;
		int flag2 = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		if (n % 2 != 0)
		{
			if (n == 3)
			{
				System.out.print("empty");
			}
			if (n != 3)
			{
			for (i = 3;i < n;i++)
			{
				flag1 = yes(i);
				flag2 = yes(i + 2);
				if (flag1 == 1 && flag2 == 1)
				{
					System.out.printf("%d %d\n",i,i + 2);
				}
				else if ((flag1 == 0 && flag2 == 0) || (flag1 == 0 && flag2 == 1) || (flag1 == 0 && flag2 == 0))
				{
					continue;
				}
			}
			}
		}
		 if (n % 2 == 0)
		 {
			 if (n == 4)
			 {
				System.out.print("empty");
			 }
			if (n != 4)
			{
			for (i = 3;i < n - 1;i = i + 2)
			{
				flag1 = yes(i);
				flag2 = yes(i + 2);
				if (flag1 == 1 && flag2 == 1)
				{
					System.out.printf("%d %d\n",i,i + 2);
				}
				else if ((flag1 == 0 && flag2 == 0) || (flag1 == 0 && flag2 == 1) || (flag1 == 0 && flag2 == 0))
				{
					continue;
				}

			}
			}
		 }
	}
}

