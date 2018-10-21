package <missing>;

public class GlobalMembers
{
	public static int reverse(int num)
	{
		int[] a = new int[20];
		int i;
		int n;
		int mark = 0;
		if (num > 0)
		{
			mark = 1;
		}
		for (i = 0;;i++)
		{
			a[i] = num % 10;
			num = (num - a[i]) / 10;
			if (num == 0)
			{
				break;
			}
		}
		n = i;

		for (i = 0;i <= (n / 2);i++)
		{
			swap(a[i], a[n - i]);
		}
		for (i = n;i >= 0;i--)
		{
			num = (num + a[i]) * 10;
		}
		num = num / 10;
		return num;
	}
	public static void swap(tangible.RefObject<Integer> a, tangible.RefObject<Integer> b)
	{
		int e;
		e = a.argValue;
		a.argValue = b.argValue;
		b.argValue = e;
	}
	public static int Main()
	{
		int num;
		int i;
		for (i = 0;i < 6;i++)
		{
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			num = Integer.parseInt(tempVar);
		}
		System.out.printf("%d\n",reverse(num));
		}
		return 0;
	}

}

