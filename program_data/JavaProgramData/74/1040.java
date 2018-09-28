package <missing>;

public class GlobalMembers
{
	public static int sushu(int x)
	{
		 int i;
		 for (i = 2;i <= Math.sqrt(x);i++)
		 {
			 if (x % i == 0)
			 {
				 break;
			 }
		 }
		 if (i > Math.sqrt(x))
		 {
			 return (1);
		 }
		 else
		 {
			 return (0);
		 }
	}

	public static int huiwen(int x)
	{
		int n;
		int i;
		if (x < 10)
		{
			return (1);
		}
		else
		{
			if (x < 100 && (x % 10) == (x / 10))
			{
				return (1);
			}
			else
			{
				if (x < 1000 && (x % 10) == (x / 100))
				{
					return (1);
				}
				else
				{
					if (x < 10000 && (x % 10) == (x / 1000) && (x % 100 / 10) == (x / 100 % 10))
					{
						return (1);
					}
					else
					{
						if (x < 100000 && (x % 10) == (x / 10000) && (x % 100 / 10) == (x / 1000 % 10))
						{
							return (1);
						}
			else
			{
				return (0);
			}
					}
				}
			}
		}
	}


	public static void Main()
	{
		int m;
		int n;
		int i;
		int k = 0;
		int o;
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
			if (huiwen(i) != 0 && sushu(i) != 0)
			{
				System.out.printf("%d",i);
				o = i;
				k++;
				break;
			}
		}
		for (i = o + 1;i <= n;i++)
		{
			if (huiwen(i) != 0 && sushu(i) != 0)
			{
				System.out.printf(",%d",i);
				  k++;
			}
		}
		if (k == 0)
		{
			System.out.print("no");
		}
	}
}

