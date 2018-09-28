package <missing>;

public class GlobalMembers
{
	public static int[] a = new int[5000];
	public static int Main()
	{
		int sushu = int y;
		int x;
		int i;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			x = Integer.parseInt(tempVar);
		}
		for (i = 0;i < x / 2;i++)
		{
			a[i] = i + 1;
		}
		for (i = 2;i < x / 2;i++)
		{
			if (sushu(a[i]) != 0 && sushu(x - a[i]) != 0)
			{
					System.out.printf("%d %d\n",a[i],x - a[i]);
			}
		}
		return 0;
	}
	public static int sushu(int y)
	{
		int i;
		for (i = 2;i < y / 2 + 2;i++)
		{
			if (y % i == 0)
			{
				break;
			}
		}
		if (i < y / 2 + 1)
		{
			return 0;
		}
		else
		{
			return 1;
		}
	}

}

