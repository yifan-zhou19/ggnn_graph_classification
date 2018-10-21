package <missing>;

public class GlobalMembers
{
	// ?????.cpp : Defines the entry point for the console application.
	//

	public static void reverse(int x, int k)
	{
		if (x < 0)
		{
			x = -x;
		}
		if (x % 10 != 0)
		{
			k++;
		}
		if (x / 10 == 0)
		{
			System.out.printf("%d\n",x);
		}
		else
		{
			if (k != 0)
			{
				System.out.printf("%d",x % 10);
			}
			reverse(x / 10, k);
		}

	}
	public static void Main(String[] args)
	{
		int i;
		int n;
		for (i = 0;i < 6;i++)
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				n = Integer.parseInt(tempVar);
			}
			if (n < 0)
			{
				System.out.print("-");
			}
			reverse(n, 0);
		}
	}


}

