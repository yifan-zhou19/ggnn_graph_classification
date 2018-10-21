package <missing>;

public class GlobalMembers
{
	public static int re(int n)
	{
		int result = 0;
		if (n > 0)
		{
		   while (n > 0)
		   {
			  result = result * 10 + n % 10;
			  n /= 10;
		   }
		}
		else if (n < 0)
		{
			n = 0 - n;
			while (n > 0)
			{
			  result = result * 10 + n % 10;
			  n /= 10;
			}
		   result = 0 - result;
		}
		return result;
	}
	public static int Main()
	{
		int i;
		int z;
		int f;
		for (i = 0;i < 6;i++)
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				z = Integer.parseInt(tempVar);
			}
			f = re(z);
			System.out.printf("%d\n",f);
		}
		return 0;
	}
}

