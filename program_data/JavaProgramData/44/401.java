package <missing>;

public class GlobalMembers
{
	public static int reverse(int num)
	{
		int i;
		int j;
		int[] a = new int[100];
		int m = 0;
		int d;
		d = 1;
		if (num < 0)
		{
			num = -num;
			d = 0;
		}
		for (i = 0;1;i++)
		{
			if (num < 10)
			{
				break;
			}
			a[i] = num % 10;
			num = num / 10;
		}
		for (j = 0;j < i;j++)
		{
			m += a[j] * (Math.pow(10,(i - j)));
		}
		m += num;
		if (d == 0)
		{
			return -m;
		}
		else
		{
			return m;
		}
	}
	public static int Main()
	{
		 int i;
		 int n;
		 int result;
		for (i = 0;i < 6;i++)
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				n = Integer.parseInt(tempVar);
			}
			result = reverse(n);
			if (i < 5)
			{
			System.out.printf("%d\n",result);
			}
			else
			{
			System.out.printf("%d",result);
			}
		}
		return 0;
	}
}

