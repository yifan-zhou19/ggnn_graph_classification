package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int reverse = int num;
		int num;
		int i;
		for (i = 0;i < 6;i = i + 1)
		{
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			num = Integer.parseInt(tempVar);
		}
		num = reverse(num);
		System.out.printf("%d\n",num);
		}
	}

	public static int reverse(int num)
	{
		int[] a = new int[5];
		int n;
		int i;
		int t;
		int sign = 1;
		if (num == 0)
		{
		return (num);
		}
		else
		{
		if (num < 0)
		{
		sign = -1;
		}
		num = num * sign;
		n = Math.log10(num);
		for (i = 0;i <= n;i = i + 1)
		{
		a[i] = num / Math.pow(10,n - i);
		num = num - a[i] * Math.pow(10,n - i);
		}
		for (i = 0;i < n / 2 + 1;i = i + 1)
		{
		t = a[i];
		a[i] = a[n - i];
		a[n - i] = t;
		}
		for (i = 0;i <= n;i = i + 1)
		{
		num = num + a[i] * Math.pow(10,n - i);
		}
		num = num * sign;
		return num;
		}
	}
}

