package <missing>;

public class GlobalMembers
{
	public static int issushu(int n)
	{
		int i;
		int flag = 1;
		for (i = 2;i < n;i++)
		{
			if (n % i == 0)
			{
				flag = 0;
			}
		}
		return flag;
	}
	public static int[] a = new int[1000];
	public static int[] b = new int[1000];
	public static int Main()
	{
		int n;
		int j;
		int q;
		int i;
		int count = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 2;i <= (n / 2);i++)
		{
			j = issushu(i);
			q = issushu(n - i);
			if ((j == 1) && (q == 1))
			{
				a[count] = i;
				b[count] = n - i;
				count++;
			}
		}
		if (count != 0)
		{
		for (i = 0;i < count;i++)
		{
			System.out.printf("%d %d\n",a[i],b[i]);
		}
		}
		return 0;
	}
}

