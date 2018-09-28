package <missing>;

public class GlobalMembers
{
	public static int reverse(int num)
	{

		int n;
		int i;
		int m = 0;
		if (num < 0)
		{
			return -1 * reverse(-num);
		}
		n = Math.log10(num);
		for (i = 0;i < n + 1;i++)
		{
			int j;
			int temp = 1;
			int tempt = 1;
			for (j = 0;j < i;j++)
			{
				temp *= 10;
			}
			for (j = 0;j < n - i;j++)
			{
				tempt *= 10;
			}
			m += ((num % (temp * 10)) / temp) * tempt;
		}
		return m;
	}
	public static void Main()
	{
		int[] a = new int[6];
		int i;
		for (i = 0;i < 6;i++)
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				a[i] = Integer.parseInt(tempVar);
			}
		}
		for (i = 0;i < 6;i++)
		{
			a[i] = reverse(a[i]);
			System.out.printf("%d\n",a[i]);
		}
	}

}

