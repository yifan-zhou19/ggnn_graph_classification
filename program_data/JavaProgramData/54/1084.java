package <missing>;

public class GlobalMembers
{
	public static int jisuan(int n,int k)
	{
		int num = 1;
		int x = 1;
		int i;

		while (true)
		{
			for (i = 0;;i++)
			{
				if (x % n == k && x / n > 0)
				{
					x = x / n * (n - 1);
				}
				else
				{
					break;
				}
				if (i == n - 1)
				{
					return num - 1;
				}
			}
			x = num++;
		}
	}

	public static void Main(String[] args)
	{
		int x;
		int y;
		int result;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			x = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			y = Integer.parseInt(tempVar2);
		}
		result = jisuan(x, y);
		System.out.printf("%d\n",result);

	}
}

