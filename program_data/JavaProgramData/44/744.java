package <missing>;

public class GlobalMembers
{
	public static void make(int k,int x)
	{
		if (x == 0)
		{
			return;
		}
		int y;
		y = x % 10;
		if (k == 0)
		{
			if (y != 0)
			{
				System.out.printf("%d",y);
				make(1, x / 10);
			}
			else
			{
				make(0, x / 10);
			}
		}
		else
		{
			System.out.printf("%d",y);
			make(1, x / 10);
		}
	}
	public static int Main()
	{
		int i;
		int x;
		int j;
		int l;
		int n;
		int t;
		int[] a = new int[100];
		int m;
		for (i = 1;i <= 6;i++)
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				n = Integer.parseInt(tempVar);
			}
			if (n == 0)
			{
				System.out.print("0\n");
				continue;
			}
			if (n < 0)
			{
				System.out.print("-");
			}
			if (n < 0)
			{
				make(0, -n);
			}
			else
			{
				make(0, n);
			}
			System.out.print("\n");
		}
	}
}

