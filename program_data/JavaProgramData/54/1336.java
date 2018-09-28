package <missing>;

public class GlobalMembers
{
	public static int n;
	public static int k;
	public static int distribute(int m)
	{
		int i;
		int flag = 0;
		for (i = 0;i < n;i++)
		{
			if ((m - k) % n != 0 || m - k == 0)
			{
				flag++;
				return 0;
			}
			m = (m - k) * (n - 1) / n;
		}
		if (flag == 0)
		{
			return 1;
		}
	}
	public static int Main()
	{
		int x;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			k = Integer.parseInt(tempVar2);
		}
		for (x = n * k;;x++)
		{
			if (distribute(x) == 1)
			{
				System.out.printf("%d\n",x);
				break;
			}
		}
	}
}

