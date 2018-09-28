package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[6];
		int i;
		int j;
		int[] b = new int[6];
		int m;
		int n;
		for (i = 0;i < 6;i++)
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				a[i] = Integer.parseInt(tempVar);
			}
		}
		int reverse = int num;
		for (j = 0;j < 6;j++)
		{
			b[j] = reverse(a[j]);
			System.out.printf("%d\n",b[j]);
		}
		return 0;
	}
	public static int reverse(int num)
	{
		int m;
		int n = 0;
		m = num;
		while (num != 0)
		{
			n = n * 10 + num % 10;
			num /= 10;
		}
		num = n;
		return (num);
	}
}

