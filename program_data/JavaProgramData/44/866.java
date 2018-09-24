package <missing>;

public class GlobalMembers
{
	public static int reverse(int num)
	{
	int y;
	int n;
	int i;
	int temp;
	int[] a = new int[50];
	if (num == 0)
	{
		y = 0;
	}
	else
	{
		temp = num;
		num = Math.abs(num);
		n = (int)Math.log10(num);
		for (i = n;i >= 0;i--)
		{
			a[i] = num / (int)Math.pow(10,i);
			num = num % (int)Math.pow(10,i);
		}
		for (i = 0,y = 0;i <= n;i++)
		{
			y = y + a[i] * (int)Math.pow(10,n - i);
		}
		if (temp < 0)
		{
			y = (-1) * y;
		}
	}
	return (y);
	}

	public static void Main()
	{
	int n;
	int i;
	int[] a = new int[6];
	for (i = 0;i < 6;i++)
	{
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		a[i] = reverse(n);
	}
	for (i = 0;i < 5;i++)
	{
		System.out.printf("%d\n",a[i]);
	}
	System.out.printf("%d",a[i]);
	}
}

