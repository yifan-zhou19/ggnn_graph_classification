package <missing>;

public class GlobalMembers
{
	public static int m;
	public static int n;
	public static int huiwen(int x,int y)
	{
		if (x == 0)
		{
			return y;
		}
		else
		{
			y = y * 10 + x % 10;
			return huiwen(x / 10, y);
		}
	}
	public static int zhishu(int k)
	{
		int z;
		for (z = 2;z <= Math.sqrt(k);z++)
		{
			if (k % z == 0)
			{
				break;
			}
		}
		if (z > Math.sqrt(k))
		{
			return 1;
		}
		else
		{
			return 0;
		}
	}
	public static void Main()
	{
		int m;
		int n;
		int i;
		int c = 0;
		int t = 0;
		int a;
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
			t = huiwen(i, 0);
			if (t == i)
			{
				a = zhishu(i);
				if (a == 1)
				{
					c++;
					if (c == 1)
					{
						System.out.printf("%d",i);
					}
					else
					{
						System.out.printf(",%d",i);
					}
				}
			}
		}
		if (c == 0)
		{
			System.out.print("no");
		}
		System.out.print("\n");
	}

}

