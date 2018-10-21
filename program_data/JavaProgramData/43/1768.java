package <missing>;

public class GlobalMembers
{
	public static int sushu(int n)
	{
		int a;
		int i;

		if (n <= 1)
		{
			return (0);
		}
		if (n == 2)
		{
			return (1);
		}
		if (n % 2 == 0)
		{
			return (0);
		}

		a = Math.sqrt(n) + 1;
		for (i = 3; i <= a; i += 2)
		{
		   if (n % i == 0)
		   {
			   return (0);
		   }
		}
		  return (1);
	}
	public static int Main()
	{
		int x;
		int y;
		int z;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			x = Integer.parseInt(tempVar);
		}
		for (y = 3;y <= x / 2;y += 2)
		{
				z = x - y;
				if (sushu(y) != 0 && sushu(z) != 0)
				{
					System.out.printf("%d %d\n",y,z);
				}
		}
		return 0;
	}
}

