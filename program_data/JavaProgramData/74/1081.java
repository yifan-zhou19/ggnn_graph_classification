package <missing>;

public class GlobalMembers
{
	public static int huiwen(int n)
	{
		int b = 0;
		int m = n;
		while (n != 0)
		{
			b = b * 10 + n % 10;
		   n /= 10;
		}
		if (b == m)
		{
			return 1;
		}
		else
		{
			return 0;
		}
	}
	public static int sushu(int n)
	{
		int i;
		if (n == 2)
		{
			return 1;
		}
		else
		{
			for (i = 2;i < n;i++)
			{
				if (n % i == 0)
				{
					break;
				}
			}
		}
		 if (i == n)
		 {
			 return 1;
		 }
		 else
		 {
			 return 0;
		 }

	}
	public static int Main()
	{
		int i;
		int m;
		int n;
		int t = 0;
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
			if (sushu(i) != 0 && huiwen(i) != 0)
			{
				System.out.printf("%d",i);
				t++;
				break;
			}
		}
		for (i++;i <= n;i++)
		{
			if (sushu(i) != 0 && huiwen(i) != 0)
			{
				System.out.printf(",%d",i);
				t++;
			}
		}
		if (t == 0)
		{
			System.out.print("no\n");
		}
	}


}

