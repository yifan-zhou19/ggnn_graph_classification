package <missing>;

public class GlobalMembers
{
	public static int f(int x)
	{
		int k;
		int r = 0;
		for (k = 10;;k = k * 10)
		{
				if (x / k == 0)
				{
				break;
				}
		}
		for (int j = k / 10;j > 0;j = j / 10)
		{
							   r += x / j * (k / j / 10);
							   x = x % j;
		}
	   return r;
	}
	public static int Main()
	{
		int[] a = new int[6];
		for (int i = 0;i < 6;i++)
		{
				String tempVar = ConsoleInput.scanfRead();
				if (tempVar != null)
				{
					a[i] = Integer.parseInt(tempVar);
				}
		}
		for (int i = 0;i < 6;i++)
		{
				System.out.printf("%d\n",f(a[i]));
		}
		return 0;
	}
}

