package <missing>;

public class GlobalMembers
{
	public static int log(int n)
	{
		int i = -1;
		int power = 1;
		while (power < n + 1)
		{
			power = power * 2;
			i = i + 1;
		}
		return i;
	}
	public static void back(int[] a, int n)
	{
		int i;
		a[0] = n;
		for (i = 0;i < log(n) + 1;i++)
		{
			a[i + 1] = a[i] / 2;
		}
	}
	public static void Main()
	{
		int i;
		int m;
		int n;
		int[] a = new int[11];
		int[] b = new int[11];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			n = Integer.parseInt(tempVar2);
		}
		back(a, m);
		back(b, n);

		for (i = 0;i < 12;i++)
		{
			if (a[log(m) - i] == b[log(n) - i] && a[log(m) - 1 - i] != b[log(n) - i - 1])
			{
				System.out.printf("%d\n",a[log(m) - i]);
				break;
			}
		}
	}
}

