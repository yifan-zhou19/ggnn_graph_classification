package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[301];
		int i;
		int n = 1;
		int max;
		int num = 0;
		char c;
		while ((c = System.in.read()) != '\n')
		{
			if (c >= '0' && c <= '9')
			{
				num = num * 10 + c - '0';
			}
			else
			{
				a[n] = num;
				n++;
				num = 0;
			}
		}
		a[n] = num;
		max = a[1];
		for (i = 2;i <= n;i++)
		{
			if (max < a[i])
			{
				max = a[i];
			}
		}
		for (i = 1;i <= n;i++)
		{
			if (a[i] == max)
			{
				a[i] = 0;
			}
		}
		max = a[1];
		for (i = 2;i <= n;i++)
		{
			if (max < a[i])
			{
				max = a[i];
			}
		}
		if (n == 1 || max == 0)
		{
			System.out.print("No\n");
		}
		else
		{
			System.out.printf("%d\n",max);
		}
		return 0;
	}

}
