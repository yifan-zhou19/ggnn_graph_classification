package <missing>;

public class GlobalMembers
{
	public static int su(int n)
	{
		int m = 0;
		int i;
		for (i = 1;i < n + 1;i++)
		{
						   if (n % i == 0)
						   {
							   m += 1;
						   }
		}
		if (m == 2)
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
		int n;
		int j = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int i;
		for (i = 1;i < n - 1;i++)
		{
						 if (su(i) == 1 && su(i + 2) == 1)
						 {
									 System.out.printf("%d %d\n",i,i + 2);
									 j++;
						 }
		}
		if (j == 0)
		{
			System.out.print("empty");
		}
		return 0;
	}

}

